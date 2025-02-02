package Models;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 *
 * @author Elvin Rejimone, Santhosh Santhanam, Anushka Sharma, Ujjawal Aggarwal, Sejal Chopra
 * @version 1.0.0
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;

public class SearchResultHelper{
	
	/**
     * Defining the required paramenters
     */ 
    public ArrayList<String> allSearches = new ArrayList<>();
    LinkedHashMap<String, ArrayList<GithubResult>> allResult = new LinkedHashMap<String, ArrayList<GithubResult>>();
    public HashMap<String, JsonNode> fullSearchData = new HashMap<String, JsonNode>();

    
    
    
	/**
	 * @param query
	 * @param obj
	 * @return allResult
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public LinkedHashMap<String, ArrayList<GithubResult>> getArrayofGithubResult(String query, JsonNode obj) throws InterruptedException, ExecutionException {
		List<GithubResult> records = new ArrayList<GithubResult>();
		System.out.println("Size of Obj :: "+obj.size());
		
		for(JsonNode data:obj) {
			GithubResult result = new GithubResult(data.get("name").toString(),data.get("owner").findPath("login").toPrettyString(),data.get("topics"),query, data.get("id").toString());
			fullSearchData.put(query, obj);
			records.add(result);			
		}
		
		records = records.stream()
				.limit(10)
				.collect(Collectors.toList());
		addToTotalSearchList(query, (ArrayList<GithubResult>) records);
		
		return allResult;
	}
	
	/**
	 * @param query
	 * @param singleRecord
	 * 
	 * Adds the last 10 search queries to the home page
	 */
	public void addToTotalSearchList(String query, ArrayList<GithubResult> singleRecord) {
		
		if(allSearches.contains(query)) {
			allResult.remove(query);
			allSearches.remove(allSearches.indexOf(query));
		}
		
		if(allSearches.size()==10) {
			String removingQuery = allSearches.get(0);
			allResult.remove(removingQuery);
			allSearches.remove(0);
		}
		allSearches.add(query);
		allResult.put(query, singleRecord);
		
	System.out.println(allSearches.toString());
	}

}