package Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import Models.GithubResult;

public class Cache {
	private Map<String,List<GithubResult>> cache;
		public Cache() { 
			cache = new HashMap<>();
		}
		public void put(String key,List<GithubResult> issues) {
			cache.putIfAbsent(key, issues);
		}
		public List<GithubResult> get(String key){
			return cache.getOrDefault(key,new ArrayList<>());
		}	
		public CompletionStage<List<GithubResult>> getOrElseUpdate(String key,Callable<CompletionStage<List<GithubResult>>> block){
			if(!this.get(key).isEmpty()) {
				return CompletableFuture.supplyAsync(()-> this.get(key));
			}else {
				try {
					return block.call().thenApplyAsync(issues->{	
						this.put(key, issues);
						return issues;
					});
				} catch (Exception e) {
					e.printStackTrace();
					return CompletableFuture.supplyAsync(()-> new ArrayList<>());
				}
			}
		}
	}
