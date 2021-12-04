package actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;

import play.Logger;
import play.libs.Json;
import Models.GithubResult;
import Models.RepositoryProfile;
import Models.SearchResultHelper;
import services.RepoProfileService;
import Utils.Cache;
import actors.RepoProfileActor.RepoProfileInfo;

public class SearchResultActor extends AbstractActor{ 


	static public class SearchResultInfo{
		public final String queryString;
		public final Cache cache;
		public final SearchResultHelper srHelper;
		public SearchResultInfo(String queryString, Cache cache, SearchResultHelper srHelper) {
			this.queryString = queryString;
			this.cache = cache;	
			this.srHelper = srHelper;
		}
	}
	
	
	public static Props getProps() {
		return Props.create(SearchResultActor.class);
	}
	
	
	@Override
	public Receive createReceive() {
		// TODO Auto-generated method stub
		return receiveBuilder()
				.match(SearchResultInfo.class, this::sendSearchResults )
				.build();
	}
	
	private void sendSearchResults(SearchResultInfo sri) {
		try {
			LinkedHashMap<String, ArrayList<GithubResult>> allResultList = new LinkedHashMap<String, ArrayList<GithubResult>>();
			System.out.println("Inside SearchActor:: Key ="+ sri.queryString);
			if(sri.queryString.equals("none")) {
				 sender().tell(allResultList, self());
			}else {
				allResultList = sri.srHelper.searchGithub(sri.queryString, sri.cache);					
			    System.out.println("SearchResult-ACTOR ::: KeySet ::"+ allResultList.keySet());
			    sender().tell(allResultList, self());
			}
			
		    
		}
		catch(InterruptedException e) {
			sender().tell(new SearchResultInfo(sri.queryString, sri.cache, sri.srHelper), self());
		}
		catch(ExecutionException e) {
			sender().tell(new SearchResultInfo(sri.queryString, sri.cache, sri.srHelper), self());
		}


	}
}
