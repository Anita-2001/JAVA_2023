package com;

public class WhatsappRunner {

	public static void main(String[] args) {
		Whatsapp app = new Whatsapp();
		app.setBatterylevel(3900);
		System.out.println(app.getBatterylevel());
		app.setBlockedList(1);
		System.out.println(app.getBlockedList());
		app.setCallHistory(23);
		System.out.println(app.getCallHistory());
		app.setChatHistory(false);
		System.out.println(app.getCallHistory());
		app.setChatHistory(false);
		System.out.println(app.getCallHistory());
		app.setCurrentLanguage("englisg");
		System.out.println(app.getCurrentLanguage());
		app.setDp(false);
		System.out.println(app.isDp());
		app.setEncryptionKey(true);
		System.out.println(app.isEncryptionKey());
		app.setNoOfGroups(7);
		System.out.println(app.getNoOfGroups());
		app.setNotification(7);
		System.out.println(app.getNotification());
		app.setTheme("black");
		System.out.println(app.getTheme());
		app.setUserList(89);
		System.out.println(app.getUserList());
		app.setStatus(true);
		System.out.println(app.isStatus());
		
	}

}