package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vehicle {

    private int rowId;
    private String licensePlate;
    private int model;
    private String vehicleBrand;
    private String description;
    private int mileage;
    private boolean rented;
    private String type;

    public static DB database = new DB();
    public static Connection c = database.connect();

    public Vehicle() {
    }

    public Vehicle(String licensePlate, int model, String vehicleBrand, String description, int mileage, String type) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.vehicleBrand = vehicleBrand;
        this.description = description;
        this.mileage = mileage;
        this.rented = false;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<Vehicle> getVehiclesDB() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM vehicles");
            while (rs.next()) {
                Vehicle v = new Vehicle();
                v.setRowId(rs.getInt("id"));
                v.setLicensePlate(rs.getString("license_plate"));
                v.setVehicleBrand(rs.getString("brand"));
                v.setDescription(rs.getString("description"));
                v.setType(rs.getString("vehicle_type"));
                v.setModel(rs.getInt("model"));
                v.setMileage(rs.getInt("mileage"));
                v.setRented(rs.getBoolean("rented"));
                vehicles.add(v);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return vehicles;
    }

    public static void addVehicle(Vehicle v, int vehicleType) {
        String stringSql = "INSERT INTO vehicles (license_plate, model, brand, description, vehicle_type, mileage, rented) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement query = c.prepareStatement(stringSql);
            query.setString(1, v.getLicensePlate());
            query.setInt(2, v.model);
            query.setString(3, v.getVehicleBrand());
            query.setString(4, v.getDescription());
            query.setInt(5, vehicleType);
            query.setInt(6, v.getMileage());
            query.setBoolean(7, v.isRented());
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vehicle added successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateVehicle(int rowId, Vehicle v, int vehicleType) {
        String stringSql = "UPDATE vehicles SET license_plate = ?, model = ?, brand = ?, description = ?, vehicle_type = ?, mileage = ? WHERE id = ?";
        try {
            PreparedStatement query = c.prepareStatement(stringSql);
            query.setString(1, v.getLicensePlate());
            query.setInt(2, v.getModel());
            query.setString(3, v.getVehicleBrand());
            query.setString(4, v.getDescription());
            query.setInt(5, vehicleType);
            query.setInt(6, v.getMileage());
            query.setInt(7, v.getRowId());
            boolean dbAnswer = query.executeUpdate() == 1;
            if (dbAnswer) {
                JOptionPane.showMessageDialog(null, "Record updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Record not finded");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteVehicle(int rowId) {
        String stringSql = "DELETE FROM vehicles WHERE id = ?";
        try {
            PreparedStatement query = c.prepareStatement(stringSql);
            query.setInt(1, rowId);

            boolean dbAnswer = query.executeUpdate() == 1;
            if (dbAnswer) {
                JOptionPane.showMessageDialog(null, "Record deleted succesfully");
            } else {
                JOptionPane.showMessageDialog(null, "Record not finded");
            }

            // Excepcion para saber si hay algun error
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


}
