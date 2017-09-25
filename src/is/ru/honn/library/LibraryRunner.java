package is.ru.honn.library;

import is.ru.honn.library.repository.DataBaseConnection;
import is.ru.honn.library.repository.LibraryRepo;
import is.ru.honn.library.services.LibraryService;
import is.ru.honn.library.services.LibraryServiceInterface;
import is.ru.honn.library.ui.LibraryUI;

import java.sql.SQLException;

public class LibraryRunner {
    public static void main(String[] args) throws SQLException {
        DataBaseConnection db = new DataBaseConnection();
        LibraryRepo lr = new LibraryRepo(db);
        LibraryServiceInterface ls = new LibraryService(lr);
        LibraryUI ui = new LibraryUI(ls);

        ui.start();
    }
}
