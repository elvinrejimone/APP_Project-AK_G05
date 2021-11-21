package Models;

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

/**
 * Class with functions and parameters to facilitate Searched Data Processing and Creation of GithubResult
 * @author Elvin Rejimone
 *
 */
public class SearchResultHelper{
	
	  
    public ArrayList<String> allSearches = new ArrayList<>();
    LinkedHashMap<String, ArrayList<GithubResult>> allResult = new LinkedHashMap<String, ArrayList<GithubResult>>();
    public HashMap<String, JsonNode> fullSearchData = new HashMap<String, JsonNode>();

    
     
	/**
	 * Function that takes Response Object of type JsonNode and creates the List of GithubResult Objects and appends it to allResult and FullSearchData .
	 * It returns allResult of Type LinkedHashMap<String, ArrayList<GithubResult>>
	 * @param query
	 * @param obj
	 * @return LinkedHashMap<String, ArrayList<GithubResult>> allResult
	 * @throws InterruptedException
	 * @throws ExecutionException
	 * @author Elvin Rejimone
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
		System.out.println(allResult);
		return allResult;
	}
	
	/**
	 * Function to add a GithubResult object to search result variable allResult and limit it to 10 results in total
	 * Also checks for duplicated result and overwrites it in the correct position
	 * @param query
	 * @param singleRecord
	 *  @author Elvin Rejimone
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