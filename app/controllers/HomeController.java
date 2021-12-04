package controllers;

import static akka.pattern.Patterns.ask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import Models.CommitsResult;
import Models.GithubResult;
import Models.RepositoryProfile;
import Models.SearchResultHelper;
import Models.StatisticsInfo;
import Models.StatsModel;
import Models.TopicResultHelper;
import Models.UserResultHelper;
import Utils.Cache;
import actors.CommitsActor;
import actors.CommitsActor.CommitInfo;
import actors.RepoProfileActor;
import actors.RepoProfileActor.RepoProfileInfo;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.stream.Materializer;
import play.libs.Json;
import play.libs.ws.WSBodyReadables;
import play.libs.ws.WSBodyWritables;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import scala.compat.java8.FutureConverters;
import services.CommitService;
import services.RepoProfileService;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 *
 * @author Elvin Rejimone, Santhosh Santhanam, Anushka Sharma, Ujjawal Aggarwal,
 *         Sejal Chopra
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
	Map.Entry<String, Integer> e;
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
	ArrayList<String> al2;
	public Map<String, Integer> result = new LinkedHashMap<>();
	@Inject
	RepoProfileService repoService = new RepoProfileService(ws);
	@Inject
	CommitService commitService = new CommitService(ws);

	@Inject
	private ActorSystem actorSystem;
	@Inject
	private Materializer materializer;

	ActorRef repoProfileActor;
	ActorRef commitsActor;

	public HomeController() {
		this.assetsFinder = null;
	}

	@Inject
	public HomeController(AssetsFinder assetsFinder, Cache cache, ActorSystem system) {
		this.assetsFinder = assetsFinder;
		this.cache = cache;
		repoProfileActor = system.actorOf(RepoProfileActor.getProps(repoService));
		commitsActor = system.actorOf(CommitsActor.getProps(commitService));
	}

	/**
	 * enter new search terms which will result in 10 more results being displayed
	 * 
	 * @author Santhosh Santhanam
	 * @author Elvin Rejimone
	 * @author Anushka Sharma
	 * @author Ujjawal Agarwal
	 * @author Sejal Chopra
	 * @param request Http request parameter
	 * @return search.scala.html
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public Result index(Http.Request request) throws InterruptedException, ExecutionException {
		System.out.println(request.queryString("search"));

		if (!request.queryString("search").isPresent()) {
			return ok(views.html.index.render(allResultList, keysList));
		} else {
			allResultList = searchGithub(request.queryString("search").get(), 1);
			keysList.clear();
			keysList.addAll((allResultList.keySet()));
			Collections.reverse(keysList);
			return ok(views.html.index.render(allResultList, keysList));
		}

	}

	/**
	 * Search- hit the api and search the for the word
	 * 
	 * @author Santhosh Santhanam
	 * @author Elvin Rejimone
	 * @param query - search string
	 * @param type  To identify the API call
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public LinkedHashMap<String, ArrayList<GithubResult>> searchGithub(String query, int type)
			throws InterruptedException, ExecutionException {
		WSRequest req = null;
		LinkedHashMap<String, ArrayList<GithubResult>> finalList = null;
		if (type == 1) {
			String querytoCheckCache = "https://api.github.com/search/repositories?q=" + query;
			JsonNode obj = cache.get(querytoCheckCache);
			if (obj != null) {
				System.out.println("Taking from Cache");
			} else {
				System.out.println("Not Found in Cache, requesting and Storing in Cache");
				System.out.println("Query : https://api.github.com/search/repositories?q=" + query);
				System.out.println();
				req = ws.url("https://api.github.com/search/repositories?q=" + query);
				CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
				obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
				cache.put(querytoCheckCache, obj);
			}

			finalList = srHelper.getArrayofGithubResult(query, obj);
		} else if (type == 2) {
			req = ws.url(String.format("https://api.github.com/search/repositories?q=topic:%s&per_page=10&sort=updated",
					query));
			CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
			JsonNode obj = Json.toJson(res.toCompletableFuture().get().findPath("items"));
			finalList = topicHelper.getArrayofGithubResult(query, obj);
		} else if (type == 3) {
			req = ws.url(String.format("https://api.github.com/users/%s/repos", query));
			CompletionStage<JsonNode> res = req.get().thenApply(r -> r.asJson());
			JsonNode obj = res.toCompletableFuture().get();
			finalList = userHelper.getUserResult(query, obj);
		}
		return finalList;
	}

	/**
	 * display the 10 latest repositories containing this topic, in the same format
	 * as the results on the main search page.
	 * 
	 * @author Sejal Chopra
	 * @param request Http request parameter
	 * @return views.html.topic
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public Result topics(String request) throws InterruptedException, ExecutionException {

		topicResultList = searchGithub(request, 2);
		topicList.clear();
		topicList.addAll(topicResultList.keySet());
		Collections.reverse(topicList);

		return ok(views.html.topic.render(topicResultList, topicList));

	}

	/**
	 * Display all available public profile information about a user and the other
	 * repositories of that user
	 * 
	 * @author Ujjawal
	 * @param request
	 * @return Users details
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public Result users(String request) throws InterruptedException, ExecutionException {

		topicResultList = searchGithub(request, 3);
		topicList.clear();
		topicList.addAll(topicResultList.keySet());
		Collections.reverse(topicList);
		return ok(views.html.user.render(topicResultList, topicList));

	}

	/**
	 * Repository Profile: all available details for a repository Display 20 latest
	 * issues of that repository with their information
	 * 
	 * @author Elvin Rejimone
	 * @param queryString
	 * @param IDString
	 * @return Return result object
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public CompletionStage<Result> repoProfileRequestHandler(String queryString, String IDString)
			throws InterruptedException, ExecutionException {
		return FutureConverters
				.toJava(ask(repoProfileActor, new RepoProfileInfo(queryString, IDString, cache, repoService), 10000))
				.thenApply(response -> {
					RepositoryProfile repoProfile = (RepositoryProfile) response;
					issueTitleList_controller = repoProfile.issueTitleList;
					return ok(views.html.repodetails.render(repoProfile));
				});
	}

	/**
	 * Initialised issue page with words statistics and further stats
	 * 
	 * @author Anushka Sharma
	 * @param request
	 * @return word statistics of issues titles
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	// Issues
	public Result issues() throws InterruptedException, ExecutionException {
		issue_controller = new ArrayList<>();
		// for (String i : al2){
		// System.out.println("*******");
		// System.out.println(i);
		// }
		// return
		// ok(views.html.issuesstats.render(Isseus_details,issue_controller,stats.wordfrequency));
		if (issueTitleList_controller.isEmpty())
			return ok(views.html.no_issues.render());

		else {

			ArrayList<String> TitleList = issueTitleList_controller;
			StatisticsInfo obj = new StatisticsInfo();
			StatsModel stats = obj.Calculate_Count(TitleList);
			// System.out.println(stats.wordfrequency.getkeys());
			for (Map.Entry<String, Integer> entry1 : stats.wordfrequency.entrySet()) {
				System.out.println(entry1.getKey() + " => " + entry1.getValue());
			}
			ArrayList<Integer> Isseus_details = obj.Calculate_Stats();

			Iterator iterator = stats.wordfrequency.keySet().iterator();
			while (iterator.hasNext()) {
				Object key = iterator.next();
				issue_controller.add((String) key);
			}
			int total_issues = TitleList.size();
			return ok(views.html.issuesstats.render(Isseus_details, issue_controller, stats.wordfrequency));
		}

	}

	/**
	 * Commits function to calculate the statistics for a repositories commits
	 * 
	 * @author Santhosh Santhanam
	 * @param user Owner name of the repository owner
	 * @param repo Repository name
	 * @return Completion stage of result containing commits statistics
	 * @throws Exception
	 */
	public CompletionStage<Result> commits(String user, String repo) throws Exception {
		List<String> commitKeysList = new ArrayList<>();
		/*
		 * CompletableFuture<List<CommitsResult>> topCommiters =
		 * commitService.getCommitsData(user, repo); List<CommitsResult> topTen =
		 * topCommiters.toCompletableFuture().get().parallelStream() .map(c -> new
		 * CommitsResult(c.get_user_name(), c.get_additions(), c.get_deletions()))
		 * .collect(Collectors.toList()); result =
		 * topTen.parallelStream().collect(Collectors.toMap(w -> w.get_user_name(), w ->
		 * 1, Integer::sum)); result =
		 * result.entrySet().stream().sorted((Map.Entry.<String,
		 * Integer>comparingByValue().reversed())).limit(10)
		 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) ->
		 * e1, LinkedHashMap::new)); Iterator<String> iterator =
		 * result.keySet().iterator(); while (iterator.hasNext()) { Object commitKey =
		 * iterator.next(); commitKeysList.add((String) commitKey); } int size =
		 * topCommiters.toCompletableFuture().get().size();
		 * System.out.println("LAST VALUE: " +
		 * topCommiters.toCompletableFuture().get().get(size - 1)); return
		 * ok(views.html.commits.render(topCommiters.toCompletableFuture().get().get(
		 * size - 1), commitKeysList, result));
		 */
		return FutureConverters.toJava(ask(commitsActor, new CommitInfo(user, repo, commitService), 1000000))
				.thenApplyAsync(response -> {
					List<CommitsResult> topCommiters = (List<CommitsResult>) response;
					List<CommitsResult> topTen = topCommiters.parallelStream()
							.map(c -> new CommitsResult(c.get_user_name(), c.get_additions(), c.get_deletions()))
							.collect(Collectors.toList());
					result = topTen.parallelStream()
							.collect(Collectors.toMap(w -> w.get_user_name(), w -> 1, Integer::sum));
					result = result.entrySet().stream()
							.sorted((Map.Entry.<String, Integer>comparingByValue().reversed())).limit(10)
							.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
									LinkedHashMap::new));
					Iterator<String> iterator = result.keySet().iterator();
					while (iterator.hasNext()) {
						Object commitKey = iterator.next();
						commitKeysList.add((String) commitKey);
					}
					int size = topCommiters.size();
					return ok(views.html.commits.render(topCommiters.get(size - 1), commitKeysList, result));
				});
	}

}
