package Model;

import static Model.User.c;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Rent {

    private int id;
    private int idUser;
    private int idVehicle;

    private Date orderDate;
    private Date returnDate;
    private Date limitDate;

    private double price;

    public static final double IVA = 0.19;

    public Rent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price + (price * Rent.IVA);
    }

    public static void addRent(Rent r) {
        java.sql.Date orderDateSql = new java.sql.Date(r.getOrderDate().getTime());
        java.sql.Date limitDateSql = new java.sql.Date(r.getLimitDate().getTime());
        String stringInsertRentSql = "INSERT INTO rents (id_user, id_vehicle, order_date, limit_date, price) VALUES(?,?,?,?,?)";
        String stringUpdateVehicleSql = "UPDATE vehicles SET rented=? WHERE id=?";

        try {
            PreparedStatement query = c.prepareStatement(stringInsertRentSql);
            query.setInt(1, r.getIdUser());
            query.setInt(2, r.getIdVehicle());
            query.setDate(3, orderDateSql);
            query.setDate(4, limitDateSql);
            query.setDouble(5, r.getPrice());
            query.executeUpdate();

            query = c.prepareStatement(stringUpdateVehicleSql);
            query.setBoolean(1, true);
            query.setInt(2, r.getIdVehicle());
            query.executeUpdate();

            JOptionPane.showMessageDialog(null, "Thank you for rent with us <3");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Rent> getUserRents(int id) {
        ArrayList<Rent> userRents = new ArrayList<>();
        String stringQuery = "SELECT * FROM rents WHERE id_user=?";
        try {
            PreparedStatement query = c.prepareStatement(stringQuery);
            query.setInt(1, id);

            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Rent r = new Rent();
                r.setId(rs.getInt("id_rent"));
                r.setIdUser(rs.getInt("id_user"));
                r.setIdVehicle(rs.getInt("id_vehicle"));
                r.setOrderDate(rs.getDate("order_date"));
                r.setReturnDate(rs.getDate("return_date"));
                r.setLimitDate(rs.getDate("limit_date"));
                r.setPrice(rs.getDouble("price"));
                userRents.add(r);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return userRents;
    }

    public static String printInvoice(Rent r, User s, Vehicle v) {
        Date orderDate = new Date(r.getOrderDate().getTime());
        Date returnDate = new Date(r.getLimitDate().getTime());
        String licensePlate = v.getLicensePlate();
        String vehicleBrand = v.getVehicleBrand();
        int model = v.getModel();
        String userMail = s.getEmail();
        double price = r.getPrice();

        String invoiceText = String.format("                               RENT INVOICE \n"
                + " ====================================\n"
                + "\n"
                + "   Rent vehicle info: "
                + "   vehicle license plate: %s \n"
                + "   vehicle brand and model: %s, %d \n"
                + "\n"
                + " ==================================== \n"
                + "\n"
                + "   User that rent the Vehicle: %s \n"
                + "\n"
                + " ==================================== \n"
                + "\n"
                + "   Order date: %s \n"
                + "   Return date: %s \n"
                + "\n"
                + " ==================================== \n"
                + "\n"
                + "   Rent price with IVA: $%.2f", licensePlate, vehicleBrand, model, userMail, orderDate, returnDate, price);
        return invoiceText;
    }

    public static void saveInvoice(String invoice) {
        try {
            FileWriter writer = new FileWriter("invoice.txt");

            writer.write(invoice);

            writer.close();

            JOptionPane.showMessageDialog(null, "Invoice saved successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
