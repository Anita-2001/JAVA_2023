package com;

public class SnapchatRunner {

	public static void main(String[] args) {
		Snapchat snap = new Snapchat();
		snap.setAdvertising(false);
		System.out.println(snap.isAdvertising());
		snap.setBitmoji(true);
		System.out.println(snap.isBitmoji());
		snap.setChatList(7);
		System.out.println(snap.getChatList());
		snap.setEmojiList(67);
		System.out.println(snap.getEmojiList());
		snap.setFriendList(34);
		System.out.println(snap.getFriendList());
		snap.setGeafilters(true);
		System.out.println(snap.isGeafilters());
		snap.setLensFilters(false);
		System.out.println(snap.isLensFilters());
		snap.setMemories(false);
		System.out.println(snap.isMemories());
		snap.setSavedSnaps(67);
		System.out.println(snap.getSavedSnaps());
		snap.setLensFilters(false);
		System.out.println(snap.isLensFilters());
		snap.setUsername(null);
		System.out.println(snap.getUsername());
		snap.setPrivacySettings(false);
		System.out.println(snap.isPrivacySettings());
	}

}
