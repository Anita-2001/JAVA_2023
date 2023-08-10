package com;

public class InstagramRunner {

	public static void main(String[] args) {
		Instagram gram = new Instagram();
		gram.setBio("student");
		System.out.println(gram.getBio());
		gram.isSearchHistory();
		System.out.println(gram.isSearchHistory());
		gram.setLocation("earth");
		System.out.println(gram.getLocation());
		gram.setMessageList(0);
		System.out.println(gram.getMessageList());
		gram.setNoOfComments(0);

		System.out.println(gram.getNoOfComments());
		gram.setNoOfFollower(7789);
		System.out.println(gram.getNoOfFollower());
		gram.setNoOfLikes(89);
		System.out.println(gram.getNoOfLikes());
		gram.setNoOfPost(0);
		System.out.println(gram.getNoOfPost());
		gram.setSavedPosts(67);
		System.out.println(gram.getSavedPosts());
		gram.setSearchHistory(false);
		System.out.println(gram.isSearchHistory());
		gram.setStoryList(true);
		System.out.println(gram.isSearchHistory());
		gram.setUserName("pure");
		System.out.println(gram.getUserName());
		gram.setVerification(false);
		System.out.println(gram.isVerification());
		gram.setNoOfTagList(7);
		System.out.println(gram.getNoOfTagList());

	}

}
