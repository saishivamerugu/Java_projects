package com.entity;

public class Librarian {

	private int option;
	private int returnBookCode;
	private String returnHtNo;
	private String htNo;
	private int bookCode;
	private int searchCode;
//	htNo, bookCode
	
	public int getSearchCode() {
		return searchCode;
	}

	public void setSearchCode(int searchCode) {
		this.searchCode = searchCode;
	}

	public String getHtNo() {
		return htNo;
	}

	public void setHtNo(String htNo) {
		this.htNo = htNo;
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public int getReturnBookCode() {
		return returnBookCode;
	}

	public void setReturnBookCode(int returnBookCode) {
		this.returnBookCode = returnBookCode;
	}

	public String getReturnHtNo() {
		return returnHtNo;
	}

	public void setReturnHtNo(String returnHtNo) {
		this.returnHtNo = returnHtNo;
	}
	
}
