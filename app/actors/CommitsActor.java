package actors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.*;

import javax.inject.Inject;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import Models.CommitsResult;
import play.libs.ws.WSClient;
import services.CommitService;

public class CommitsActor extends AbstractActor {

	static public class CommitInfo {
		public final String username;
		public final String reponame;
		CommitService cService;

		public CommitInfo(String username, String reponame, CommitService cService) {
			this.username = username;
			this.reponame = reponame;
			this.cService = cService;
		}
	}

	private final CommitService commitService;

	@Inject
	public CommitsActor(CommitService commitService) {
		this.commitService = commitService;
	}

	public static Props getProps(CommitService cs) {
		return Props.create(CommitsActor.class, () -> new CommitsActor(cs));
	}

	@Override
	public Receive createReceive() {
		// TODO Auto-generated method stub
		return receiveBuilder().match(CommitInfo.class, this::sendCommitsData).build();
	}

	private void sendCommitsData(CommitInfo cInfo) {
		try {
			CompletionStage<List<CommitsResult>> cData = cInfo.cService.getCommitsData(cInfo.username, cInfo.reponame);
			System.out.println("Output from Commits ACTOR!!");
			sender().tell(cData.toCompletableFuture().get(), self());
		} catch (InterruptedException e) {
			sender().tell(new CommitsResult(), self());
		} catch (ExecutionException e) {
			sender().tell(new CommitsResult(), self());
		}
	}

}
