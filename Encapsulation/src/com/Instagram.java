package com;

public class Instagram {

	private String userName;
	private int noOfPost;
	private long noOfComments;
	private int noOfLikes;
	private long noOfFollower;
	private long noOfFollowing;
	private int noOfTagList;
	private boolean searchHistory;
	private boolean storyList;
	private String bio;
	private String location;
	private int savedPosts;
	private boolean verification;
	private long messageList;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNoOfPost() {
		return noOfPost;
	}

	public void setNoOfPost(int noOfPost) {
		this.noOfPost = noOfPost;
	}

	public long getNoOfComments() {
		return noOfComments;
	}

	public void setNoOfComments(long noOfComments) {
		this.noOfComments = noOfComments;
	}

	public int getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	public long getNoOfFollower() {
		return noOfFollower;
	}

	public void setNoOfFollower(long noOfFollower) {
		this.noOfFollower = noOfFollower;
	}

	public long getNoOfFollowing() {
		return noOfFollowing;
	}

	public void setNoOfFollowing(long noOfFollowing) {
		this.noOfFollowing = noOfFollowing;
	}

	public int getNoOfTagList() {
		return noOfTagList;
	}

	public void setNoOfTagList(int noOfTagList) {
		this.noOfTagList = noOfTagList;
	}

	public boolean isSearchHistory() {
		return searchHistory;
	}

	public void setSearchHistory(boolean searchHistory) {
		this.searchHistory = searchHistory;
	}

	public boolean isStoryList() {
		return storyList;
	}

	public void setStoryList(boolean storyList) {
		this.storyList = storyList;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSavedPosts() {
		return savedPosts;
	}

	public void setSavedPosts(int savedPosts) {
		this.savedPosts = savedPosts;
	}

	public boolean isVerification() {
		return verification;
	}

	public void setVerification(boolean verification) {
		this.verification = verification;
	}

	public long getMessageList() {
		return messageList;
	}

	public void setMessageList(long messageList) {
		this.messageList = messageList;
	}

}
