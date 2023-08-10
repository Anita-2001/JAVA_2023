package com;

public class NammayatriRunner {


		public static void main(String[] args) {
			System.out.println("invocking main yatrirunner");

			Nammayatri ref = new Nammayatri();

			ref.setAge(20);
			System.out.println(ref.getAge());
			ref.setBookingDate("6/03/23");
			System.out.println(ref.getBookingDate());
			ref.setConfirmed(false);

			ref.setDate("10/03.23");
			System.out.println(ref.getDate());
			ref.setEmail("divya@gmail.com");
			System.out.println(ref.getEmail());
			ref.setGender("Male");
			System.out.println(ref.getGender());
			ref.setLocation("DAvanger");
			System.out.println(ref.getLocation());
			ref.setLuggage(false);
			System.out.println(ref.getLuggageCount());
			ref.setLuggageCount(10);
			System.out.println(ref.getLuggageCount());
			ref.setPhoneNo("9642579065");
			System.out.println(ref.getPhoneNo());
			ref.setPrice(500);
			System.out.println(ref.getPrice());
			ref.setReference(null);
			System.out.println(ref.getReference());
			ref.setSeatNo(64);
			System.out.println(ref.getSeatNo());
			ref.setTravelerName("Sandeep");
			System.out.println(ref.getTravelerName());

		}
	}


