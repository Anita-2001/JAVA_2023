package com;

public class Whatsapp {
        private int userList;
        private int noOfGroups;
        private	boolean chatHistory;
        private boolean status;
        private String theme;
        private int blockedList;
        private boolean typing;
        private long batterylevel;
        private	int callHistory;
        private	boolean lastSeen;
        private int notification;
        private boolean encryptionKey;
        private String currentLanguage;
        private boolean dp;
		
        public int getUserList() {
			return userList;
		}
		public void setUserList(int userList) {
			this.userList = userList;
		}
		public int getNoOfGroups() {
			return noOfGroups;
		}
		public void setNoOfGroups(int noOfGroups) {
			this.noOfGroups = noOfGroups;
		}
		public boolean isChatHistory() {
			return chatHistory;
		}
		public void setChatHistory(boolean chatHistory) {
			this.chatHistory = chatHistory;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public String getTheme() {
			return theme;
		}
		public void setTheme(String theme) {
			this.theme = theme;
		}
		public int getBlockedList() {
			return blockedList;
		}
		public void setBlockedList(int blockedList) {
			this.blockedList = blockedList;
		}
		public boolean isTyping() {
			return typing;
		}
		public void setTyping(boolean typing) {
			this.typing = typing;
		}
		public long getBatterylevel() {
			return batterylevel;
		}
		public void setBatterylevel(long batterylevel) {
			this.batterylevel = batterylevel;
		}
		public int getCallHistory() {
			return callHistory;
		}
		public void setCallHistory(int callHistory) {
			this.callHistory = callHistory;
		}
		public int getNotification() {
			return notification;
		}
		public void setNotification(int notification) {
			this.notification = notification;
		}
		public boolean isLastSeen() {
			return lastSeen;
		}
		public void setLastSeen(boolean lastSeen) {
			this.lastSeen = lastSeen;
		}
		public boolean isEncryptionKey() {
			return encryptionKey;
		}
		public void setEncryptionKey(boolean encryptionKey) {
			this.encryptionKey = encryptionKey;
		}
		public String getCurrentLanguage() {
			return currentLanguage;
		}
		public void setCurrentLanguage(String currentLanguage) {
			this.currentLanguage = currentLanguage;
		}
		public boolean isDp() {
			return dp;
		}
		public void setDp(boolean dp) {
			this.dp = dp;
		}
}
