package is.ru.honn.library.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private Connection connection = null;

    public DataBaseConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:data.db");
    }

    public Connection getConnection(){
        return connection;
    }
}
