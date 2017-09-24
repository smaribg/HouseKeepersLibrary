package is.ru.honn.library.models;

import java.util.Date;

public class Book {

    public int id;
    /**
     * Title of the book
     */
    public String title;

    /**
     * Title of the author
     */
    public String author;

    /**
     * The date the book was released
     */
    public Date releaseDate;

    /**
     * The ISBN number of the book
     */
    public String ISBNNumber;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    @Override
    public String toString() {
        return title + ", " + author + ", " + ISBNNumber + ", " + releaseDate;
    }
}
