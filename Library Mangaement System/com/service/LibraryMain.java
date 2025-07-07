package com.wipro.service;

import java.util.Scanner;

import com.wipro.entity.Book;
import com.wipro.entity.Librarian;
import com.wipro.model.BookController;
import com.wipro.model.RequestBook;
import com.wipro.model.ReturnBook;
import com.wipro.model.SearchBook;
import com.wipro.model.StudentController;

public class LibraryMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Librarian lib = new Librarian();
        StudentController stuCon = new StudentController();
        BookController bookCon = new BookController();
        RequestBook reqBook = new RequestBook();
        ReturnBook returnBook = new ReturnBook();
        SearchBook searchBook = new SearchBook();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("-------------------------");
            System.out.println("\t Menu");
            System.out.println("--------------------------");
            System.out.println("Select the option : ");
            System.out.println("1. Add Student");
            System.out.println("2. Add Book");
            System.out.println("3. Request Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search for Book");
            System.out.println("6. Display Student Details");
            System.out.println("7. Display all the Books");
            System.out.println("8. Exit");

            
            lib.setOption(sc.nextInt());
            
            try {
            switch (lib.getOption()) {

                case 1:
                    stuCon.addStudents(new com.wipro.entity.Student());
                    break;

                case 2:
                    bookCon.addBooks(); 
                    break;

                case 3:
                    sc.nextLine(); 
                    System.out.println("Enter student Hall Ticket No: ");
                    lib.setHtNo(sc.nextLine());

                    System.out.println("Enter book code to request: "); 
                    lib.setBookCode(sc.nextInt());

                    reqBook.requestBook(lib.getHtNo(), lib.getBookCode(), bookCon, stuCon);
                    break;

    
                case 4:
                    sc.nextLine();
                    System.out.print("Enter student Hall Ticket No: ");
                    lib.setReturnHtNo(sc.nextLine());

                    System.out.print("Enter book code to return: ");
                    lib.setReturnBookCode(sc.nextInt());
                    sc.nextLine(); 

                    returnBook.returnBook(lib.getReturnHtNo(), lib.getReturnBookCode(), bookCon, stuCon);
                    break;


                case 5:
                	 System.out.print("Enter Book Code to Search: ");
                     lib.setSearchCode(sc.nextInt());
                     searchBook.searchAndDisplayBook(lib.getSearchCode(), bookCon);
                     break;
                case 6:
                    stuCon.displayAllStudents();
                    break;

                case 7:
                    bookCon.showAllBooks();
                    break;

                case 8:
                    System.out.println("Exiting system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
            
            }catch(Exception e) {
            	System.out.println("You have Entered or seleceted some thing wrong !... Please try again ...");
            }
        }
    }
}
