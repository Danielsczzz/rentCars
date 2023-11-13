package Model;

import java.sql.*;
import javax.swing.JOptionPane;

public class User {

    protected int id;
    protected String email;
    protected String password;
    protected boolean admin;

    public static DB database = new DB();
    public static Connection c = database.connect();

    public User() {
    }

    public User(int id, String email, String password, boolean admin) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    @Override
    public String toString() {
        return "User: " + email;
    }

    public static void addUser(User s) {
        String stringQuery = "INSERT INTO users (email, password, admin) VALUES (?,?,?)";
        try {
            PreparedStatement query = c.prepareStatement(stringQuery);
            query.setString(1, s.getEmail());
            query.setString(2, s.getPassword());
            query.setBoolean(3, s.isAdmin());
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "User added succesfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static User getUserDB(String email, String password) {
        String stringQuery = "SELECT * FROM users WHERE email=? AND password=?";
        try {
            PreparedStatement query = c.prepareStatement(stringQuery);
            query.setString(1, email);
            query.setString(2, password);

            ResultSet rs = query.executeQuery();
            if (rs.next()) {
                int idUserDB = rs.getInt(1);
                String emailUserDB = rs.getString(2);
                String passwordUserDB = rs.getString(3);
                boolean isAdminUserDB = rs.getBoolean(4);
                return new User(idUserDB, emailUserDB, passwordUserDB, isAdminUserDB);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


}
