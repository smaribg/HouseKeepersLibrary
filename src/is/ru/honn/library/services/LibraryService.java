package is.ru.honn.library.services;

import is.ru.honn.library.models.Book;
import is.ru.honn.library.models.Customer;
import is.ru.honn.library.models.Loan;
import is.ru.honn.library.repository.LibraryRepo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryService implements LibraryServiceInterface {

    private LibraryRepo repo;

    public LibraryService(LibraryRepo repo){
        this.repo = repo;
    }
    @Override
    public Customer addCustomer(Customer customer) {
        repo.addCustomer(customer);
        return customer;
    }

    @Override
    public List<Customer> getCustomers() {
        return null;
    }

    @Override
    public Book addBook(Book book) {
        repo.addBook(book);
        return book;
    }

    @Override
    public List<Book> getBooks() {
        return null;
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
