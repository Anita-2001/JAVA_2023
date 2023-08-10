package com;

public class UberRunner {

	public static void main(String[] args) 
	{
	
				System.out.println("invocking main UberRunner");

				Uber ref=new Uber();
				
				ref.setAge(30);
				System.out.println(ref.getAge());
				ref.setBookingDate("5/09/23");
				System.out.println(ref.getBookingDate());
				ref.setConfirmed(false);
				System.out.println(	ref.isConfirmed());
				ref.setDate("7/09/23");
				System.out.println(ref.getDate());
				ref.setEmail("anjali@gmail.com");
				System.out.println(ref.getEmail());
				ref.setGender("femal");
				System.out.println(ref.getGender());
				ref.setLocation("Harihar");
				System.out.println(ref.getLocation());
				ref.setLuggage(false);
				System.out.println(ref.isLuggage());
				ref.setLuggageCount(10);
				System.out.println(ref.getLuggageCount());
				ref.setPhoneNo("7223456789");
				System.out.println(ref.getPhoneNo());
				ref.setPrice(600);
				System.out.println(ref.getPrice());
				ref.setReference("id24529");
				System.out.println(ref.getReference());
				ref.setSeatNo(4);
				System.out.println(ref.getSeatNo());
				ref.setTravelerName("agency");
				System.out.println(ref.getTravelerName());
				
				
				
			}

		}


	