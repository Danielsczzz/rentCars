package Controller;

import Model.Vehicle;
import View.MainAdminGui;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainAdminController {

    public static MainAdminGui mainAdminFrame = new MainAdminGui();

    public static void showMainAdminFrame() {
        mainAdminFrame.setVisible(true);
    }

    public static void hideMainAdminFrame() {
        mainAdminFrame.setVisible(false);
    }

    public static void fillVehiclesTable() {
        DefaultTableModel tableData = (DefaultTableModel) mainAdminFrame.getVehiclesTable().getModel();
        tableData.setNumRows(0);

        ArrayList<Vehicle> vehicles = Vehicle.getVehiclesDB();
        for (Vehicle v : vehicles) {
            Object[] row = new Object[7];
            row[0] = v.getRowId();
            row[1] = v.getType();
            row[2] = v.getLicensePlate();
            row[3] = v.getVehicleBrand();
            row[4] = v.getModel();
            row[5] = v.getMileage();
            row[6] = v.getDescription();

            tableData.addRow(row);
        }
    }

    public static void eventClickRow() {
        DefaultTableModel tableData = (DefaultTableModel) mainAdminFrame.getVehiclesTable().getModel();
        int nrow = mainAdminFrame.getVehiclesTable().getSelectedRow();
        if (nrow >= 0) {

            String type = tableData.getValueAt(nrow, 1).toString();
            String licensePlate = tableData.getValueAt(nrow, 2).toString();
            String brand = tableData.getValueAt(nrow, 3).toString();
            String model = tableData.getValueAt(nrow, 4).toString();
            String mileage = tableData.getValueAt(nrow, 5).toString();
            String description = tableData.getValueAt(nrow, 6).toString();

            mainAdminFrame.getLicenseTextField().setText(licensePlate);
            mainAdminFrame.getBrandTextField().setText(brand);
            mainAdminFrame.getModelTextField().setText(model);
            mainAdminFrame.getMileageTextField().setText(mileage);
            mainAdminFrame.getDescriptionTextArea().setText(description);
            mainAdminFrame.getTypeComboBox().setSelectedItem(type);
        }
    }

    public static void cleanFields() {
        mainAdminFrame.getLicenseTextField().setText("");
        mainAdminFrame.getBrandTextField().setText("");
        mainAdminFrame.getModelTextField().setText("");
        mainAdminFrame.getMileageTextField().setText("");
        mainAdminFrame.getDescriptionTextArea().setText("");
        mainAdminFrame.getTypeComboBox().setSelectedIndex(0);
    }

    public static void addVehicleEvent() {
        String licensePlate = mainAdminFrame.getLicenseTextField().getText().toUpperCase().trim();
        String brand = mainAdminFrame.getBrandTextField().getText();
        String description = mainAdminFrame.getDescriptionTextArea().getText();
        String model = mainAdminFrame.getModelTextField().getText();
        String mileage = mainAdminFrame.getMileageTextField().getText();
        int type = mainAdminFrame.getTypeComboBox().getSelectedIndex();
        if (MainAdminController.validations(licensePlate, brand, description, model, mileage, type)) {
            Vehicle v = new Vehicle();
            v.setLicensePlate(licensePlate);
            v.setVehicleBrand(brand);
            v.setDescription(description);
            v.setModel(Integer.parseInt(model));
            v.setMileage(Integer.parseInt(mileage));
            Vehicle.addVehicle(v, type);
            MainAdminController.cleanFields();
        }
        MainAdminController.fillVehiclesTable();

    }

    public static void eventUpdate() {
        DefaultTableModel tableData = (DefaultTableModel) mainAdminFrame.getVehiclesTable().getModel();
        int nrow = mainAdminFrame.getVehiclesTable().getSelectedRow();
        if (nrow < 0) {
            JOptionPane.showMessageDialog(null, "is necessary to select a record to update.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        } else {
            int rowId = Integer.parseInt(tableData.getValueAt(nrow, 0).toString());
            String licensePlate = mainAdminFrame.getLicenseTextField().getText().toUpperCase().trim();
            String brand = mainAdminFrame.getBrandTextField().getText();
            String description = mainAdminFrame.getDescriptionTextArea().getText();
            String model = mainAdminFrame.getModelTextField().getText();
            String mileage = mainAdminFrame.getMileageTextField().getText();
            int type = mainAdminFrame.getTypeComboBox().getSelectedIndex();
            if (MainAdminController.validations(licensePlate, brand, description, model, mileage, type)) {
                Vehicle v = new Vehicle();
                v.setRowId(rowId);
                v.setLicensePlate(licensePlate);
                v.setVehicleBrand(brand);
                v.setDescription(description);
                v.setModel(Integer.parseInt(model));
                v.setMileage(Integer.parseInt(mileage));
                Vehicle.updateVehicle(rowId, v, type);
                MainAdminController.cleanFields();
            }
            MainAdminController.fillVehiclesTable();
        }

    }

    public static void eventDelete() {
        DefaultTableModel tableData = (DefaultTableModel) mainAdminFrame.getVehiclesTable().getModel();
        int nrow = mainAdminFrame.getVehiclesTable().getSelectedRow();
        if (nrow >= 0) {
            int rowId = Integer.parseInt(tableData.getValueAt(nrow, 0).toString());
            Vehicle.deleteVehicle(rowId);
            MainAdminController.cleanFields();
            MainAdminController.fillVehiclesTable();
        } else {
            JOptionPane.showMessageDialog(null, "is necessary to select a record to delete.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static boolean validateCarLicense(String licensePlate) {
        Pattern p = Pattern.compile("^[A-Z]{3}[0-9]{3}$");
        Matcher match = p.matcher(licensePlate);

        return match.find();
    }

    private static boolean validateBikeLicense(String licensePlate) {
        Pattern p = Pattern.compile("^[A-Z]{3}[0-9]{2}[A-Z]$");
        Matcher match = p.matcher(licensePlate);

        return match.find();
    }

    private static boolean validateIntegerInput(String input) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher match = p.matcher(input);

        return match.find();
    }

    private static boolean validations(String licensePlate, String brand, String description, String model, String mileage, int type) {
        if (licensePlate.isEmpty() || brand.isEmpty() || description.isEmpty() || model.isEmpty() || mileage.isEmpty() || type == 0) {
            JOptionPane.showMessageDialog(null, "is necessary to fill all the fields", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ((type == 1 && !validateCarLicense(licensePlate)) || (type == 2 && !validateBikeLicense(licensePlate))) {
            JOptionPane.showMessageDialog(null, "The license plate do not corresponse with the vehicle", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!validateIntegerInput(model) || !validateIntegerInput(model)) {
            JOptionPane.showMessageDialog(null, "Please enter valid number values.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (Integer.parseInt(model) > 2023 || Integer.parseInt(model) < 1950) {
            JOptionPane.showMessageDialog(null, "Please enter a valid year.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (Integer.parseInt(mileage) < 1) {
            JOptionPane.showMessageDialog(null, "Please enter a valid mileage.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

}
