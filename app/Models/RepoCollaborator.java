package Models;

public class RepoCollaborator{
	
	public String ContributorName;
	public String ContributorID;
	public String ContributorContributions;
	public String ContributorAvatarURL;

	
	public RepoCollaborator(String name, String id, String contributions, String avatar) {
		ContributorName = name.substring(1, name.length()-1);
		ContributorID = id;
		ContributorContributions = contributions;
		ContributorAvatarURL = avatar.substring(1, avatar.length()-1);;
	}
	
}