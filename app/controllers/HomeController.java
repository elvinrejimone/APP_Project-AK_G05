package controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Models.GithubResult;
import Models.SearchResultHelper;
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
    HashMap<String, ArrayList<GithubResult>> allResultList = new HashMap<String, ArrayList<GithubResult>>();
    List<String> keysList = new ArrayList<>();
    SearchResultHelper srHelper = new SearchResultHelper();
    
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
    		return ok(views.html.index.render(allResultList, keysList));
    	}
    	else 
    	{	
    		allResultList = searchGithub(request.queryString("search").get(),1);
    		keysList.clear();
    		keysList.addAll(allResultList.keySet());
//    		return ok(Json.prettyPrint(Json.toJson(this.response)));
    		return ok(views.html.index.render(allResultList, keysList));
    	}
        
    }
    
    public HashMap<String, ArrayList<GithubResult>> searchGithub(String query,int type) throws InterruptedException, ExecutionException {
    	System.out.println("Query : https://api.github.com/search/repositories?q=" + query);
    	System.out.println();
    	WSRequest req=null;
		if(type==1) 
			req = ws.url("https://api.github.com/search/repositories?q=" + query);
		else if (type==2)
			req=ws.url(String.format("https://api.github.com/search/repositories?q=topic:%s&per_page=10&sort=updated",query));

		req.setMethod("GET");
		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
		JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
		return srHelper.getArrayofGithubResult(query, obj);
    }
    
public Result topics(String request) throws InterruptedException, ExecutionException {
		
		allResultList = searchGithub(request,2);
		keysList.clear();
		keysList.addAll(allResultList.keySet());

		return ok(views.html.topic.render(allResultList, keysList));
	
    
}

    
}