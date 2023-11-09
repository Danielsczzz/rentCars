package View;

import Controller.LoginController;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setTitle("Login");
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public void setEmailField(JTextField emailField) {
        this.emailField = emailField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        visibleButton = new javax.swing.JToggleButton();
        registerButton = new javax.swing.JButton();
        registerLabel = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(2000, 250));
        setResizable(false);

        LoginLabel.setFont(new java.awt.Font("Droid Sans", 1, 30)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(0, 0, 0));
        LoginLabel.setText("Login");

        emailLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(20, 20, 20));
        emailLabel.setText("Email");

        passwordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        visibleButton.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        visibleButton.setText("Show");
        visibleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visibleButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        registerButton.setText("Sign up here");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        registerLabel.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(0, 0, 0));
        registerLabel.setText("Don't have an account?");

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(20, 20, 20));
        passwordLabel.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerButton))
                            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(visibleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginLabel)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visibleButton))
                .addGap(28, 28, 28)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(registerLabel))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginController.loginEvent();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void visibleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visibleButtonActionPerformed
        if (visibleButton.isSelected()) {
            visibleButton.setText("Hide");
            passwordField.setEchoChar((char) 0);
        } else {
            visibleButton.setText("Show");
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_visibleButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        LoginController.showSignUpEvent();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LoginController.loginEvent();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel userIcon;
    private javax.swing.JToggleButton visibleButton;
    // End of variables declaration//GEN-END:variables
}
