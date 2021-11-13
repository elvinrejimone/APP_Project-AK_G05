package Models;

import java.util.ArrayList;
import java.util.HashMap;
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
	
	  
    public ArrayList<String> allSearches = new ArrayList<>();
    HashMap<String, ArrayList<GithubResult>> allResult = new HashMap<String, ArrayList<GithubResult>>();
    
    
    
	public HashMap<String, ArrayList<GithubResult>> getArrayofGithubResult(String query, JsonNode obj) throws InterruptedException, ExecutionException {
		List<GithubResult> records = new ArrayList<GithubResult>();
		System.out.println("Size of Obj :: "+obj.size());
		
		for(JsonNode data:obj) {
			GithubResult result = new GithubResult(data.get("name").toString(),data.get("owner").findPath("login").toPrettyString(),data.get("topics"));
			records.add(result);			
		}
		
		records = records.stream()
				.limit(10)
				.collect(Collectors.toList());
		addToTotalSearchList(query, (ArrayList<GithubResult>) records);
		
		return allResult;
	}
	
	public void addToTotalSearchList(String query, ArrayList<GithubResult> singleRecord) {
		if(!allSearches.contains(query)) {
			if(allSearches.size()==10) {
				String removingQuery = allSearches.get(0);
				allResult.remove(removingQuery);
				allSearches.remove(0);
			}
			allSearches.add(query);
			allResult.put(query, singleRecord);
		}
	System.out.println(allSearches.toString());
	}

}