package View;

import Controller.MainClientController;
import com.toedter.calendar.JDateChooser;
import java.time.Instant;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainClientGui extends javax.swing.JFrame {

    public MainClientGui() {
        initComponents();
        orderDateChooser.setDate(Date.from(Instant.now()));
    }

    public JDateChooser getOrderDateChooser() {
        return orderDateChooser;
    }

    public void setOrderDateChooser(JDateChooser orderDateChooser) {
        this.orderDateChooser = orderDateChooser;
    }

    public JDateChooser getReturnDateChooser() {
        return returnDateChooser;
    }

    public void setReturnDateChooser(JDateChooser returnDateChooser) {
        this.returnDateChooser = returnDateChooser;
    }

    public JTable getVehiclesTable() {
        return vehiclesTable;
    }

    public void setVehiclesTable(JTable vehiclesTable) {
        this.vehiclesTable = vehiclesTable;
    }

    public JComboBox<String> getTypeComboBox() {
        return TypeComboBox;
    }

    public void setTypeComboBox(JComboBox<String> TypeComboBox) {
        this.TypeComboBox = TypeComboBox;
    }

    public JTextField getBrandTextField() {
        return brandTextField;
    }

    public void setBrandTextField(JTextField brandTextField) {
        this.brandTextField = brandTextField;
    }

    public JTextArea getDescriptionTextArea() {
        return descriptionTextArea;
    }

    public void setDescriptionTextArea(JTextArea descriptionTextArea) {
        this.descriptionTextArea = descriptionTextArea;
    }

    public JTextField getLicenseTextField() {
        return licenseTextField;
    }

    public void setLicenseTextField(JTextField licenseTextField) {
        this.licenseTextField = licenseTextField;
    }

    public JTextField getMileageTextField() {
        return mileageTextField;
    }

    public void setMileageTextField(JTextField mileageTextField) {
        this.mileageTextField = mileageTextField;
    }

    public JTextField getModelTextField() {
        return modelTextField;
    }

    public void setModelTextField(JTextField modelTextField) {
        this.modelTextField = modelTextField;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public void setTabbedPane(JTabbedPane TabbedPane) {
        this.tabbedPane = TabbedPane;
    }

    public JCheckBox getHelmetCheckBox() {
        return helmetCheckBox;
    }

    public void setHelmetCheckBox(JCheckBox HelmetCheckBox) {
        this.helmetCheckBox = HelmetCheckBox;
    }

    public JCheckBox getLeaveCheckBox() {
        return leaveCheckBox;
    }

    public void setLeaveCheckBox(JCheckBox LeaveCheckBox) {
        this.leaveCheckBox = LeaveCheckBox;
    }

    public JCheckBox getInsuranceCheckBox() {
        return insuranceCheckBox;
    }

    public void setInsuranceCheckBox(JCheckBox insuranceCheckBox) {
        this.insuranceCheckBox = insuranceCheckBox;
    }

    public JCheckBox getRoadKitCheckBox() {
        return roadKitCheckBox;
    }

    public void setRoadKitCheckBox(JCheckBox roadKitCheckBox) {
        this.roadKitCheckBox = roadKitCheckBox;
    }

    public JTextField getPreviewPriceTextField() {
        return previewPriceTextField;
    }

    public void setPreviewPriceTextField(JTextField previewPriceTextField) {
        this.previewPriceTextField = previewPriceTextField;
    }

    public JTextField getSearchTextField() {
        return searchTextField;
    }

    public void setSearchTextField(JTextField searchTextField) {
        this.searchTextField = searchTextField;
    }

    public JTextArea getInvoiceTextArea() {
        return invoiceTextArea;
    }

    public void setInvoiceTextArea(JTextArea invoiceTextArea) {
        this.invoiceTextArea = invoiceTextArea;
    }

    public JLabel getInfoVehicle1value() {
        return infoVehicle1value;
    }

    public void setInfoVehicle1value(JLabel infoVehicle1value) {
        this.infoVehicle1value = infoVehicle1value;
    }

    public JLabel getInfoVehicle2value() {
        return infoVehicle2value;
    }

    public void setInfoVehicle2value(JLabel infoVehicle2value) {
        this.infoVehicle2value = infoVehicle2value;
    }

    public JLabel getLicense1Value() {
        return license1Value;
    }

    public void setLicense1Value(JLabel license1Value) {
        this.license1Value = license1Value;
    }

    public JLabel getLicense2rentValue() {
        return license2rentValue;
    }

    public void setLicense2rentValue(JLabel license2rentValue) {
        this.license2rentValue = license2rentValue;
    }

    public JTextField getOrderDate1RentValue() {
        return orderDate1RentValue;
    }

    public void setOrderDate1RentValue(JTextField orderDate1RentValue) {
        this.orderDate1RentValue = orderDate1RentValue;
    }


    public JTextField getLimitDate1rentValue() {
        return limitDate1rentValue;
    }

    public void setLimitDate1rentValue(JTextField limitDate1rentValue) {
        this.limitDate1rentValue = limitDate1rentValue;
    }

    public JTextField getLimitDate2rentValue() {
        return limitDate2rentValue;
    }

    public void setLimitDate2rentValue(JTextField limitDate2rentValue) {
        this.limitDate2rentValue = limitDate2rentValue;
    }

    public JLabel getModel1Value() {
        return model1Value;
    }

    public void setModel1Value(JLabel model1Value) {
        this.model1Value = model1Value;
    }

    public JLabel getModel2rentValue() {
        return model2rentValue;
    }

    public void setModel2rentValue(JLabel model2rentValue) {
        this.model2rentValue = model2rentValue;
    }

    public JLabel getRentPrice1Value() {
        return rentPrice1Value;
    }

    public void setRentPrice1Value(JLabel rentPrice1Value) {
        this.rentPrice1Value = rentPrice1Value;
    }

    public JLabel getRentPrice2Value() {
        return rentPrice2Value;
    }

    public void setRentPrice2Value(JLabel rentPrice2Value) {
        this.rentPrice2Value = rentPrice2Value;
    }

    public JLabel getLicense2rentLabel() {
        return license2rentLabel;
    }

    public void setLicense2rentLabel(JLabel license2rentLabel) {
        this.license2rentLabel = license2rentLabel;
    }

    public JLabel getLimitDate2rentLabel() {
        return limitDate2rentLabel;
    }

    public void setLimitDate2rentLabel(JLabel limitDate2rentLabel) {
        this.limitDate2rentLabel = limitDate2rentLabel;
    }

    public JLabel getModel2rentLabel() {
        return model2rentLabel;
    }

    public void setModel2rentLabel(JLabel model2rentLabel) {
        this.model2rentLabel = model2rentLabel;
    }

    public JTextField getOrderDate2RentValue() {
        return orderDate2RentValue;
    }

    public void setOrderDate2RentValue(JTextField orderDate2RentValue) {
        this.orderDate2RentValue = orderDate2RentValue;
    }

    public JLabel getOrderDate2rentLabel() {
        return orderDate2rentLabel;
    }

    public void setOrderDate2rentLabel(JLabel orderDate2rentLabel) {
        this.orderDate2rentLabel = orderDate2rentLabel;
    }

    public JLabel getRentPrice2label() {
        return rentPrice2label;
    }

    public void setRentPrice2label(JLabel rentPrice2label) {
        this.rentPrice2label = rentPrice2label;
    }

    public JButton getReturn2Button() {
        return return2Button;
    }

    public void setReturn2Button(JButton return2Button) {
        this.return2Button = return2Button;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navBarPanel = new javax.swing.JPanel();
        brandLabel = new javax.swing.JLabel();
        vehiclesLabel = new javax.swing.JLabel();
        myRentsLabel = new javax.swing.JLabel();
        vehicleSeparator = new javax.swing.JSeparator();
        rentSeparator = new javax.swing.JSeparator();
        logOutLabel = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        cataloguePanel = new javax.swing.JPanel();
        catalogueLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        ScrollPane = new javax.swing.JScrollPane();
        vehiclesTable = new javax.swing.JTable();
        catalogueLabel1 = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        showAllButton = new javax.swing.JButton();
        rentVehiclePanel = new javax.swing.JPanel();
        vehicleInfoTitleLabel = new javax.swing.JLabel();
        licenseTextField = new javax.swing.JTextField();
        licenseLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        brandVehicleLabel = new javax.swing.JLabel();
        brandTextField = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        vehicleTypeLabel = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        mileageLabel = new javax.swing.JLabel();
        mileageTextField = new javax.swing.JTextField();
        rentseparator = new javax.swing.JSeparator();
        rentsTitleLabel = new javax.swing.JLabel();
        orderLabel = new javax.swing.JLabel();
        returnLabel = new javax.swing.JLabel();
        orderDateChooser = new com.toedter.calendar.JDateChooser();
        returnDateChooser = new com.toedter.calendar.JDateChooser();
        cancelButton = new javax.swing.JButton();
        rentButton = new javax.swing.JButton();
        helmetCheckBox = new javax.swing.JCheckBox();
        leaveCheckBox = new javax.swing.JCheckBox();
        roadKitCheckBox = new javax.swing.JCheckBox();
        insuranceCheckBox = new javax.swing.JCheckBox();
        previewPriceTextField = new javax.swing.JTextField();
        previewPriceButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTextArea = new javax.swing.JTextArea();
        vehicleInfoTitleLabel1 = new javax.swing.JLabel();
        downloadButton = new javax.swing.JButton();
        myRentsPanel = new javax.swing.JPanel();
        myrentsTitleLabel = new javax.swing.JLabel();
        return1Button = new javax.swing.JButton();
        separator1 = new javax.swing.JSeparator();
        license2rentLabel = new javax.swing.JLabel();
        model2rentLabel = new javax.swing.JLabel();
        limitDate2rentLabel = new javax.swing.JLabel();
        limitDate2rentValue = new javax.swing.JTextField();
        orderDate2RentValue = new javax.swing.JTextField();
        orderDate2rentLabel = new javax.swing.JLabel();
        rentPrice2label = new javax.swing.JLabel();
        return2Button = new javax.swing.JButton();
        infoVehicle1value = new javax.swing.JLabel();
        infoVehicle2value = new javax.swing.JLabel();
        model2rentValue = new javax.swing.JLabel();
        license2rentValue = new javax.swing.JLabel();
        rentPrice2Value = new javax.swing.JLabel();
        rentPrice1Value = new javax.swing.JLabel();
        orderDate1rentLabel8 = new javax.swing.JLabel();
        orderDate1RentValue = new javax.swing.JTextField();
        limitDate1rentValue = new javax.swing.JTextField();
        limitDate1rentLabel = new javax.swing.JLabel();
        orderDate1rentLabel = new javax.swing.JLabel();
        model1Value = new javax.swing.JLabel();
        model1rentLabel = new javax.swing.JLabel();
        license1Value = new javax.swing.JLabel();
        license1rentLabel = new javax.swing.JLabel();
        cancelMyRentsButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(2000, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navBarPanel.setBackground(new java.awt.Color(36, 36, 35));

        brandLabel.setBackground(new java.awt.Color(250, 249, 249));
        brandLabel.setFont(new java.awt.Font("Droid Sans", 1, 22)); // NOI18N
        brandLabel.setForeground(new java.awt.Color(250, 249, 249));
        brandLabel.setText("Rent cars");

        vehiclesLabel.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        vehiclesLabel.setForeground(new java.awt.Color(250, 249, 249));
        vehiclesLabel.setText("Vehicles");
        vehiclesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehiclesLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vehiclesLabelMousePressed(evt);
            }
        });

        myRentsLabel.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        myRentsLabel.setForeground(new java.awt.Color(250, 249, 249));
        myRentsLabel.setText("My rents");
        myRentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myRentsLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myRentsLabelMousePressed(evt);
            }
        });

        vehicleSeparator.setForeground(new java.awt.Color(250, 250, 255));

        rentSeparator.setForeground(new java.awt.Color(250, 250, 255));

        logOutLabel.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(250, 249, 249));
        logOutLabel.setText("Log out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logOutLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout navBarPanelLayout = new javax.swing.GroupLayout(navBarPanel);
        navBarPanel.setLayout(navBarPanelLayout);
        navBarPanelLayout.setHorizontalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createSequentialGroup()
                .addGroup(navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(brandLabel))
                    .addGroup(navBarPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vehiclesLabel)
                            .addComponent(myRentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logOutLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rentSeparator)
                            .addComponent(vehicleSeparator))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        navBarPanelLayout.setVerticalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(brandLabel)
                .addGap(170, 170, 170)
                .addComponent(vehiclesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehicleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(myRentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(logOutLabel)
                .addGap(26, 26, 26))
        );

        getContentPane().add(navBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 550));

        cataloguePanel.setBackground(new java.awt.Color(250, 250, 255));

        catalogueLabel.setFont(new java.awt.Font("Droid Sans", 1, 24)); // NOI18N
        catalogueLabel.setForeground(new java.awt.Color(36, 36, 35));
        catalogueLabel.setText("Vehicles catalogue");

        separator.setForeground(new java.awt.Color(36, 36, 35));
        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 35), 2));

        vehiclesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record", "Type", "License plate", "Brand", "Model", "Mileage", "Description"
            }
        ));
        vehiclesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehiclesTableMouseClicked(evt);
            }
        });
        ScrollPane.setViewportView(vehiclesTable);

        catalogueLabel1.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        catalogueLabel1.setForeground(new java.awt.Color(36, 36, 35));
        catalogueLabel1.setText("Select a record to rent it.");

        searchLabel.setFont(new java.awt.Font("Droid Sans", 0, 16)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(36, 36, 35));
        searchLabel.setText("Search Vehicles by brand");

        searchTextField.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N

        searchButton.setText("Search!");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        showAllButton.setText("Show all");
        showAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cataloguePanelLayout = new javax.swing.GroupLayout(cataloguePanel);
        cataloguePanel.setLayout(cataloguePanelLayout);
        cataloguePanelLayout.setHorizontalGroup(
            cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cataloguePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(catalogueLabel)
                    .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catalogueLabel1)
                    .addGroup(cataloguePanelLayout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addGap(18, 18, 18)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showAllButton))
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        cataloguePanelLayout.setVerticalGroup(
            cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cataloguePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(catalogueLabel)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(catalogueLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(showAllButton))
                .addGap(18, 18, 18)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedPane.addTab("tab1", cataloguePanel);

        rentVehiclePanel.setBackground(new java.awt.Color(250, 250, 255));

        vehicleInfoTitleLabel.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        vehicleInfoTitleLabel.setForeground(new java.awt.Color(36, 36, 35));
        vehicleInfoTitleLabel.setText("Vehicle info");

        licenseTextField.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        licenseTextField.setForeground(new java.awt.Color(36, 36, 35));
        licenseTextField.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        licenseTextField.setEnabled(false);

        licenseLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        licenseLabel.setForeground(new java.awt.Color(36, 36, 35));
        licenseLabel.setText("License plate");

        descriptionLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(36, 36, 35));
        descriptionLabel.setText("Description");

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        descriptionTextArea.setEnabled(false);
        scrollPane.setViewportView(descriptionTextArea);

        brandVehicleLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        brandVehicleLabel.setForeground(new java.awt.Color(36, 36, 35));
        brandVehicleLabel.setText("Brand");

        brandTextField.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        brandTextField.setForeground(new java.awt.Color(36, 36, 35));
        brandTextField.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        brandTextField.setEnabled(false);

        modelLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(36, 36, 35));
        modelLabel.setText("Model");

        modelTextField.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        modelTextField.setForeground(new java.awt.Color(36, 36, 35));
        modelTextField.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        modelTextField.setEnabled(false);

        vehicleTypeLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        vehicleTypeLabel.setForeground(new java.awt.Color(36, 36, 35));
        vehicleTypeLabel.setText("Vehicle Type");

        TypeComboBox.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        TypeComboBox.setForeground(new java.awt.Color(36, 36, 35));
        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Car", "Bike" }));
        TypeComboBox.setEnabled(false);
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });

        mileageLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        mileageLabel.setForeground(new java.awt.Color(36, 36, 35));
        mileageLabel.setText("Mileage");

        mileageTextField.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        mileageTextField.setForeground(new java.awt.Color(36, 36, 35));
        mileageTextField.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        mileageTextField.setEnabled(false);
        mileageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mileageTextFieldActionPerformed(evt);
            }
        });

        rentseparator.setForeground(new java.awt.Color(36, 36, 35));
        rentseparator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 35)));

        rentsTitleLabel.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        rentsTitleLabel.setForeground(new java.awt.Color(36, 36, 35));
        rentsTitleLabel.setText("Rent info");

        orderLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        orderLabel.setForeground(new java.awt.Color(36, 36, 35));
        orderLabel.setText("Order date");

        returnLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(36, 36, 35));
        returnLabel.setText("Return date");

        orderDateChooser.setForeground(new java.awt.Color(36, 36, 35));
        orderDateChooser.setEnabled(false);

        returnDateChooser.setForeground(new java.awt.Color(36, 36, 35));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        rentButton.setText("Rent it!");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
            }
        });

        helmetCheckBox.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        helmetCheckBox.setForeground(new java.awt.Color(36, 36, 35));
        helmetCheckBox.setText("Rent a helmet");

        leaveCheckBox.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        leaveCheckBox.setForeground(new java.awt.Color(36, 36, 35));
        leaveCheckBox.setText("permission leave town");

        roadKitCheckBox.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        roadKitCheckBox.setForeground(new java.awt.Color(36, 36, 35));
        roadKitCheckBox.setText("Rent road kit");

        insuranceCheckBox.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        insuranceCheckBox.setForeground(new java.awt.Color(36, 36, 35));
        insuranceCheckBox.setText("Rent a insurance");
        insuranceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceCheckBoxActionPerformed(evt);
            }
        });

        previewPriceTextField.setForeground(new java.awt.Color(36, 36, 35));
        previewPriceTextField.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        previewPriceTextField.setEnabled(false);

        previewPriceButton.setText("Rent price");
        previewPriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewPriceButtonActionPerformed(evt);
            }
        });

        invoiceTextArea.setColumns(20);
        invoiceTextArea.setRows(5);
        invoiceTextArea.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        invoiceTextArea.setEnabled(false);
        jScrollPane1.setViewportView(invoiceTextArea);

        vehicleInfoTitleLabel1.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        vehicleInfoTitleLabel1.setForeground(new java.awt.Color(36, 36, 35));
        vehicleInfoTitleLabel1.setText("Vehicle info");

        downloadButton.setText("Download Invoice");
        downloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rentVehiclePanelLayout = new javax.swing.GroupLayout(rentVehiclePanel);
        rentVehiclePanel.setLayout(rentVehiclePanelLayout);
        rentVehiclePanelLayout.setHorizontalGroup(
            rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleInfoTitleLabel)
                            .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rentVehiclePanelLayout.createSequentialGroup()
                                        .addComponent(descriptionLabel)
                                        .addGap(184, 184, 184))
                                    .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(licenseLabel)
                                                    .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(brandVehicleLabel)
                                                    .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(25, 25, 25)))
                                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelLabel)
                                    .addComponent(mileageLabel)
                                    .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehicleTypeLabel)
                                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(orderLabel)
                            .addComponent(rentsTitleLabel)
                            .addComponent(rentseparator, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleInfoTitleLabel1)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rentVehiclePanelLayout.createSequentialGroup()
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnLabel)
                            .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                .addComponent(orderDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(roadKitCheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(helmetCheckBox))
                                    .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(leaveCheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(insuranceCheckBox)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(previewPriceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(previewPriceTextField)
                                    .addComponent(rentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addComponent(downloadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        rentVehiclePanelLayout.setVerticalGroup(
            rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleInfoTitleLabel1)
                    .addComponent(vehicleInfoTitleLabel))
                .addGap(26, 26, 26)
                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brandVehicleLabel)
                            .addComponent(licenseLabel)
                            .addComponent(modelLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionLabel)
                            .addComponent(vehicleTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                                .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(mileageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addComponent(rentseparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rentsTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderLabel))
                    .addComponent(jScrollPane1))
                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(helmetCheckBox)
                                .addComponent(roadKitCheckBox)))
                        .addGap(21, 21, 21)
                        .addComponent(returnLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rentVehiclePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(downloadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previewPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previewPriceButton)
                            .addComponent(leaveCheckBox)
                            .addComponent(insuranceCheckBox))))
                .addGap(18, 18, 18)
                .addGroup(rentVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(rentButton))
                .addGap(18, 18, 18))
        );

        tabbedPane.addTab("tab2", rentVehiclePanel);

        myRentsPanel.setBackground(new java.awt.Color(250, 250, 255));

        myrentsTitleLabel.setFont(new java.awt.Font("Droid Sans", 1, 22)); // NOI18N
        myrentsTitleLabel.setForeground(new java.awt.Color(36, 36, 35));
        myrentsTitleLabel.setText("My rents");

        return1Button.setText("Return vehicle");
        return1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return1ButtonActionPerformed(evt);
            }
        });

        separator1.setForeground(new java.awt.Color(36, 36, 35));
        separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator1.setToolTipText("");
        separator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 35), 2));

        license2rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        license2rentLabel.setForeground(new java.awt.Color(36, 36, 35));
        license2rentLabel.setText("License Plate");

        model2rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        model2rentLabel.setForeground(new java.awt.Color(36, 36, 35));
        model2rentLabel.setText("Model");

        limitDate2rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        limitDate2rentLabel.setForeground(new java.awt.Color(36, 36, 35));
        limitDate2rentLabel.setText("Limit date");

        limitDate2rentValue.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        limitDate2rentValue.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        limitDate2rentValue.setEnabled(false);

        orderDate2RentValue.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        orderDate2RentValue.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        orderDate2RentValue.setEnabled(false);

        orderDate2rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        orderDate2rentLabel.setForeground(new java.awt.Color(36, 36, 35));
        orderDate2rentLabel.setText("Order date");

        rentPrice2label.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        rentPrice2label.setForeground(new java.awt.Color(36, 36, 35));
        rentPrice2label.setText("Rent price");

        return2Button.setText("Return vehicle");

        infoVehicle1value.setFont(new java.awt.Font("Droid Sans", 1, 22)); // NOI18N
        infoVehicle1value.setForeground(new java.awt.Color(36, 36, 35));
        infoVehicle1value.setText("Vehicle");

        infoVehicle2value.setFont(new java.awt.Font("Droid Sans", 1, 22)); // NOI18N
        infoVehicle2value.setForeground(new java.awt.Color(36, 36, 35));
        infoVehicle2value.setText("Vehicle");

        model2rentValue.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        model2rentValue.setForeground(new java.awt.Color(36, 36, 35));
        model2rentValue.setText("Model");

        license2rentValue.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        license2rentValue.setForeground(new java.awt.Color(36, 36, 35));
        license2rentValue.setText("License Plate");

        rentPrice2Value.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        rentPrice2Value.setForeground(new java.awt.Color(36, 36, 35));
        rentPrice2Value.setText("Rent price");

        rentPrice1Value.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        rentPrice1Value.setForeground(new java.awt.Color(36, 36, 35));
        rentPrice1Value.setText("Rent price");

        orderDate1rentLabel8.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        orderDate1rentLabel8.setForeground(new java.awt.Color(36, 36, 35));
        orderDate1rentLabel8.setText("Rent price");

        orderDate1RentValue.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        orderDate1RentValue.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        orderDate1RentValue.setEnabled(false);

        limitDate1rentValue.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        limitDate1rentValue.setDisabledTextColor(new java.awt.Color(36, 36, 35));
        limitDate1rentValue.setEnabled(false);

        limitDate1rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        limitDate1rentLabel.setForeground(new java.awt.Color(36, 36, 35));
        limitDate1rentLabel.setText("Limit date");

        orderDate1rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        orderDate1rentLabel.setForeground(new java.awt.Color(36, 36, 35));
        orderDate1rentLabel.setText("Order date");

        model1Value.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        model1Value.setForeground(new java.awt.Color(36, 36, 35));
        model1Value.setText("Model");

        model1rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        model1rentLabel.setForeground(new java.awt.Color(36, 36, 35));
        model1rentLabel.setText("Model");

        license1Value.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        license1Value.setForeground(new java.awt.Color(36, 36, 35));
        license1Value.setText("License Plate");

        license1rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        license1rentLabel.setForeground(new java.awt.Color(36, 36, 35));
        license1rentLabel.setText("License Plate");

        cancelMyRentsButton.setText("Cancel");

        javax.swing.GroupLayout myRentsPanelLayout = new javax.swing.GroupLayout(myRentsPanel);
        myRentsPanel.setLayout(myRentsPanelLayout);
        myRentsPanelLayout.setHorizontalGroup(
            myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myRentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myRentsPanelLayout.createSequentialGroup()
                        .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myRentsPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(infoVehicle1value)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myRentsPanelLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(orderDate1rentLabel)
                                                .addComponent(orderDate1RentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                            .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(limitDate1rentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(limitDate1rentLabel))
                                            .addGap(72, 72, 72)))
                                    .addGroup(myRentsPanelLayout.createSequentialGroup()
                                        .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(license1rentLabel)
                                            .addComponent(license1Value)
                                            .addComponent(model1rentLabel)
                                            .addComponent(model1Value))
                                        .addGap(45, 45, 45))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myRentsPanelLayout.createSequentialGroup()
                                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderDate1rentLabel8)
                                    .addComponent(return1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rentPrice1Value))
                                .addGap(29, 29, 29)))
                        .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myRentsPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(myRentsPanelLayout.createSequentialGroup()
                                        .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(orderDate2rentLabel)
                                            .addComponent(orderDate2RentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rentPrice2label)
                                            .addComponent(rentPrice2Value))
                                        .addGap(83, 83, 83)
                                        .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(limitDate2rentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(limitDate2rentLabel)))
                                    .addComponent(return2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(infoVehicle2value)
                            .addComponent(license2rentValue)
                            .addComponent(model2rentLabel)
                            .addComponent(model2rentValue)
                            .addComponent(license2rentLabel)))
                    .addComponent(myrentsTitleLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myRentsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelMyRentsButton)
                .addGap(30, 30, 30))
        );
        myRentsPanelLayout.setVerticalGroup(
            myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myRentsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(myrentsTitleLabel)
                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myRentsPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myRentsPanelLayout.createSequentialGroup()
                                .addComponent(infoVehicle2value)
                                .addGap(18, 18, 18)
                                .addComponent(license2rentLabel)
                                .addGap(7, 7, 7)
                                .addComponent(license2rentValue)
                                .addGap(37, 37, 37)
                                .addComponent(model2rentLabel)
                                .addGap(18, 18, 18)
                                .addComponent(model2rentValue)
                                .addGap(37, 37, 37)
                                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(limitDate2rentLabel)
                                    .addComponent(orderDate2rentLabel))
                                .addGap(18, 18, 18)
                                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(limitDate2rentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderDate2RentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(rentPrice2label)
                                .addGap(18, 18, 18)
                                .addComponent(rentPrice2Value)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(return2Button))
                            .addGroup(myRentsPanelLayout.createSequentialGroup()
                                .addComponent(infoVehicle1value)
                                .addGap(18, 18, 18)
                                .addComponent(license1rentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(license1Value)
                                .addGap(40, 40, 40)
                                .addComponent(model1rentLabel)
                                .addGap(18, 18, 18)
                                .addComponent(model1Value)
                                .addGap(43, 43, 43)
                                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(orderDate1rentLabel)
                                    .addComponent(limitDate1rentLabel))
                                .addGap(18, 18, 18)
                                .addGroup(myRentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(limitDate1rentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderDate1RentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(orderDate1rentLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(rentPrice1Value)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(return1Button)))
                        .addGap(10, 10, 10))
                    .addGroup(myRentsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(cancelMyRentsButton)
                .addGap(25, 25, 25))
        );

        tabbedPane.addTab("tab3", myRentsPanel);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -30, 800, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehiclesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesLabelMouseClicked
        tabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_vehiclesLabelMouseClicked

    private void vehiclesLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesLabelMousePressed
        vehicleSeparator.setVisible(true);
        rentSeparator.setVisible(false);
    }//GEN-LAST:event_vehiclesLabelMousePressed

    private void myRentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRentsLabelMouseClicked
        MainClientController.validateRents();
        
    }//GEN-LAST:event_myRentsLabelMouseClicked

    private void myRentsLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRentsLabelMousePressed
        vehicleSeparator.setVisible(false);
        rentSeparator.setVisible(true);
    }//GEN-LAST:event_myRentsLabelMousePressed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        MainClientController.fillVehiclesTable();
        tabbedPane.setSelectedIndex(0);
        previewPriceTextField.setText("");
        helmetCheckBox.setSelected(false);
        insuranceCheckBox.setSelected(false);
        leaveCheckBox.setSelected(false);
        roadKitCheckBox.setSelected(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        MainClientController.createRentEvent();
    }//GEN-LAST:event_rentButtonActionPerformed

    private void vehiclesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesTableMouseClicked
        MainClientController.showRentPanel();
    }//GEN-LAST:event_vehiclesTableMouseClicked

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeComboBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MainClientController.fillVehiclesTable();
        rentSeparator.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void mileageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mileageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mileageTextFieldActionPerformed

    private void previewPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewPriceButtonActionPerformed
        MainClientController.showPreviewValue();
    }//GEN-LAST:event_previewPriceButtonActionPerformed

    private void insuranceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insuranceCheckBoxActionPerformed

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        MainClientController.logOut();
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void logOutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutLabelMousePressed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        MainClientController.searchEvent();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void showAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllButtonActionPerformed
        searchTextField.setText("");
        MainClientController.fillVehiclesTable();
    }//GEN-LAST:event_showAllButtonActionPerformed

    private void downloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadButtonActionPerformed
        MainClientController.downloadInvoice();
    }//GEN-LAST:event_downloadButtonActionPerformed

    private void return1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return1ButtonActionPerformed
        MainClientController.returnVehicle1();
        tabbedPane.setSelectedIndex(0);
        vehicleSeparator.setVisible(true);
        rentSeparator.setVisible(false);
    }//GEN-LAST:event_return1ButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainClientGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainClientGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainClientGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainClientGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainClientGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JTextField brandTextField;
    private javax.swing.JLabel brandVehicleLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelMyRentsButton;
    private javax.swing.JLabel catalogueLabel;
    private javax.swing.JLabel catalogueLabel1;
    private javax.swing.JPanel cataloguePanel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JButton downloadButton;
    private javax.swing.JCheckBox helmetCheckBox;
    private javax.swing.JLabel infoVehicle1value;
    private javax.swing.JLabel infoVehicle2value;
    private javax.swing.JCheckBox insuranceCheckBox;
    private javax.swing.JTextArea invoiceTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox leaveCheckBox;
    private javax.swing.JLabel license1Value;
    private javax.swing.JLabel license1rentLabel;
    private javax.swing.JLabel license2rentLabel;
    private javax.swing.JLabel license2rentValue;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JTextField licenseTextField;
    private javax.swing.JLabel limitDate1rentLabel;
    private javax.swing.JTextField limitDate1rentValue;
    private javax.swing.JLabel limitDate2rentLabel;
    private javax.swing.JTextField limitDate2rentValue;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel mileageLabel;
    private javax.swing.JTextField mileageTextField;
    private javax.swing.JLabel model1Value;
    private javax.swing.JLabel model1rentLabel;
    private javax.swing.JLabel model2rentLabel;
    private javax.swing.JLabel model2rentValue;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JLabel myRentsLabel;
    private javax.swing.JPanel myRentsPanel;
    private javax.swing.JLabel myrentsTitleLabel;
    private javax.swing.JPanel navBarPanel;
    private javax.swing.JTextField orderDate1RentValue;
    private javax.swing.JLabel orderDate1rentLabel;
    private javax.swing.JLabel orderDate1rentLabel8;
    private javax.swing.JTextField orderDate2RentValue;
    private javax.swing.JLabel orderDate2rentLabel;
    private com.toedter.calendar.JDateChooser orderDateChooser;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JButton previewPriceButton;
    private javax.swing.JTextField previewPriceTextField;
    private javax.swing.JButton rentButton;
    private javax.swing.JLabel rentPrice1Value;
    private javax.swing.JLabel rentPrice2Value;
    private javax.swing.JLabel rentPrice2label;
    private javax.swing.JSeparator rentSeparator;
    private javax.swing.JPanel rentVehiclePanel;
    private javax.swing.JLabel rentsTitleLabel;
    private javax.swing.JSeparator rentseparator;
    private javax.swing.JButton return1Button;
    private javax.swing.JButton return2Button;
    private com.toedter.calendar.JDateChooser returnDateChooser;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JCheckBox roadKitCheckBox;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JButton showAllButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel vehicleInfoTitleLabel;
    private javax.swing.JLabel vehicleInfoTitleLabel1;
    private javax.swing.JSeparator vehicleSeparator;
    private javax.swing.JLabel vehicleTypeLabel;
    private javax.swing.JLabel vehiclesLabel;
    private javax.swing.JTable vehiclesTable;
    // End of variables declaration//GEN-END:variables
}
