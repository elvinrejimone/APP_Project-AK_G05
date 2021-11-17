package Models;

public class RepoIssue{
	
	public String issueTitle;
	public String issueBody;
	public String issueCreatedDate;
	public String issueState;
	public String stateColor;
	public String issueNumber;

	
	public RepoIssue(String title, String body, String created, String state, String issueNo) {
		issueTitle = title.substring(1, title.length()-1);;
		issueBody = body.substring(1, body.length()-1);;
		issueCreatedDate = created.substring(1, created.length()-1);;
		issueState = state.substring(1, state.length()-1);
		if(issueState.equals("open")) {
			stateColor = "rgb(16, 180, 37)";
		}else {
			stateColor = "rgb(119, 16, 16)";
		}
		issueNumber = issueNo;
	}
	
}