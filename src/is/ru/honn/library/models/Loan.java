package is.ru.honn.library.models;

import java.time.LocalDateTime;
import java.util.Date;

public class Loan {

    /**
     * The ID of the customer in the database
     */
    public int customerId;

    /**
     * The ID of the book in the database
     */
    public int bookId;

    /**
     * The date that the book was loaned
     */
    public LocalDateTime loanDate;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }
}
