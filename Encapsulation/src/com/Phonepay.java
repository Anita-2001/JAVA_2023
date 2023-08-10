package com;

public class Phonepay {

	private int phoneNo;
	private double accountBalance;
	private int transactionID;
	private String senderName;
	private String accNo;
	private boolean successful;
	private boolean history;
	private String paymentType;
	private boolean scan;
	private boolean lock;
	private long password;
	private int noOfnotifications;
	private int noOfRewards;
	private boolean mobileRecharge;

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public long getPassword() {
		return password;
	}

	public void setPassword(long password) {
		this.password = password;
	}

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	public boolean isHistory() {
		return history;
	}

	public void setHistory(boolean history) {
		this.history = history;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}

	public boolean isScan() {
		return scan;
	}

	public void setScan(boolean scan) {
		this.scan = scan;
	}

	public int getNoOfnotifications() {
		return noOfnotifications;
	}

	public void setNoOfnotifications(int noOfnotifications) {
		this.noOfnotifications = noOfnotifications;
	}

	public int getNoOfRewards() {
		return noOfRewards;
	}

	public void setNoOfRewards(int noOfRewards) {
		this.noOfRewards = noOfRewards;
	}

	public boolean isMobileRecharge() {
		return mobileRecharge;
	}

	public void setMobileRecharge(boolean mobileRecharge) {
		this.mobileRecharge = mobileRecharge;
	}

}
