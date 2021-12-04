package actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;

import java.util.concurrent.ExecutionException;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;

import play.Logger;
import play.libs.Json;
import Models.RepositoryProfile;
import Models.SearchResultHelper;
import services.RepoProfileService;
import Utils.Cache;

public class RepoProfileActor extends AbstractActor{ 


	static public class RepoProfileInfo{
		public final String queryString;
		public final String repoID;
		public final Cache cache;
		public final RepoProfileService repoService;
		public RepoProfileInfo(String queryString, String repoID, Cache cache,RepoProfileService repoServ) {
			this.queryString = queryString;
			this.repoID = repoID;
			this.cache = cache;
			this.repoService = repoServ;
		}
	}
	
	
	public static Props getProps(RepoProfileService rps) {
		return Props.create(RepoProfileActor.class);
	}
	
	
	@Override
	public Receive createReceive() {
		// TODO Auto-generated method stub
		return receiveBuilder()
				.match(RepoProfileInfo.class, this::sendRepoProfileData )
				.build();
	}
	
	private void sendRepoProfileData(RepoProfileInfo rpi) {
		try {
			
			RepositoryProfile newRepository = new RepositoryProfile(SearchResultHelper.fullSearchData.get(rpi.queryString),rpi.queryString, rpi.repoID);        	
		    System.out.println(rpi.repoService.githubIssueResultHelper(newRepository.issues_URL, newRepository, "Issues", rpi.cache));
		    System.out.println(rpi.repoService.githubIssueResultHelper(newRepository.contributors_URL, newRepository, "Collab", rpi.cache));
		    System.out.println("REPO-ACTOR ::: RepoName ::"+ newRepository.repoName);
		    sender().tell(newRepository, self());
		    
		}
		catch(InterruptedException e) {
			sender().tell(new RepoProfileInfo(rpi.queryString, rpi.repoID, rpi.cache, rpi.repoService), self());
		}
		catch(ExecutionException e) {
			sender().tell(new RepoProfileInfo(rpi.queryString, rpi.repoID, rpi.cache, rpi.repoService), self());
		}


	}
}
