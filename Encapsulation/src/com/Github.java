package com;

public class  Github{

	private String repositoryUrl;
	private String branchName;
	private String token;
	private String issue;
	private int issueNo;
	private int noOfRepoitory;
	private boolean settings;
	private boolean readMeFile;
	private boolean filePush;
	private int noOfProjects;
	private boolean publicProfile;
	private boolean signIn;
	private int noOfNotfications;
	private boolean search;

	public String getRepositoryUrl() {
		return repositoryUrl;
	}

	public void setRepositoryUrl(String repositoryUrl) {
		this.repositoryUrl = repositoryUrl;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getIssueNo() {
		return issueNo;
	}

	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public int getNoOfRepoitory() {
		return noOfRepoitory;
	}

	public void setNoOfRepoitory(int noOfRepoitory) {
		this.noOfRepoitory = noOfRepoitory;
	}

	public boolean isSettings() {
		return settings;
	}

	public void setSettings(boolean settings) {
		this.settings = settings;
	}

	public boolean isReadMeFile() {
		return readMeFile;
	}

	public void setReadMeFile(boolean readMeFile) {
		this.readMeFile = readMeFile;
	}

	public boolean isFilePush() {
		return filePush;
	}

	public void setFilePush(boolean filePush) {
		this.filePush = filePush;
	}

	public int getNoOfProjects() {
		return noOfProjects;
	}

	public void setNoOfProjects(int noOfProjects) {
		this.noOfProjects = noOfProjects;
	}

	public boolean isPublicProfile() {
		return publicProfile;
	}

	public void setPublicProfile(boolean publicProfile) {
		this.publicProfile = publicProfile;
	}

	public boolean isSignIn() {
		return signIn;
	}

	public void setSignIn(boolean signIn) {
		this.signIn = signIn;
	}

	public int getNoOfNotfications() {
		return noOfNotfications;
	}

	public void setNoOfNotfications(int noOfNotfications) {
		this.noOfNotfications = noOfNotfications;
	}

	public boolean isSearch() {
		return search;
	}

	public void setSearch(boolean search) {
		this.search = search;
	}

}
