package Controller;

import Model.Vehicle;
import View.MainClientGui;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MainClientController {

    public static MainClientGui mainClientFrame = new MainClientGui();

    public static void showMainClientFrame() {
        mainClientFrame.setVisible(true);
    }

    public static void hideMainClientFrame() {
        mainClientFrame.setVisible(false);
    }

    public static void showRentPanel() {
        DefaultTableModel tableData = (DefaultTableModel) mainClientFrame.getVehiclesTable().getModel();
        int nrow = mainClientFrame.getVehiclesTable().getSelectedRow();
        if (nrow >= 0) {

            String type = tableData.getValueAt(nrow, 1).toString();
            String licensePlate = tableData.getValueAt(nrow, 2).toString();
            String brand = tableData.getValueAt(nrow, 3).toString();
            String model = tableData.getValueAt(nrow, 4).toString();
            String mileage = tableData.getValueAt(nrow, 5).toString();
            String description = tableData.getValueAt(nrow, 6).toString();

            mainClientFrame.getLicenseTextField().setText(licensePlate);
            mainClientFrame.getBrandTextField().setText(brand);
            mainClientFrame.getModelTextField().setText(model);
            mainClientFrame.getMileageTextField().setText(mileage);
            mainClientFrame.getDescriptionTextArea().setText(description);
            mainClientFrame.getTypeComboBox().setSelectedItem(type);
        }
        mainClientFrame.getTabbedPane().setSelectedIndex(1);

    }

    public static void fillVehiclesTable() {
        DefaultTableModel tableData = (DefaultTableModel) mainClientFrame.getVehiclesTable().getModel();
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
}
