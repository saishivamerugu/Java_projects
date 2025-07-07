package com.model;


import com.entity.Book;

public class SearchBook {

    public void searchAndDisplayBook(int bookCode, BookController bookController) {
        Book book = bookController.searchBookById(bookCode);
        
        if (book == null) {
            System.out.println("Book not found.");
        } else {
            System.out.println("Book Found:");
            System.out.println("Book Code: " + book.getBookCode());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Branch: " + book.getBookBranch());
            System.out.println("Quantity: " + book.getQuantity());
        }
    }
}
