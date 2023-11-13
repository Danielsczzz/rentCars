package Controller;

import Model.User;
import View.Login;
import javax.swing.JOptionPane;

public class LoginController {

    public static Login loginFrame = new Login();

    public static void showLogin() {
        loginFrame.setVisible(true);
    }

    public static void hideLogin() {
        loginFrame.setVisible(false);
    }

    public static void showSignUpEvent() {
        SignUpController.showSignUp();
    }

    public static void clearFields() {
        loginFrame.getEmailField().setText("");
        loginFrame.getPasswordField().setText("");
    }

    public static void loginEvent() {
        String clientEmail = loginFrame.getEmailField().getText();
        String clientPassword = loginFrame.getPasswordField().getText();
        User userDB = User.getUserDB(clientEmail, clientPassword);
        if (clientEmail.isEmpty() || clientPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "is necessary to fill all the fields", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        } else if (userDB != null) {
            if (userDB.isAdmin()) {
                MainAdminController.showMainAdminFrame();
                LoginController.hideLogin();
            } else {
                MainClientController.setUser(userDB);
                MainClientController.showMainClientFrame();
                LoginController.hideLogin();
            }
        } else {
            JOptionPane.showMessageDialog(null, "the email address is not registered", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }

}
