package is.ru.honn.library;

import is.ru.honn.library.repository.DataBaseConnection;
import is.ru.honn.library.repository.LibraryRepo;
import is.ru.honn.library.services.LibraryService;
import is.ru.honn.library.services.LibraryServiceInterface;
import is.ru.honn.library.ui.LibraryUI;

import java.sql.SQLException;

/**
 * Housekeepers library
 * A system that registers books and loans them to customers
 * @Author Andri Karel Júlíusson
 * @Author Smári Björn Gunnarsson
 * This project is an assignment for Software design and development
 */
public class LibraryRunner {
    public static void main(String[] args) throws SQLException {
        DataBaseConnection db = new DataBaseConnection();
        LibraryRepo lr = new LibraryRepo(db);
        LibraryServiceInterface ls = new LibraryService(lr);
        LibraryUI ui = new LibraryUI(ls);

        ui.start();
    }
}
