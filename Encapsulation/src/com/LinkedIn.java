package com;


	public class LinkedIn {
		private String userName;
		private String fullName;
		private String headline;
		private String email;
		private String location;
		private String profilePicture;
		private int connectionsCount;
		private int postsCount;
		private int followersCount;
		private int endorsementsCount;
		private boolean isPremium;
		private boolean isVerified;
		private String currentJob;
		private String lastActivity;
		
		public void setUsername(String username)
		{
			this.userName=username;
		}
		public void getUsername()
		{
			System.out.println("getting the username");
		}
		public void setfullName(String fullname)
		{
			this.fullName=fullname;
		}
		public String fullname()
		{
			System.out.println("getting the fullname");
			return fullName;
		
		}
		public void setheadline(String headline)
		{
			this.headline=headline;
		}
		public String getheadline()
		{
			System.out.println("headline");
			return headline;
			
		}
		
}