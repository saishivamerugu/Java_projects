package com.wipro.entity;

public class Book {

	private String bookName;
	private int bookCode;
	private String bookBranch;
	private int quantity;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookBranch() {
		return bookBranch;
	}
	public void setBookBranch(String bookBranch) {
		this.bookBranch = bookBranch;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
	    return "Book Code: " + bookCode +
	           ", Name: " + bookName +
	           ", Quantity: " + quantity +
	           ", Branch: " + bookBranch;
	}

	
}
