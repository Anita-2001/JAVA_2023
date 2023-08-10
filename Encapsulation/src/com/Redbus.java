package com;

public class Redbus {


		private String passengerName;
		private String phoneNo;
		private String location;
		private String destinationLocation;
		private String journeyDate;
		private String returnDate;
		private int seatNo;
		private double ticketPrice;
		private boolean bookingStatus;
		private String busType;
		private String busNo;
		private String arrivalTime;
		private boolean isRoundTrip;
		private String bookingDate;

		protected String getPassengerName() {
			return this.passengerName;

		}

		protected void setPassengerName(String passengerName) {
			this.passengerName = passengerName;

		}

		protected String getphoneNo() {
			return this.phoneNo;

		}

		protected void setphoneNo(String phoneNo) {
			this.phoneNo = phoneNo;

		}

		protected String getDestinationLocation() {
			return destinationLocation;
		}

		protected void setDestinationLocation(String destinationLocation) {
			this.destinationLocation = destinationLocation;
		}

		protected String getLocation() {
			return location;
		}

		protected void setLocation(String location) {
			this.location = location;
		}

		protected String getJourneyDate() {
			return journeyDate;
		}

		protected void setJourneyDate(String journeyDate) {
			this.journeyDate = journeyDate;
		}

		protected String getReturnDate() {
			return returnDate;
		}

		protected void setReturnDate(String returnDate) {
			this.returnDate = returnDate;
		}

		protected int getSeatNo() {
			return seatNo;
		}

		protected void setSeatNo(int seatNo) {
			this.seatNo = seatNo;
		}

		protected double getTicketPrice() {
			return ticketPrice;
		}
		protected void setTicketPrice(double ticketPrice) {
			this.ticketPrice = ticketPrice;
		}

		protected boolean isBookingStatus() {
			return bookingStatus;
		}

		protected void setBookingStatus(boolean bookingStatus) {
			this.bookingStatus = bookingStatus;
		}

		protected String getBusType() {
			return busType;
		}

		protected void setBusType(String busType) {
			this.busType = busType;
		}

		protected String getBusNo() {
			return busNo;
		}

		protected void setBusNo(String busNo) {
			this.busNo = busNo;
		}

		protected String getArrivalTime() {
			return arrivalTime;
		}

		protected void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}

		protected boolean isRoundTrip() {
			return isRoundTrip;
		}

		protected void setRoundTrip(boolean isRoundTrip) {
			this.isRoundTrip = isRoundTrip;
		}

		protected String getBookingDate() {
			return bookingDate;
		}

		protected void setBookingDate(String bookingDate) {
			this.bookingDate = bookingDate;
		}

	}

