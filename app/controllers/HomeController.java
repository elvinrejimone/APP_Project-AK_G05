package controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Models.GithubResult;
import Models.RepositoryProfile;
import Models.SearchResultHelper;
import Models.TopicResultHelper;
import play.libs.Json;
import play.libs.ws.WSBodyReadables;
import play.libs.ws.WSBodyWritables;
import play.libs.ws.WSRequest;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import scala.util.parsing.json.JSONObject;
import Models.*;
import Utils.Cache;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller implements WSBodyReadables, WSBodyWritables {

    private final AssetsFinder assetsFinder;
    
    
    @Inject WSClient ws = null;
    Map.Entry<String, Integer> e ;
    JsonNode fullCommitsResult;
    List<JsonNode> response = new ArrayList<>();
    LinkedHashMap<String, ArrayList<GithubResult>> allResultList = new LinkedHashMap<String, ArrayList<GithubResult>>();
    List<String> keysList = new ArrayList<>();
    SearchResultHelper srHelper = new SearchResultHelper();
    CommitsResult cr;
	public ArrayList<String> issueTitleList_controller = new ArrayList<>();
	LinkedHashMap<String, ArrayList<GithubResult>> topicResultList = new LinkedHashMap<String, ArrayList<GithubResult>>();
	List<String> topicList = new ArrayList<>();
	TopicResultHelper topicHelper = new TopicResultHelper();
	ArrayList<String> al2 ;
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
    	boolean str = request.queryString("search").isPresent();
		if(!request.queryString("search").isPresent()) {
    		return ok(views.html.index.render(allResultList, keysList, str));
    	}
    	else 
    	{	
    		allResultList = searchGithub(request.queryString("search").get(),1);
    		keysList.clear();
    		keysList.addAll((allResultList.keySet()));
    		Collections.reverse(keysList);
//    		return ok(Json.prettyPrint(Json.toJson(this.response)));
    		return ok(views.html.index.render(allResultList, keysList,str));
    	}
        
    }
    
    public LinkedHashMap<String, ArrayList<GithubResult>> searchGithub(String query,int type) throws InterruptedException, ExecutionException {
    	System.out.println("Query : https://api.github.com/search/repositories?q=" + query);
    	System.out.println();
    	WSRequest req=null;
    	LinkedHashMap<String, ArrayList<GithubResult>> finalList=null;
		if(type==1) {
			req = ws.url("https://api.github.com/search/repositories?q=" + query);
			CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
			JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
			finalList= srHelper.getArrayofGithubResult(query, obj);
		}
		else if (type==2) {
			req=ws.url(String.format("https://api.github.com/search/repositories?q=topic:%s&per_page=10&sort=updated",query));
			CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
			JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
			finalList= topicHelper.getArrayofGithubResult(query, obj);
		}
		return finalList;
    }
    
	public Result topics(String request) throws InterruptedException, ExecutionException {
			
		topicResultList = searchGithub(request,2);
		topicList.clear();
		topicList.addAll(topicResultList.keySet());
			Collections.reverse(topicList);
			return ok(views.html.topic.render(topicResultList, topicList));
		
	    
	}
    
    
	
public Result repoProfileRequestHandler(String queryString, String IDString) throws InterruptedException, ExecutionException {
		
    	RepositoryProfile newRepository = new RepositoryProfile(srHelper.fullSearchData.get(queryString),queryString, IDString);        	
	    System.out.println(githubIssueResultHelper(newRepository.issues_URL, newRepository, "Issues"));
	    System.out.println(githubIssueResultHelper(newRepository.contributors_URL, newRepository, "Collab"));

		issueTitleList_controller = newRepository.issueTitleList;
		
		return ok(views.html.repodetails.render(newRepository));
    
    }
	
	public boolean githubIssueResultHelper(String query, RepositoryProfile rp, String Option) throws InterruptedException, ExecutionException {
		System.out.println("Query : " + query);
		WSRequest req = ws.url(query);
		req.setMethod("GET");
		CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
		JsonNode obj = Json.toJson(res.toCompletableFuture().get());
		return rp.getDataFromResult(obj, Option);
	}
	// Issues
	public Result issues(Http.Request request) throws InterruptedException, ExecutionException {
		ArrayList<String> TitleList = issueTitleList_controller;
		StatisticsInfo obj = new StatisticsInfo(TitleList);
		StatsModel stats = obj.Calculate_Count(TitleList);
		//System.out.println(stats.wordfrequency.getkeys());
		for( Map.Entry<String, Integer> entry1 : stats.wordfrequency.entrySet() ){
			System.out.println( entry1.getKey() + " => " + entry1.getValue() );
		}
		ArrayList<Integer> Isseus_details = obj.Calculate_Stats();
		int s = Isseus_details.get(4);
		Iterator iterator = stats.wordfrequency.keySet().iterator();
		while(iterator.hasNext()){
		  Object key   = iterator.next();
		issueTitleList_controller.add((String)key); 
		int total_issues = TitleList.size();
		al2 = new ArrayList<String>(issueTitleList_controller.subList(total_issues,issueTitleList_controller.size()-1));
		 }
		// for (String i : al2){
		// 	System.out.println("*********************");
		// 	System.out.println(i);
		// }
		return ok(views.html.issuesstats.render(Isseus_details,s,al2,stats.wordfrequency));
	}
	
	public Result commits(String ownerName, String repoName) throws InterruptedException, ExecutionException {
		List<Integer> AddList = new ArrayList<>();
		List<Integer> DelList = new ArrayList<>();
		List<CommitsResult> topCommiters = new ArrayList<>();
		List<String> commitKeysList = new ArrayList<>();
		Optional<Integer> maxAdd, maxDel, minAdd, minDel, avgAdd, avgDel;
		String commitUrl = "https://api.github.com/repos" + "/" + ownerName + "/" + repoName + "/commits";
		get_full_commits_data(commitUrl);
		List<String> shaList = new ArrayList<>();
		for (JsonNode sha : fullCommitsResult) {
			shaList.add(sha.get("sha").toString().replaceAll("^\"|\"$", ""));
		}
		System.out.println("Sha size: " + shaList.size());
		for (int i = 0; i < shaList.size(); i++) {
			WSRequest req = ws.url(commitUrl + "/" + shaList.get(i)).addHeader("Authorization", "token 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");
			req.setMethod("GET");
			CompletionStage<JsonNode> resFromRequest = req.get().thenApply(result -> result.asJson());
			JsonNode temp = resFromRequest.toCompletableFuture().get();
			AddList.add(temp.get("stats").findPath("additions").asInt());
			DelList.add(temp.get("stats").findPath("deletions").asInt());
			maxAdd = AddList.stream().max(Integer::compare);
			minAdd = AddList.stream().min(Integer::compare);
			avgAdd = Optional.of(AddList.stream().reduce(0, Integer::sum) / shaList.size());
			maxDel = DelList.stream().max(Integer::compare);
			minDel = DelList.stream().min(Integer::compare);
			avgDel = Optional.of(DelList.stream().reduce(0, Integer::sum) / shaList.size());
			cr = new CommitsResult(
					temp.get("author").findPath("avatar_url").asText(),
					temp.get("author").findPath("login").asText(),
					temp.get("commit").findPath("message").asText(),
					temp.get("stats").findPath("additions").asText(),
					temp.get("stats").findPath("deletions").asText(),
					temp.get("stats").findPath("total").asText(),
					maxAdd,
					minAdd,
					maxDel, 
					minDel,
					avgAdd,
					avgDel
					);
			topCommiters.add(cr);
		}
		List<CommitsResult> topTen = topCommiters.parallelStream()
				.map(c -> new CommitsResult(c.get_user_name(), c.get_additions(), c.get_deletions()))
				.collect(Collectors.toList());
		Map<String, Integer> result = new LinkedHashMap<>();
		result = topTen.parallelStream().collect(Collectors.toMap(w -> w.get_user_name(), w -> 1, Integer :: sum));
		result = result.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(result);
		Iterator<String> iterator = result.keySet().iterator();
		while(iterator.hasNext()){
		  Object commitKey = iterator.next();
		  commitKeysList.add((String)commitKey); 
		}
		return ok(views.html.commits.render(cr, commitKeysList, result));
		
	}
	
	 public void get_full_commits_data(String url) throws InterruptedException, ExecutionException {
	    	WSRequest req = ws.url(url).addHeader("Authorization", "token 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");
	    	req.addQueryParameter("per_page", "100");
	    	req.addQueryParameter("page", "1");
			req.setMethod("GET");
			CompletionStage<JsonNode> resFromRequest = req.get().thenApply(result -> result.asJson());
			fullCommitsResult = Json.toJson(resFromRequest.toCompletableFuture().get());
	    }
	





    
}
