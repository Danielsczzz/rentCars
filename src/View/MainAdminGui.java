package View;

import Controller.MainAdminController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainAdminGui extends javax.swing.JFrame {

    public MainAdminGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBarPanel = new javax.swing.JPanel();
        brandLabel = new javax.swing.JLabel();
        vehiclesLabel = new javax.swing.JLabel();
        rentLabel = new javax.swing.JLabel();
        vehicleSeparator = new javax.swing.JSeparator();
        rentSeparator = new javax.swing.JSeparator();
        logOutLabel = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();
        vehiclesPanel = new javax.swing.JPanel();
        VehicleInternal = new javax.swing.JPanel();
        addVehicleLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        infoVehiclePanel = new javax.swing.JPanel();
        licenseLabel = new javax.swing.JLabel();
        licenseTextField = new javax.swing.JTextField();
        brandTextField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        brandVehicleLabel = new javax.swing.JLabel();
        vehicleTypeLabel = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        modelLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        modelTextField = new javax.swing.JTextField();
        mileageLabel = new javax.swing.JLabel();
        mileageTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButtom = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        Scrolltable = new javax.swing.JScrollPane();
        vehiclesTable = new javax.swing.JTable();
        rentsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        rentLabel.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        rentLabel.setForeground(new java.awt.Color(250, 249, 249));
        rentLabel.setText("Rents");
        rentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rentLabelMousePressed(evt);
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
                        .addGap(40, 40, 40)
                        .addComponent(rentLabel))
                    .addGroup(navBarPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vehiclesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vehicleSeparator)
                            .addComponent(rentSeparator)
                            .addComponent(logOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        navBarPanelLayout.setVerticalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(brandLabel)
                .addGap(135, 135, 135)
                .addComponent(vehiclesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehicleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(rentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(logOutLabel)
                .addGap(26, 26, 26))
        );

        getContentPane().add(navBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 560));

        vehiclesPanel.setBackground(new java.awt.Color(238, 240, 242));

        VehicleInternal.setBackground(new java.awt.Color(250, 250, 255));
        VehicleInternal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 219, 213), 1, true));
        VehicleInternal.setForeground(new java.awt.Color(232, 237, 223));

        addVehicleLabel.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        addVehicleLabel.setForeground(new java.awt.Color(36, 36, 35));
        addVehicleLabel.setText("Vehicles info");

        separator.setForeground(new java.awt.Color(36, 36, 35));
        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 35), 2));

        infoVehiclePanel.setBackground(new java.awt.Color(250, 250, 255));

        licenseLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        licenseLabel.setForeground(new java.awt.Color(36, 36, 35));
        licenseLabel.setText("License plate");

        licenseTextField.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N

        brandTextField.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N

        descriptionLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(36, 36, 35));
        descriptionLabel.setText("Description");

        brandVehicleLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        brandVehicleLabel.setForeground(new java.awt.Color(36, 36, 35));
        brandVehicleLabel.setText("Brand");

        vehicleTypeLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        vehicleTypeLabel.setForeground(new java.awt.Color(36, 36, 35));
        vehicleTypeLabel.setText("Vehicle Type");

        TypeComboBox.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Car", "Bike" }));

        modelLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(36, 36, 35));
        modelLabel.setText("Model");

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        scrollPane.setViewportView(descriptionTextArea);

        modelTextField.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N

        mileageLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        mileageLabel.setForeground(new java.awt.Color(36, 36, 35));
        mileageLabel.setText("Mileage");

        mileageTextField.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButtom.setText("Update");
        updateButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtomActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoVehiclePanelLayout = new javax.swing.GroupLayout(infoVehiclePanel);
        infoVehiclePanel.setLayout(infoVehiclePanelLayout);
        infoVehiclePanelLayout.setHorizontalGroup(
            infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                        .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(licenseLabel)
                            .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel))
                        .addGap(60, 60, 60)
                        .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brandVehicleLabel)))
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelLabel)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoVehiclePanelLayout.createSequentialGroup()
                        .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mileageLabel))
                        .addGap(47, 47, 47)
                        .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        infoVehiclePanelLayout.setVerticalGroup(
            infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                        .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(licenseLabel)
                                    .addComponent(brandVehicleLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoVehiclePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mileageLabel)
                                    .addComponent(modelLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButtom)))
                .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                        .addGroup(infoVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(vehicleTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(infoVehiclePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(descriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        tablePanel.setBackground(new java.awt.Color(250, 250, 255));

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
        Scrolltable.setViewportView(vehiclesTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scrolltable)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scrolltable, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VehicleInternalLayout = new javax.swing.GroupLayout(VehicleInternal);
        VehicleInternal.setLayout(VehicleInternalLayout);
        VehicleInternalLayout.setHorizontalGroup(
            VehicleInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VehicleInternalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(VehicleInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addVehicleLabel)
                    .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(VehicleInternalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VehicleInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoVehiclePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        VehicleInternalLayout.setVerticalGroup(
            VehicleInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VehicleInternalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(addVehicleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(infoVehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vehiclesPanelLayout = new javax.swing.GroupLayout(vehiclesPanel);
        vehiclesPanel.setLayout(vehiclesPanelLayout);
        vehiclesPanelLayout.setHorizontalGroup(
            vehiclesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(VehicleInternal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        vehiclesPanelLayout.setVerticalGroup(
            vehiclesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VehicleInternal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPane.addTab("tab2", vehiclesPanel);

        javax.swing.GroupLayout rentsPanelLayout = new javax.swing.GroupLayout(rentsPanel);
        rentsPanel.setLayout(rentsPanelLayout);
        rentsPanelLayout.setHorizontalGroup(
            rentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        rentsPanelLayout.setVerticalGroup(
            rentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        TabbedPane.addTab("tab1", rentsPanel);

        getContentPane().add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -30, 800, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    public JTable getVehiclesTable() {
        return vehiclesTable;
    }

    public void setVehiclesTable(JTable vehiclesTable) {
        this.vehiclesTable = vehiclesTable;
    }
    
    
    private void vehiclesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesLabelMouseClicked
        TabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_vehiclesLabelMouseClicked

    private void rentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentLabelMouseClicked
        TabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_rentLabelMouseClicked

    private void vehiclesLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesLabelMousePressed
        vehicleSeparator.setVisible(true);
        rentSeparator.setVisible(false);
    }//GEN-LAST:event_vehiclesLabelMousePressed

    private void rentLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentLabelMousePressed
        vehicleSeparator.setVisible(false);
        rentSeparator.setVisible(true);
    }//GEN-LAST:event_rentLabelMousePressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        MainAdminController.addVehicleEvent();
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        MainAdminController.cleanFields();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void vehiclesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclesTableMouseClicked
        MainAdminController.eventClickRow();
    }//GEN-LAST:event_vehiclesTableMouseClicked

    private void updateButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtomActionPerformed
        MainAdminController.eventUpdate();
    }//GEN-LAST:event_updateButtomActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        MainAdminController.eventDelete();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MainAdminController.fillVehiclesTable();
        rentSeparator.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        MainAdminController.logOut();
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void logOutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutLabelMousePressed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdminGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scrolltable;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JPanel VehicleInternal;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addVehicleLabel;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JTextField brandTextField;
    private javax.swing.JLabel brandVehicleLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JPanel infoVehiclePanel;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JTextField licenseTextField;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel mileageLabel;
    private javax.swing.JTextField mileageTextField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JPanel navBarPanel;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JSeparator rentSeparator;
    private javax.swing.JPanel rentsPanel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JSeparator separator;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateButtom;
    private javax.swing.JSeparator vehicleSeparator;
    private javax.swing.JLabel vehicleTypeLabel;
    private javax.swing.JLabel vehiclesLabel;
    private javax.swing.JPanel vehiclesPanel;
    private javax.swing.JTable vehiclesTable;
    // End of variables declaration//GEN-END:variables
}
