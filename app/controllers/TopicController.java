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
public class TopicController extends Controller implements WSBodyReadables, WSBodyWritables {

    private final AssetsFinder assetsFinder;
    
    
    @Inject WSClient ws = null;
    
    List<JsonNode> response = new ArrayList<>();
    HashMap<String, ArrayList<GithubResult>> allResultList = new HashMap<String, ArrayList<GithubResult>>();
    List<String> keysList = new ArrayList<>();
    SearchResultHelper srHelper = new SearchResultHelper();
    
    @Inject
    public TopicController(AssetsFinder assetsFinder) {
        this.assetsFinder = assetsFinder;
    }
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result topics(String request) throws InterruptedException, ExecutionException {
    		
    		allResultList = searchGithub(request);
    		keysList.clear();
    		keysList.addAll(allResultList.keySet());

    		return ok(views.html.topic.render(allResultList, keysList));
    	
        
    }
    
    public HashMap<String, ArrayList<GithubResult>> searchGithub(String query) throws InterruptedException, ExecutionException {
    	System.out.println(String.format("https://api.github.com/search/repositories?q=topic:%s&per_page=10&sort=updated",query));
    	System.out.println();
		WSRequest req = ws.url(String.format("https://api.github.com/search/repositories?q=topic:%s&per_page=10&sort=updated",query));
		req.setMethod("GET");
		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
		JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
		return srHelper.getArrayofGithubResult(query, obj);
    }
    
}