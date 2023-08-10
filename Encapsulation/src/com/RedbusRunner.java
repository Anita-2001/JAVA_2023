package com;

public class RedbusRunner {

	public static void main(String[] args) {
		
				Redbus ref = new Redbus();

				ref.setPassengerName("Deepa");
				System.out.println(ref.getPassengerName());

				ref.setArrivalTime("12:15");
				System.out.println(ref.getArrivalTime());

				ref.setBookingDate("12/8/23");
				System.out.println(ref.getBookingDate());

				ref.setBookingStatus(false);
				System.out.println(ref.getBusNo());

				ref.setBusNo("KA24ML2455");
				System.out.println(ref.getBusNo());
				
				ref.setBusType("AC");
				System.out.println(ref.getBusType());

				ref.setDestinationLocation("Shivamoga");
				System.out.println(ref.getDestinationLocation());

				ref.setJourneyDate("10/08/23");
				System.out.println(ref.getJourneyDate());

				ref.setLocation("harihar");
				System.out.println(ref.getLocation());

				ref.setphoneNo("8217458323");
				System.out.println(ref.getphoneNo());

				ref.setReturnDate("22/02/23");
				System.out.println(ref.getReturnDate());

				ref.setRoundTrip(false);
				System.out.println(ref.isRoundTrip());
				ref.setSeatNo(5);
				System.out.println(ref.getSeatNo());

				ref.setTicketPrice(250);
				System.out.println(ref.getTicketPrice());

			}
		}

