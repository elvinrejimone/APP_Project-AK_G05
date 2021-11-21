package Models;
/**
 * This class contains the required getter methods
 * to the application's home page.
 *
 * @author Elvin Rejimone, Santhosh Santhanam, Anushka Sharma, Ujjawal Aggarwal, Sejal Chopra
 * @version 1.0.0
 */
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GithubResult{
	public String repoName;
	public String queryString;
	public String repoID;
	public String ownerName;
	ArrayList<String> topics = new ArrayList<>() ;
	JsonNode topiclist;
	
	public GithubResult(String repo, String owner,JsonNode topic,String query, String id){
		
		repoName = repo.substring(1, repo.length()-1);
		ownerName = owner.substring(1, owner.length()-1);;
		topics = new ObjectMapper().convertValue(topic, ArrayList.class);
		queryString= query;
		repoID= id;
	}

	/**
	 * @return repoName
	 */
	public String getRepoName() {
		return repoName;
	}
	
	/**
	 * @return ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	 * @return topics
	 */
	public ArrayList<String> returnTopics(){
		return topics;
	}
}