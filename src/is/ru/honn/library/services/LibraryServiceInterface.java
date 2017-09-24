package is.ru.honn.library.services;

import is.ru.honn.library.models.Book;
import is.ru.honn.library.models.Customer;
import is.ru.honn.library.models.Loan;

import java.util.Date;
import java.util.List;

public interface LibraryServiceInterface {
    Customer addCustomer(Customer customer);
    List<Customer> getCustomers();
    Book addBook(Book book);
    List<Book> getBooks();
    Loan addLoan(Loan loan);
    List<Book> getRentedBooksByDate(Date date);
    List<Customer> getCustomersByDate(Date date);

}
