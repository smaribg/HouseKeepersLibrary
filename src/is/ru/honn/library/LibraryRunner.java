package is.ru.honn.library;

import is.ru.honn.library.services.LibraryService;
import is.ru.honn.library.services.LibraryServiceInterface;
import is.ru.honn.library.ui.LibraryUI;

public class LibraryRunner {
    public static void main(String[] args){
        LibraryServiceInterface ls = new LibraryService();
        LibraryUI ui = new LibraryUI(ls);
        ui.start();
    }
}
