package dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorDB {
    private static final ConnectorDB instance = new ConnectorDB();
    private String url;
    private String user;
    private String pass;
    private Connection connection;

    private ConnectorDB() {
        try {
        //    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            ResourceBundle resource = ResourceBundle.getBundle("database");
            url = resource.getString("db.url");
            user = resource.getString("db.user");
            pass = resource.getString("db.password");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException("Can't get access to database", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConnectorDB getInstance() {
        return instance;
    }
}
