package controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.libs.Json;
import play.libs.ws.WSBodyReadables;
import play.libs.ws.WSBodyWritables;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import scala.util.parsing.json.JSONObject;
import models.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller implements WSBodyReadables, WSBodyWritables {

    private final AssetsFinder assetsFinder;
    
    @Inject WSClient ws = null;
    
    List<JsonNode> response = new ArrayList<>();
    
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
    	else 
    	{
    		searchGithub(request.queryString("search").get());
    		
    		//printing the result for now to see the data in front end 
    		//later this data can be used to render 
    		return ok(Json.prettyPrint(Json.toJson(this.response)));
    	}
        
    }
    public Result names(String names) {
    	return ok("Hii ! "+ names);
    }

	public Result name(String name, String course) {
		return ok("Hii ! " + name + " Is your course " + course + "this?");
	}
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }
    
    public void searchGithub(String query) throws InterruptedException, ExecutionException {
    	System.out.println("Query : https://api.github.com/search/repositories?q=" + query);
    	System.out.println();
		WSRequest req = ws.url("https://api.github.com/search/repositories?q=" + query);
		req.setMethod("GET");
		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
		JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
			
		ArrayList<String> records = new ArrayList<String>();
		
		for(JsonNode data:obj) {
			ArrayList<String> jsondata = new ArrayList<String>();
			
			jsondata.add(data.get("name").toString());
			
			jsondata.add(data.get("owner").findPath("login").toPrettyString());
			jsondata.add(data.get("topics").toString());
			records.add(jsondata.toString());
		//System.out.println(data.get("name").toString());
			//System.out.println(data.get("owner").findPath("login"));
			//System.out.println(data.get("topics").toString());
			
		}
		
		
		//converts json object to list
		this.response = new ObjectMapper().convertValue(obj, ArrayList.class);
		
		
		//takes the first 10 search results from the response
		this.response = this.response.stream()
						.limit(10)
						.collect(Collectors.toList());
		
		
	
		for(int i=0;i<10;i++) {
			
			System.out.println(records.get(i));
			System.out.println();
		}
		
	
    }
}