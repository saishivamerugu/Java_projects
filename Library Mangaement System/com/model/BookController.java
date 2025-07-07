package com.model;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Book;

public class BookController {

    ArrayList<Book> bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addBooks() {
    	
    	Book obj = new Book();
    	
        System.out.print("Enter Book ID: ");
        obj.setBookCode(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Enter Book Name: ");
        obj.setBookName(sc.nextLine());

        
        System.out.print("Enter Quantity: ");
        obj.setQuantity(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Enter Branch: ");
        obj.setBookBranch(sc.nextLine());
        
        
        bookList.add(obj);
        
        System.out.println("Book added successfully: " + obj.getBookName());
    }

	
	
		public void showAllBooks() {
	        if (bookList.isEmpty()) {
	            System.out.println("No books available.");
	            return;
	        }
	        for (Book b : bookList) {
	            System.out.println(b);
	        }
	    }
	
		
		
	    public Book searchBookById(int id) {
	        for (Book b : bookList) {
	            if (b.getBookCode() == id) {
	                return b;
	            }
	        }
	        return null;
	    }
	
	    
	    
	    public ArrayList<Book> getBooks() {
	        return bookList;
	    }
}
