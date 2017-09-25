package is.ru.honn.library.repository;

import is.ru.honn.library.models.Book;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.plaf.nimbus.State;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LibraryRepo {
    private Connection db = null;

    public LibraryRepo(DataBaseConnection db){
        this.db = db.getConnection();
        readFromJSON();
    }

    public Book addBook(Book book){
        String values = getValuesFromBook(book);
        try {
            Statement sm = db.createStatement();
            sm.setQueryTimeout(30);  // set timeout to 30 sec.
            sm.executeUpdate("insert into Books " +
                    "(title, author, releaseDate, ISBN) " +
                    "VALUES " +
                    "("+values+")");


            return book;
        } catch (SQLException e) {
            System.out.print(e.getMessage());
            return null;
        }
    }

    public void readFromJSON(){
        JSONParser parser = new JSONParser();

        try
        {
            Object obj = parser.parse(new FileReader("Books.json"));

            JSONArray books = (JSONArray) obj;

            Iterator<JSONObject> iterator = books.iterator();
            while (iterator.hasNext())
            {
                JSONObject o = iterator.next();
                long id = (Long)o.get("bok_id");
                String title = (String)o.get("bok_titill");
                String author = (String)o.get("fornafn_hofundar") + " " + (String)iterator.next().get("eftirnafn_hofundar");
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date releaseDate = format.parse((String) o.get("utgafudagur"));
                String ISBN = (String) o.get("ISBN");

                Book b = new Book((int)id,title,author,releaseDate, ISBN);
                addBook(b);
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
    private String getValuesFromBook(Book b){
        return "'" + b.getTitle() + "',"
                + "'" + b.getAuthor().replaceAll("'","") + "',"
                + "'" + b.getReleaseDate() + "',"
                + "'" + b.getISBNNumber() + "'";
    }
}
