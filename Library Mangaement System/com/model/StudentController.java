package com.wipro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.wipro.entity.Student;

public class StudentController {

	ArrayList<Student> addStudents = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void addStudents(Student stuObj) {
		System.out.println("Enter Student Name : ");
		stuObj.setName(sc.nextLine());

		System.out.println("Enter Student HtNo : ");
		stuObj.setHallTicketNo(sc.nextLine());

		System.out.println("Enter Student Branch : ");
		stuObj.setBranch(sc.nextLine());

		System.out.println("Enter Student year : ");
		stuObj.setYear(sc.nextInt());
		sc.nextLine();

		addStudents.add(stuObj);
	}

	public Student StudentByHallTicket(String hallTicketNo) {
		for (Student s : addStudents) {
			if (s.getHallTicketNo().equalsIgnoreCase(hallTicketNo)) {
				return s;
			}
		}
		return null;
	}
	public void displayAllStudents() {
		if (addStudents.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		for (Student s : addStudents) {
			System.out.println("Name: " + s.getName());
			System.out.println("Hall Ticket No: " + s.getHallTicketNo());
			System.out.println("Branch: " + s.getBranch());
			System.out.println("Year: " + s.getYear());
			System.out.println("Books: " + Arrays.toString(s.getBookCode()));
			System.out.println("------------------------");
		}
	}

}
