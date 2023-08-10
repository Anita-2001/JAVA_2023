package com;

public class Uber {

	private String location;
	private double price;
	private int seatNo;
	private String travelerName;
	private int age;
	private String gender;
	private String date;
	private int luggageCount;
	private boolean luggage;
	private boolean Confirmed;
	private String phoneNo;
	private String email;
	private String bookingDate;
	private String reference;

	protected String getLocation() {
		return location;
	}

	protected void setLocation(String location) {
		this.location = location;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected int getSeatNo() {
		return seatNo;
	}

	protected void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	protected String getTravelerName() {
		return travelerName;
	}

	protected void setTravelerName(String travelerName) {
		this.travelerName = travelerName;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}

	protected String getDate() {
		return date;
	}

	protected void setDate(String date) {
		this.date = date;
	}

	protected int getLuggageCount() {
		return luggageCount;
	}

	protected void setLuggageCount(int luggageCount) {
		this.luggageCount = luggageCount;
	}

	protected boolean isLuggage() {
		return luggage;
	}

	protected void setLuggage(boolean luggage) {
		this.luggage = luggage;
	}

	protected boolean isConfirmed() {
		return Confirmed;
	}

	protected void setConfirmed(boolean confirmed) {
		Confirmed = confirmed;
	}

	protected String getPhoneNo() {
		return phoneNo;
	}

	protected void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getBookingDate() {
		return bookingDate;
	}

	protected void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	protected String getReference() {
		return reference;
	}

	protected void setReference(String reference) {
		this.reference = reference;
	}

}