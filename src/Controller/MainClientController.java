package Controller;

import Model.Bike;
import Model.Car;
import Model.Rent;
import Model.User;
import Model.Vehicle;
import View.MainClientGui;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainClientController {

    public static MainClientGui mainClientFrame = new MainClientGui();
    private static User user;
    private static Vehicle selectVehicle;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        MainClientController.user = user;
    }

    public static Vehicle getVehicle() {
        return selectVehicle;
    }

    public static void setVehicle(Vehicle vehicle) {
        MainClientController.selectVehicle = vehicle;
    }

    public static void showMainClientFrame() {
        fillVehiclesTable();
        mainClientFrame.setVisible(true);
    }

    public static void hideMainClientFrame() {
        mainClientFrame.setVisible(false);
    }

    public static void logOut() {
        mainClientFrame.setVisible(false);
        LoginController.clearFields();
        LoginController.showLogin();
    }

    public static void showRentPanel() {
        DefaultTableModel tableData = (DefaultTableModel) mainClientFrame.getVehiclesTable().getModel();
        int nrow = mainClientFrame.getVehiclesTable().getSelectedRow();
        if (nrow >= 0) {
            ArrayList<Rent> userRents = Rent.getUserRents(user.getId());
            if (userRents.size() > 1) {
            JOptionPane.showMessageDialog(null, "You cannot rent more than two cars at a time.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            } else {

                mainClientFrame.getPreviewPriceTextField().setText("");
                mainClientFrame.getReturnDateChooser().setDate(null);
                mainClientFrame.getInvoiceTextArea().setText("");

                int id = Integer.parseInt(tableData.getValueAt(nrow, 0).toString());
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
                if (type.equals("Car")) {
                    mainClientFrame.getRoadKitCheckBox().setVisible(true);
                    mainClientFrame.getLeaveCheckBox().setVisible(true);
                    mainClientFrame.getHelmetCheckBox().setVisible(false);
                    mainClientFrame.getInsuranceCheckBox().setVisible(false);
                } else {
                    mainClientFrame.getRoadKitCheckBox().setVisible(false);
                    mainClientFrame.getLeaveCheckBox().setVisible(false);
                    mainClientFrame.getHelmetCheckBox().setVisible(true);
                    mainClientFrame.getInsuranceCheckBox().setVisible(true);
                }
                setVehicle(new Vehicle(id, licensePlate, Integer.parseInt(model), brand, description, Integer.parseInt(mileage), type));

                mainClientFrame.getTabbedPane().setSelectedIndex(1);
            }
        }

    }

    public static void searchEvent() {
        DefaultTableModel data = (DefaultTableModel) mainClientFrame.getVehiclesTable().getModel();
        String brandToSearch = mainClientFrame.getSearchTextField().getText().toUpperCase();

        ArrayList<Vehicle> vehicles = Vehicle.getVehiclesDB();

        data.setNumRows(0);
        for (Vehicle v : vehicles) {
            Object[] row = {v.getId(), v.getType(), v.getLicensePlate(), v.getVehicleBrand(), v.getModel(), v.getMileage(), v.getDescription()};
            if (v.getVehicleBrand().toUpperCase().startsWith(brandToSearch)) {
                data.addRow(row);
            }
        }
    }

    public static void fillVehiclesTable() {
        DefaultTableModel tableData = (DefaultTableModel) mainClientFrame.getVehiclesTable().getModel();
        tableData.setNumRows(0);

        ArrayList<Vehicle> vehicles = Vehicle.getVehiclesDB();
        for (Vehicle v : vehicles) {
            if (!v.isRented()) {
                Object[] row = new Object[7];
                row[0] = v.getId();
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

    public static double getRentValue() {
        if (mainClientFrame.getTypeComboBox().getSelectedIndex() == 1) {
            String model = mainClientFrame.getModelTextField().getText();
            int intModel = Integer.parseInt(model);
            boolean roadKit = mainClientFrame.getRoadKitCheckBox().isSelected();
            boolean leaveTown = mainClientFrame.getLeaveCheckBox().isSelected();

            double totalPrice = Car.getCarValue(intModel, roadKit, leaveTown);
            totalPrice = totalPrice + (totalPrice * Rent.IVA);
            return totalPrice;
        }
        String model = mainClientFrame.getModelTextField().getText();
        int intModel = Integer.parseInt(model);
        boolean rentHelmet = mainClientFrame.getHelmetCheckBox().isSelected();
        boolean rentInsurance = mainClientFrame.getInsuranceCheckBox().isSelected();

        double totalPrice = Bike.getBikeValue(intModel, rentHelmet, rentInsurance);
        totalPrice = totalPrice + (totalPrice * Rent.IVA);

        return totalPrice;

    }

    public static void showPreviewValue() {
        double totalPrice = MainClientController.getRentValue();
        String valueFormat = String.format("$%.2f", totalPrice);
        mainClientFrame.getPreviewPriceTextField().setText(valueFormat);
    }

    public static void createRentEvent() {
        Instant limitDay = Instant.now().plus(15, ChronoUnit.DAYS);
        Date limitDate = Date.from(limitDay);
        Date orderDate = mainClientFrame.getOrderDateChooser().getDate();
        Date limitReturnDate = mainClientFrame.getReturnDateChooser().getDate();
        int idUser = user.getId();
        int idVehicle = selectVehicle.getId();
        double rentPrice = MainClientController.getRentValue();
        if (validateRent(orderDate, limitReturnDate, limitDate)) {
            String stringConfirmation = String.format("You want to rent the car with the license plate %s for this price: $%.2f", getVehicle().getLicensePlate(), rentPrice);
            JOptionPane.showConfirmDialog(null, stringConfirmation, "Confirm rent", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            Rent rent = new Rent();
            rent.setIdUser(idUser);
            rent.setIdVehicle(idVehicle);
            rent.setOrderDate(orderDate);
            rent.setLimitDate(limitReturnDate);
            rent.setPrice(rentPrice);
            Rent.addRent(rent);
            String formatInvoice = Rent.printInvoice(rent, user, selectVehicle);
            mainClientFrame.getInvoiceTextArea().setText(formatInvoice);
            selectVehicle.setRented(true);

        }
    }

    public static void downloadInvoice() {
        String invoice = mainClientFrame.getInvoiceTextArea().getText();
        if (invoice.equals("")) {
            JOptionPane.showMessageDialog(null, "You need to rent a car to download the invoice.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        } else {
            Rent.saveInvoice(invoice);
        }
    }

    private static boolean validateRent(Date orderDate, Date returnDate, Date limitDate) {
        if (returnDate == null) {
            JOptionPane.showMessageDialog(null, "The return date can't be empty.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (returnDate.before(orderDate)) {
            JOptionPane.showMessageDialog(null, "The return date cannot be before the current date.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (returnDate.after(limitDate)) {
            JOptionPane.showMessageDialog(null, "The return date cannot be more than two weeks.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (selectVehicle.isRented()) {
            JOptionPane.showMessageDialog(null, "You cannot rent this vehicle now.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static void validateRents() {
        ArrayList<Rent> userRents = Rent.getUserRents(user.getId());

        if (userRents.size() < 1) {
            JOptionPane.showMessageDialog(null, "You don't have any rent at this moment.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        } else if (userRents.size() == 1) {
            int idVehicle1 = userRents.get(0).getIdVehicle();
            Vehicle vehicle = Vehicle.getVehicleDB(idVehicle1);
            String vehicleInfo = String.format("%s %s %s", vehicle.getType(), vehicle.getVehicleBrand(), vehicle.getDescription());
            mainClientFrame.getInfoVehicle1value().setText(vehicleInfo);
            mainClientFrame.getLicense1Value().setText(vehicle.getLicensePlate());
            mainClientFrame.getModel1Value().setText("" + vehicle.getModel());
            mainClientFrame.getOrderDate1RentValue().setText("" + userRents.get(0).getOrderDate());
            mainClientFrame.getLimitDate1rentValue().setText("" + userRents.get(0).getLimitDate());
            mainClientFrame.getRentPrice1Value().setText(String.format("$%.2f", userRents.get(0).getPrice()));

            mainClientFrame.getInfoVehicle2value().setVisible(false);
            mainClientFrame.getLicense2rentLabel().setVisible(false);
            mainClientFrame.getLicense2rentValue().setVisible(false);
            mainClientFrame.getModel2rentLabel().setVisible(false);
            mainClientFrame.getModel2rentValue().setVisible(false);
            mainClientFrame.getOrderDate2rentLabel().setVisible(false);
            mainClientFrame.getOrderDate2RentValue().setVisible(false);
            mainClientFrame.getLimitDate2rentLabel().setVisible(false);
            mainClientFrame.getLimitDate2rentValue().setVisible(false);
            mainClientFrame.getRentPrice2label().setVisible(false);
            mainClientFrame.getRentPrice2Value().setVisible(false);
            mainClientFrame.getReturn2Button().setVisible(false);
            mainClientFrame.getTabbedPane().setSelectedIndex(2);

        } else {
            int idVehicle1 = userRents.get(0).getIdVehicle();
            Vehicle vehicle = Vehicle.getVehicleDB(idVehicle1);
            String vehicleInfo = String.format("%s %s %s", vehicle.getType(), vehicle.getVehicleBrand(), vehicle.getDescription());
            mainClientFrame.getInfoVehicle1value().setText(vehicleInfo);
            mainClientFrame.getLicense1Value().setText(vehicle.getLicensePlate());
            mainClientFrame.getModel1Value().setText("" + vehicle.getModel());
            mainClientFrame.getOrderDate1RentValue().setText("" + userRents.get(0).getOrderDate());
            mainClientFrame.getLimitDate1rentValue().setText("" + userRents.get(0).getLimitDate());
            mainClientFrame.getRentPrice1Value().setText(String.format("$%.2f", userRents.get(0).getPrice()));

            int idVehicle2 = userRents.get(1).getIdVehicle();
            Vehicle vehicle2 = Vehicle.getVehicleDB(idVehicle2);
            String vehicle2Info = String.format("%s %s %s", vehicle2.getType(), vehicle2.getVehicleBrand(), vehicle2.getDescription());
            mainClientFrame.getInfoVehicle2value().setText(vehicle2Info);
            mainClientFrame.getLicense2rentValue().setText(vehicle2.getLicensePlate());
            mainClientFrame.getModel2rentValue().setText("" + vehicle2.getModel());
            mainClientFrame.getOrderDate2RentValue().setText("" + userRents.get(1).getOrderDate());
            mainClientFrame.getLimitDate2rentValue().setText("" + userRents.get(1).getLimitDate());
            mainClientFrame.getRentPrice2Value().setText(String.format("$%.2f", userRents.get(1).getPrice()));
            mainClientFrame.getTabbedPane().setSelectedIndex(2);
        }
    }

    public static void returnVehicle1() {
        ArrayList<Rent> userRents = Rent.getUserRents(user.getId());
        int idVehicle1 = userRents.get(0).getIdVehicle();
        Rent.returnVehicle(idVehicle1);
        fillVehiclesTable();
    }
}
