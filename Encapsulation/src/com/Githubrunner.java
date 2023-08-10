package com;

public class Githubrunner {

	public static void main(String[] args) {
		Github chat = new Github();
		chat.setBranchName(null);
		System.out.println(chat.getBranchName());
		chat.setFilePush(false);
		System.out.println(chat.isFilePush());
		chat.isPublicProfile();
		System.out.println(chat.isPublicProfile());
		chat.setIssue(null);
		System.out.println(chat.getIssue());
		chat.setNoOfProjects(9);
		System.out.println(chat.getNoOfProjects());
		chat.setNoOfRepoitory(8);
		System.out.println(chat.getNoOfRepoitory());
		chat.setSettings(true);
		System.out.println(chat.isSettings());
		chat.setToken(null);
		System.out.println(chat.getToken());
		chat.setSignIn(true);
		System.out.println(chat.isSignIn());
		chat.setPublicProfile(true);
		System.out.println(chat.isPublicProfile());
		chat.setNoOfProjects(3);
		System.out.println(chat.getNoOfNotfications());
	}

}
