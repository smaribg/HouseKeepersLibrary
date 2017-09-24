package is.ru.honn.library.services;

import is.ru.honn.library.models.Book;
import is.ru.honn.library.models.Customer;
import is.ru.honn.library.models.Loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryService implements LibraryServiceInterface {

    List<Customer> customers = new ArrayList<Customer>();
    List<Book> books = new ArrayList<Book>();

    @Override
    public Customer addCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Loan addLoan(Loan loan) {
        return null;
    }

    @Override
    public List<Book> getRentedBooksByDate(Date date) {
        return null;
    }

    @Override
    public List<Customer> getCustomersByDate(Date date) {
        return null;
    }
}
