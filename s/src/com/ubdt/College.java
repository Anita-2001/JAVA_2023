package com.ubdt;

public class College {
	public String name;
	public String location;
	public Student[] student;
	public Teacher[] teacher;

	public College(String name, String location, Student[] student, Teacher[] teacher) {
		this.name = name;
		this.location = location;
		this.student = student;
		this.teacher = teacher;
	}

	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.location);
		for (int pos = 0; pos < student.length; pos++) {

			Student student = this.student[pos];
			student.printInfo();

		}

		for (int num = 0; num < teacher.length; num++) {

			Teacher tec = teacher[num];

			tec.printInfo();
		}
	}

}
