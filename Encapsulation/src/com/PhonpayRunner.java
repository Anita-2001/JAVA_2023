package com;

public class PhonpayRunner {

	public static void main(String[] args) {
		Phonepay pay = new Phonepay();
		pay.setAccNo("chintu");
		System.out.println(pay.getAccNo());
		pay.setAccountBalance(45);
		System.out.println(pay.getAccountBalance());
		pay.setHistory(false);
		System.out.println(pay.isHistory());
		pay.setNoOfRewards(6);
		System.out.println(pay.getNoOfRewards());
		pay.setLock(false);
		System.out.println(pay.isLock());
		pay.setNoOfnotifications(7);
		System.out.println(pay.getNoOfnotifications());
		pay.setHistory(false);
		System.out.println(pay.isHistory());
		pay.setPassword(4);
		System.out.println(pay.getPassword());
		pay.setScan(false);
		System.out.println(pay.isScan());
		pay.setSuccessful(true);
		System.out.println(pay.isSuccessful());
		pay.setTransactionID(1);
		System.out.println(pay.getTransactionID());
		pay.setSenderName("gukku");
		System.out.println(pay.getSenderName());
		pay.setTransactionID(36363);
		System.out.println(pay.getTransactionID());
		pay.setSuccessful(false);
		System.out.println(pay.isSuccessful());
		pay.setPhoneNo(658334228);
		System.out.println(pay.getPhoneNo());

	}

}
