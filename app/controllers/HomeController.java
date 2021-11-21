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
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import scala.util.parsing.json.JSONObject;
import Models.*;
import Utils.Cache;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 *
 * @author Elvin Rejimone, Santhosh Santhanam, Anushka Sharma, Ujjawal Aggarwal, Sejal Chopra
 * @version 1.0.0
 */
public class HomeController extends Controller implements WSBodyReadables, WSBodyWritables {
	 /**
     * Defining the public parameters
     */
    private final AssetsFinder assetsFinder;
    private Cache cache;
    
    @Inject 
	WSClient ws = null;
    Map.Entry<String, Integer> e ;
    JsonNode fullCommitsResult;
    List<JsonNode> response = new ArrayList<>();
    LinkedHashMap<String, ArrayList<GithubResult>> allResultList = new LinkedHashMap<String, ArrayList<GithubResult>>();
    List<String> keysList = new ArrayList<>();
    SearchResultHelper srHelper = new SearchResultHelper();
    CommitsResult cr;
	public ArrayList<String> issueTitleList_controller = new ArrayList<>();
	public ArrayList<String> issue_controller;
	LinkedHashMap<String, ArrayList<GithubResult>> topicResultList = new LinkedHashMap<String, ArrayList<GithubResult>>();
	List<String> topicList = new ArrayList<>();
	TopicResultHelper topicHelper = new TopicResultHelper();
	List<String> userList = new ArrayList<>();
	UserResultHelper userHelper = new UserResultHelper();
	ArrayList<String> al2 ;
	@Inject
    public HomeController(AssetsFinder assetsFinder, Cache cache) {
        this.assetsFinder = assetsFinder;
        this.cache= cache;
    }
    /**
	 * enter new search terms which will result in 10 more results being displayed
	 * @author
     * @param request
     * @return search.scala.html
     * @throws InterruptedException
     * @throws ExecutionException
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
    		keysList.addAll((allResultList.keySet()));
    		Collections.reverse(keysList);
    		return ok(views.html.index.render(allResultList, keysList));
    	}
        
    }
        /**
	 * Search- hit the api and search the for the word
	 * @author 
     * @param query - search string
     * @param type
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public LinkedHashMap<String, ArrayList<GithubResult>> searchGithub(String query,int type) throws InterruptedException, ExecutionException {
    	WSRequest req=null;
    	LinkedHashMap<String, ArrayList<GithubResult>> finalList=null;
		if(type==1) {
			String querytoCheckCache = "https://api.github.com/search/repositories?q=" + query; 
			JsonNode obj = cache.get(querytoCheckCache);
			if(obj!= null) {
				System.out.println("Taking from Cache");
			}else {
				System.out.println("Not Found in Cache, requesting and Storing in Cache");
				System.out.println("Query : https://api.github.com/search/repositories?q=" + query);
		    	System.out.println();
				req = ws.url("https://api.github.com/search/repositories?q=" + query);
				CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
				obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
				cache.put(querytoCheckCache, obj);
			}
			
			finalList= srHelper.getArrayofGithubResult(query, obj);
		}
		else if (type==2) {
			req=ws.url(String.format("https://api.github.com/search/repositories?q=topic:%s&per_page=10&sort=updated",query));
			CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
			JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
			finalList= topicHelper.getArrayofGithubResult(query, obj);
		}
		else if (type==3) {
			req=ws.url(String.format("https://api.github.com/users/%s/repos",query));
			CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
        	JsonNode obj = res.toCompletableFuture().get();
			finalList= userHelper.getUserResult(query, obj);
		}
		return finalList;
    }
    /**
	 * display the 10 latest repositories containing this topic, 
	 * in the same format as the results on the main search page.
	 * @author Sejal Chopra
	 * @param request
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public Result topics(String request) throws InterruptedException, ExecutionException {
			
		topicResultList = searchGithub(request,2);
		topicList.clear();
		topicList.addAll(topicResultList.keySet());
			Collections.reverse(topicList);
			
			return ok(views.html.topic.render(topicResultList, topicList));
		
	    
	}
	/**
	 * Display all available public profile information about a user and the other repositories of that user
	 * @author Ujjawal
     * @param request
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public Result users(String request) throws InterruptedException, ExecutionException {
			
		topicResultList = searchGithub(request,3);
		topicList.clear();
		topicList.addAll(topicResultList.keySet());
			Collections.reverse(topicList);
			return ok(views.html.user.render(topicResultList, topicList));
		
	    
	}
    /**
	 * Repository Profile: all available details for a repository
	 * Display 20 latest issues of that repository with their information
	 * @author Elvin
	 * @param queryString
	 * @param IDString
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public Result repoProfileRequestHandler(String queryString, String IDString) throws InterruptedException, ExecutionException {
		
    	RepositoryProfile newRepository = new RepositoryProfile(srHelper.fullSearchData.get(queryString),queryString, IDString);        	
	    System.out.println(githubIssueResultHelper(newRepository.issues_URL, newRepository, "Issues"));
	    System.out.println(githubIssueResultHelper(newRepository.contributors_URL, newRepository, "Collab"));

		issueTitleList_controller = newRepository.issueTitleList;
		
		return ok(views.html.repodetails.render(newRepository));
    
    }
	/**
	 * Fetching repository's issue details
	 * @author Elvin
	 * @param query
	 * @param rp
	 * @param Option
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public boolean githubIssueResultHelper(String query, RepositoryProfile rp, String Option) throws InterruptedException, ExecutionException {
		System.out.println("Query : " + query);
		
		JsonNode obj = cache.get(query);
		if(obj!= null) {
			System.out.println("Taking from Cache");
		}else {
			System.out.println("Not Available In Cache, Query Github API and Storing Result in Cache");
			WSRequest req = ws.url(query);
			req.setMethod("GET");
			CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
			obj = Json.toJson(res.toCompletableFuture().get());
			cache.put(query, obj);
		}
		return rp.getDataFromResult(obj, Option);
	}
		
	/**
	 * Initialised issue page with words statistics and further stats
	 * @author Anushka Sharma
	 * @param request
	 * @param TitleList - list of titles
	 * @param issue_controller -storing the keys(words in titlelist)
	 * @param stats - words count
	 * @param Isseus_details - more statistical data of words
	 * @return word statistics of issues titles
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	// Issues
	public Result issues(Http.Request request) throws InterruptedException, ExecutionException {
		issue_controller =new ArrayList<>(); 
		// for (String i : al2){
		// 	System.out.println("*******");
		// 	System.out.println(i);
		// }
		//return ok(views.html.issuesstats.render(Isseus_details,issue_controller,stats.wordfrequency));
		if(issueTitleList_controller.isEmpty())
			return ok(views.html.no_issues.render());
			
			else {
				
			ArrayList<String> TitleList = issueTitleList_controller;
			StatisticsInfo obj = new StatisticsInfo();
			StatsModel stats = obj.Calculate_Count(TitleList);
			//System.out.println(stats.wordfrequency.getkeys());
			for( Map.Entry<String, Integer> entry1 : stats.wordfrequency.entrySet() ){
				System.out.println( entry1.getKey() + " => " + entry1.getValue() );
			}
			ArrayList<Integer> Isseus_details = obj.Calculate_Stats();

			Iterator iterator = stats.wordfrequency.keySet().iterator();
			while(iterator.hasNext()){
			Object key   = iterator.next();
			issue_controller.add((String)key);
		 }
		 int total_issues = TitleList.size();
			return ok(views.html.issuesstats.render(Isseus_details,issue_controller,stats.wordfrequency));
			}
				
	}
	/**
	 * 
	 * @author Santhosh
	 * @throws InterruptedException
	 * @param ownerName
	 * @param repoName
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
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
	/**
	 * 
	 * @author Santhosh
	 * @param url
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	 public void get_full_commits_data(String url) throws InterruptedException, ExecutionException {
		 	System.out.println("Query : " + url);
			
			fullCommitsResult = cache.get(url);
			if(fullCommitsResult!= null) {
				System.out.println("Taking from Cache");
			}else {
				
			System.out.println("Not Available In Cache, Query Github API and Storing Result in Cache");
	    	WSRequest req = ws.url(url).addHeader("Authorization", "token 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");
	    	req.addQueryParameter("per_page", "100");
	    	req.addQueryParameter("page", "1");
			req.setMethod("GET");
			CompletionStage<JsonNode> resFromRequest = req.get().thenApply(result -> result.asJson());
			fullCommitsResult = Json.toJson(resFromRequest.toCompletableFuture().get());
			cache.put(url, fullCommitsResult);
			}
	    }
	





    
}
