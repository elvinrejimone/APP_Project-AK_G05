package controllers;


import java.util.ArrayList;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;
import play.libs.ws.WSBodyReadables;
import play.libs.ws.WSBodyWritables;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller implements WSBodyReadables, WSBodyWritables {

    private final AssetsFinder assetsFinder;
    
    String user = "anush97";
    
    ArrayList<String> users = new ArrayList<>();
    //ArrayList<String> repos = new ArrayList<>();
    @Inject WSClient ws = null;
    
    @Inject
    public HomeController(AssetsFinder assetsFinder) {
        this.assetsFinder = assetsFinder;
    }
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(Http.Request request) throws InterruptedException, ExecutionException {
    	System.out.println(request.queryString("search"));
    	if(!request.queryString("search").isPresent()) {
    		return ok(views.html.index.render());
    	}
    	else {
    		System.out.println("https://api.github.com/search/users?q=" + request.queryString("search").get());
    		WSRequest req = ws.url("https://api.github.com/search/users?q=" + request.queryString("search").get());
    		
    		req.setMethod("GET");
    		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
    		JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
    
    		for (JsonNode out : obj) {
    			users.add(out.get("login").toString());
    			System.out.println(out.get("login"));
<<<<<<< HEAD
    			//repos.add(out.get("repos_url").toString());
=======
>>>>>>> 3d5524582d56921078b2de14988948d7cab24492
    			
    		}
    		
    		return ok(views.html.display.render(users));
    	}
        
    }
    public Result names(String names) {
    	return ok("Hii ! "+ names);
    }
    public Result name(String name,String course) {
    	return ok("Hii ! "+ name + " Is your course "+course+ "this?");
    }
//    public Result welcome(String name,String course) {
//    	return ok(welcome.render(name,course)));
//    }
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }
    
    public Result searchUsers(String request) throws InterruptedException, ExecutionException {
    	
		WSRequest req = ws.url("https://api.github.com/search/users?q=" + request);
		req.setMethod("GET");
		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
		JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
		for (JsonNode out : obj) {
			users.add(out.get("login").toString());
			System.out.println(out.get("login"));
		}
		return ok(Json.prettyPrint(obj));
	}
    
	public Result searchCode(String toBeSearched) throws InterruptedException, ExecutionException {
		System.out.println(toBeSearched);
		WSRequest req = ws.url("https://api.github.com/search/code?q=" + toBeSearched + "+user:" + user);
		req.setMethod("GET");
		req.addHeader("ACCEPT", "application/vnd.github.v3+json");
		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
		return ok(Json.toJson(res.toCompletableFuture().get()));
		
	}

}


