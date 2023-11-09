package Model;

import java.sql.*;

public class DB {

    private final String database = "rentcarsProject";
    private final String url = "jdbc:mysql://localhost:3307/" + database;
    private final String user = "root";
    private final String password = "root";
    private Connection c;

    public DB() {
    }

    public Connection connect() {
        try {
            c = DriverManager.getConnection(url, user, password);
            System.out.println("connected!!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return c;
    }
}
