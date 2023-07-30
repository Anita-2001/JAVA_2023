package com.ubdt.app.web;

import com.ubdt.app.Doctor;
import com.ubdt.app.Hospital;

public class HospitalSaver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital ref=new Hospital();
		
		System.out.println("name:"+ref.name);
		System.out.println("location:"+ref.location);
		ref.guide();
		ref.healthcare();
		
		 Doctor dt=ref.doctor;
		 System.out.println("name:"+dt.name);
		 System.out.println("age:"+dt.age);
		 dt.injection();
		 dt.hearproblems();

	}

}
