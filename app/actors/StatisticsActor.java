package actors;

import Models.*;
import play.libs.Json;
import services.StatsService;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.*;
public class StatisticsActor extends AbstractActor {

    static public class StatsInfo {

		public final ArrayList<String> issueTitleList;
        
        public StatsInfo(ArrayList<String> issueTitleList) {
			this.issueTitleList = issueTitleList;
        }
    }
	public static Props getProps() {
		return Props.create(StatisticsActor.class);
	}
	
	
	@Override
	public Receive createReceive() {
		// TODO Auto-generated method stub
		return receiveBuilder()
				.match(StatsInfo.class, this::sendIssueData )
				.build();
	}

    //Change
	private void sendIssueData(StatsInfo si) {
		HashMap<String,Object> send_data = new HashMap<String,Object>();
			//StatsService statsService ;
			StatsService statsService = new StatsService();
			StatsModel stats = statsService.get_Count(si.issueTitleList);

            // for (Map.Entry<String, Integer> entry1 : stats.wordfrequency.entrySet()) {
			// 	System.out.println(entry1.getKey() + " => " + entry1.getValue());
			// }
			System.out.println();
			System.out.println("Data List got");
			System.out.println();
			////////////////////////
			ArrayList<Integer> Isseus_details = statsService.getstatsData();
			System.out.println();
			System.out.println("Stats List got");
			System.out.println();
			//////////////////////////////
			send_data.put("list",stats);
			send_data.put("count",Isseus_details);
			System.out.println(send_data.get("list"));
			System.out.println(send_data.get("count"));
			sender().tell(send_data, self());
	    
		


	}

}
