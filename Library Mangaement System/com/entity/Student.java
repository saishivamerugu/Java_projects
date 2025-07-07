package com.wipro.entity;

import java.util.Arrays;

public class Student {

	private String name;
	private String hallTicketNo;
	private String branch;
	private int year;
	private int[] bookCode = new int[5]; // 5 Books only ...
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHallTicketNo() {
		return hallTicketNo;
	}
	public void setHallTicketNo(String hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int[] getBookCode() {
		return bookCode;
	}
	public void setBookCode(int[] bookCode) {
		this.bookCode = bookCode;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", hallTicketNo=" + hallTicketNo + ", branch=" + branch + ", year=" + year
				+ ", bookCode=" + Arrays.toString(bookCode) + "]";
	}
}
