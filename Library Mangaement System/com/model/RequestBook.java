package com.wipro.model;

import com.wipro.entity.Book; 
import com.wipro.entity.Librarian;
import com.wipro.entity.Student;
public class RequestBook {
	
	public void requestBook(String hallTicketNo, int bookCode, BookController bookController, StudentController studentController) {
	    Student student = studentController.StudentByHallTicket(hallTicketNo);
	    if (student == null) {
	        System.out.println("Student not found.");
	        return;
	    }

	    Book book = bookController.searchBookById(bookCode);
	    if (book == null) {
	        System.out.println("Book not found.");
	        return;
	    }

	    if (book.getQuantity() <= 0) {
	        System.out.println("Book not available.");
	        return;
	    }

	    int[] codes = student.getBookCode();
	    boolean assigned = false;

	    for (int i = 0; i < codes.length; i++) {
	        if (codes[i] == 0) {
	            codes[i] = bookCode;
	            student.setBookCode(codes);
	            book.setQuantity(book.getQuantity() - 1);
	            System.out.println("Book assigned successfully.");
	            assigned = true;
	            break;
	        }
	    }

	    if (!assigned) {
	        System.out.println("Student already has 5 books.");
	    }
	}

}
