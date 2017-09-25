package is.ru.honn.library.ui;

import is.ru.honn.library.models.Book;
import is.ru.honn.library.models.Customer;
import is.ru.honn.library.models.Loan;
import is.ru.honn.library.services.LibraryServiceInterface;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryUI {
    private LibraryServiceInterface service;

    public LibraryUI(LibraryServiceInterface ls){
        service = ls;
    }

    public void start(){
        int input = -1;

        while(input != 0){
            printMenu();
            input = getInput();
            processInput(input);
        }
    }

    private int getInput(){
        int input = -1;
        Scanner sc = new Scanner(System.in);
        try {
             input = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid input, please enter one of the numbers:");
            input = -1;
        }
        return input;
    }

    private void processInput(int input){
        switch(input){
            case 1:
                addCustomer();
                break;
            case 2:
                addBook();
                break;
            case 3:
                addLoan();
                break;
            case 4:
                break;
            case 5:
                for (Customer c :service.getCustomers()) {
                    System.out.println(c + ", ");
                }
                for (Book b :service.getBooks()) {
                    System.out.println(b + ", ");
                }
                break;
        }
    }

    private void addCustomer(){
        Customer c = new Customer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        c.setName(sc.next());

        System.out.print("Enter address: ");
        c.setAddress(sc.next());

        System.out.print("Enter email: ");
        c.setEmail(sc.next());

        service.addCustomer(c);
    }

    /** Please enter the information in this format:
     *  {name},{address},{email,phonenumber
     */
    private void addBook(){
        Book b = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        b.setTitle(sc.next());

        System.out.print("Enter author: ");
        b.setAuthor(sc.next());

        System.out.print("Enter ISBN number: ");
        b.setISBNNumber(sc.next());

        System.out.print("Enter releaseDate: ");
        //b.setReleaseDate(sc.next());
        //T

        service.addBook(b);
    }
    private void addLoan()
    {
        Loan l = new Loan();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer ID: ");
        l.setCustomerId(sc.nextInt());

        System.out.print("Enter book ID: ");
        l.setBookId(sc.nextInt());



        l.setLoanDate(LocalDateTime.now());
        service.addLoan(l);
    }

    private void printMenu(){
        System.out.println("-----------------------------");
        System.out.println("Enter a number to perform the\ncorresponding action");
        System.out.println("-----------------------------");
        System.out.println("1.\tRegister  a person");
        System.out.println("2.\tRegister a book");
        System.out.println("3.\tRegister a loan");
        System.out.println("4.\tRead reports");
        System.out.println("-----------------------------");
        System.out.print("> ");

    }
}
