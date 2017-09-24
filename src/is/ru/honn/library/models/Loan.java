package is.ru.honn.library.models;

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
    public Date loanDate;

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

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
}
