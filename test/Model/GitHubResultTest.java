package Model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

public class GitHubResultTest {

	public JsonNode topicsList;
	public String topicListString = "[\"eclipseiot\",\"home-automation\",\"internet-of-things\",\"iot\",\"java\",\"smarthome\"]";
		
	@BeforeClass
	public void setupForTesting() {
		topicsList =  Json.parse(topicListString);
		System.out.println(topicsList);
	}
	
//	@Test
//	public void testGithubResultFunctions() {
//		GithubResult GR1 = new GithubResult()
//	}
}
