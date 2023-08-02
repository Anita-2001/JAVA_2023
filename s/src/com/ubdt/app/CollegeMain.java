package com.ubdt.app;

import com.ubdt.College;
import com.ubdt.Student;
import com.ubdt.Teacher;

public class CollegeMain {

	public static void main(String[] args) {

		Student student = new Student(2, "Anitha");
		Student student1 = new Student(4, "sunitha");
		Student student2 = new Student(5, "suma");

		Student student3[] = { student, student1, student2 };

		Teacher teacher = new Teacher("omkar", 13);
		Teacher teacher1 = new Teacher("devendra", 14);
		Teacher teacher2 = new Teacher("vinoda", 1);

		Teacher[] teacher3 = { teacher, teacher1, teacher2 };

		College college = new College("UBDT", "Davanagere", student3, teacher3);
		college.printInfo();
		System.out.println(college.name);
		String ref8 = college.name;
		System.out.println(ref8);
	}
	
}
