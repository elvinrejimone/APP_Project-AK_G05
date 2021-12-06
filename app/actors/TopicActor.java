package actors;


import play.shaded.ahc.org.asynchttpclient.*;
import play.libs.ws.ahc.*;
import akka.stream.Materializer;
import play.libs.ws.WSRequest;
import java.time.LocalDateTime;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import play.libs.ws.WSClient;
import scala.concurrent.duration.Duration;
import play.libs.Json;
import akka.actor.AbstractActorWithTimers;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import akka.actor.ActorRef;
import javax.inject.Inject;
import akka.actor.Props;
//import controllers.JsonNode;
//import controllers.WSRequest;
import play.Logger;
import play.libs.Json;
import java.util.HashSet;


import java.util.Set;



public class TopicActor extends AbstractActorWithTimers{
	@com.google.inject.Inject WSClient wsTopic; 
	private Set<ActorRef> userActors;
	public String topicName;
	private static final class Tick{
	}

	static public class RegisterMsg{

	}

	static public Props getProps() {
		
		return Props.create(TopicActor.class, () -> new TopicActor());

	}

	

	private TopicActor() {

		this.userActors = new HashSet<>();
		Logger.info("TopicActor {} started",self());

	}

	

	@Override

	public void preStart() {

		Logger.info("TopicActor {} started",self());
		getTimers().startPeriodicTimer("Timer", new Tick(), Duration.create(5, TimeUnit.SECONDS));
	}
	@Override

	public Receive createReceive() {

		return receiveBuilder()
				.match(Tick.class,msg -> notifyClients())
				.match(RegisterMsg.class, msg -> userActors.add(sender()))
				.build();

	}

	

	private void notifyClients() throws Exception,InterruptedException, ExecutionException {
//		WSClient ws = null;
//		WSRequest req=ws.url(String.format("https://api.github.com/search/repositories?q=topic:%s&per_page=10&sort=updated","java"));
//		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
//		JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
//		
//		String jsonString = "{\"k1\":\"v1\",\"k2\":\"v2\"}";
//		ObjectMapper mapper = new ObjectMapper();
//		JsonNode obj = mapper.readTree(jsonString);
//		
//		UserActor.TimeMessage tMsg = new UserActor.TimeMessage(obj);
//
//		userActors.forEach(ar -> ar.tell(tMsg, self()));
		AsyncHttpClientConfig asyncHttpClientConfig =
				new DefaultAsyncHttpClientConfig.Builder()
				.setMaxRequestRetry(0)
				.setShutdownQuietPeriod(0)
				.setShutdownTimeout(0)
				.build();
		AsyncHttpClient asyncHttpClient = new DefaultAsyncHttpClient(asyncHttpClientConfig);
		WSClient client = new AhcWSClient(asyncHttpClient, Materializer.matFromSystem(context().system()));
		WSRequest req = client.url(String.format("https://api.github.com/search/repositories?q=topic:%s&per_page=10&sort=updated","java"));
		//JsonNode j = req.get().thenApply(r-> r.getBody(json())).toCompletableFuture().get();
		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
		JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
		
		
		UserActor.TimeMessage tMsg = new UserActor.TimeMessage(obj);
		userActors.forEach(ar -> ar.tell(tMsg, self()));
	}



}
