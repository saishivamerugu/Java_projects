
package com.model;

import com.entity.Book;
import com.entity.Student;

public class ReturnBook {

    public void returnBook(String hallTicketNo, int bookCode, BookController bookController, StudentController studentController) {
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

        int[] codes = student.getBookCode();
        boolean found = false;

        for (int i = 0; i < codes.length; i++) {
            if (codes[i] == bookCode) {
                codes[i] = 0; // Remove book from student's list
                student.setBookCode(codes);
                book.setQuantity(book.getQuantity() + 1); // Increment book quantity
                System.out.println("Book returned successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student doesn't have this book.");
        }
    }
}
