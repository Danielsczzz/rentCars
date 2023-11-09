package View;

import Controller.MainClientController;
import com.toedter.calendar.JDateChooser;
import java.time.Instant;
import java.util.Date;
import javax.swing.JComboBox;
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
        return TabbedPane;
    }

    public void setTabbedPane(JTabbedPane TabbedPane) {
        this.TabbedPane = TabbedPane;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBarPanel = new javax.swing.JPanel();
        brandLabel = new javax.swing.JLabel();
        vehiclesLabel = new javax.swing.JLabel();
        myRentsLabel = new javax.swing.JLabel();
        vehicleSeparator = new javax.swing.JSeparator();
        rentSeparator = new javax.swing.JSeparator();
        TabbedPane = new javax.swing.JTabbedPane();
        cataloguePanel = new javax.swing.JPanel();
        catalogueLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        ScrollPane = new javax.swing.JScrollPane();
        vehiclesTable = new javax.swing.JTable();
        showRentButton = new javax.swing.JButton();
        catalogueLabel1 = new javax.swing.JLabel();
        rentPanel = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
        myRentsLabel.setText("Rents");
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
                        .addGap(30, 30, 30)
                        .addGroup(navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vehiclesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vehicleSeparator)
                            .addComponent(rentSeparator)))
                    .addGroup(navBarPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(myRentsLabel)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        navBarPanelLayout.setVerticalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(brandLabel)
                .addGap(77, 77, 77)
                .addComponent(vehiclesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehicleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(myRentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
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

        showRentButton.setText("Rent it!");
        showRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRentButtonActionPerformed(evt);
            }
        });

        catalogueLabel1.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        catalogueLabel1.setForeground(new java.awt.Color(36, 36, 35));
        catalogueLabel1.setText("Select a record to rent it.");

        javax.swing.GroupLayout cataloguePanelLayout = new javax.swing.GroupLayout(cataloguePanel);
        cataloguePanel.setLayout(cataloguePanelLayout);
        cataloguePanelLayout.setHorizontalGroup(
            cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(cataloguePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cataloguePanelLayout.createSequentialGroup()
                            .addGroup(cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cataloguePanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(showRentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(16, 16, 16))
                        .addGroup(cataloguePanelLayout.createSequentialGroup()
                            .addComponent(catalogueLabel)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(cataloguePanelLayout.createSequentialGroup()
                            .addComponent(catalogueLabel1)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(cataloguePanelLayout.createSequentialGroup()
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
        cataloguePanelLayout.setVerticalGroup(
            cataloguePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cataloguePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(catalogueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(catalogueLabel1)
                .addGap(46, 46, 46)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showRentButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPane.addTab("tab1", cataloguePanel);

        rentPanel.setBackground(new java.awt.Color(250, 250, 255));

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

        rentButton.setText("Rent");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rentPanelLayout = new javax.swing.GroupLayout(rentPanel);
        rentPanel.setLayout(rentPanelLayout);
        rentPanelLayout.setHorizontalGroup(
            rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addComponent(returnDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rentseparator)
                    .addComponent(vehicleInfoTitleLabel)
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rentPanelLayout.createSequentialGroup()
                                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(licenseLabel)
                                    .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descriptionLabel))
                                .addGap(24, 24, 24)
                                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brandVehicleLabel)
                                    .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleTypeLabel)
                            .addComponent(modelLabel)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mileageLabel)
                            .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rentsTitleLabel)
                    .addComponent(orderLabel)
                    .addComponent(returnLabel)
                    .addComponent(orderDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        rentPanelLayout.setVerticalGroup(
            rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentPanelLayout.createSequentialGroup()
                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(vehicleInfoTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelLabel)
                            .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(licenseLabel)
                                .addComponent(brandVehicleLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rentPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(descriptionLabel))
                            .addGroup(rentPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(vehicleTypeLabel)))
                        .addGap(35, 35, 35)
                        .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(mileageLabel)
                .addGap(37, 37, 37)
                .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(rentseparator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rentsTitleLabel)
                .addGap(12, 12, 12)
                .addComponent(orderLabel)
                .addGap(10, 10, 10)
                .addComponent(orderDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelButton)
                        .addComponent(rentButton)))
                .addGap(24, 24, 24))
        );

        TabbedPane.addTab("tab2", rentPanel);

        getContentPane().add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -30, 780, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehiclesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesLabelMouseClicked
        TabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_vehiclesLabelMouseClicked

    private void vehiclesLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesLabelMousePressed
        vehicleSeparator.setVisible(true);
        rentSeparator.setVisible(false);
    }//GEN-LAST:event_vehiclesLabelMousePressed

    private void myRentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRentsLabelMouseClicked
        //TabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_myRentsLabelMouseClicked

    private void myRentsLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRentsLabelMousePressed
        vehicleSeparator.setVisible(false);
        rentSeparator.setVisible(true);
    }//GEN-LAST:event_myRentsLabelMousePressed

    private void showRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRentButtonActionPerformed
        MainClientController.fillVehiclesTable();
    }//GEN-LAST:event_showRentButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        TabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        
    }//GEN-LAST:event_rentButtonActionPerformed

    private void vehiclesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesTableMouseClicked
        MainClientController.showRentPanel();
    }//GEN-LAST:event_vehiclesTableMouseClicked

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeComboBoxActionPerformed

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
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JTextField brandTextField;
    private javax.swing.JLabel brandVehicleLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel catalogueLabel;
    private javax.swing.JLabel catalogueLabel1;
    private javax.swing.JPanel cataloguePanel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JTextField licenseTextField;
    private javax.swing.JLabel mileageLabel;
    private javax.swing.JTextField mileageTextField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JLabel myRentsLabel;
    private javax.swing.JPanel navBarPanel;
    private com.toedter.calendar.JDateChooser orderDateChooser;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JButton rentButton;
    private javax.swing.JPanel rentPanel;
    private javax.swing.JSeparator rentSeparator;
    private javax.swing.JLabel rentsTitleLabel;
    private javax.swing.JSeparator rentseparator;
    private com.toedter.calendar.JDateChooser returnDateChooser;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JSeparator separator;
    private javax.swing.JButton showRentButton;
    private javax.swing.JLabel vehicleInfoTitleLabel;
    private javax.swing.JSeparator vehicleSeparator;
    private javax.swing.JLabel vehicleTypeLabel;
    private javax.swing.JLabel vehiclesLabel;
    private javax.swing.JTable vehiclesTable;
    // End of variables declaration//GEN-END:variables
}
