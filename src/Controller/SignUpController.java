package Controller;

import Model.Client;
import Model.User;
import View.SignUp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class SignUpController {

    public static SignUp signUpFrame = new SignUp();

    public static void showSignUp() {
        signUpFrame.setVisible(true);
    }

    public static void hideSignUp() {
        signUpFrame.setVisible(false);
    }

    public static void registerEvent() {
        String clientEmail = signUpFrame.getEmailTextField().getText();
        String clientPassword = signUpFrame.getPasswordField().getText();
        String confirmPassword = signUpFrame.getConfirmField().getText();
        if (validations(clientEmail, clientPassword, confirmPassword)) {
            Client c = new Client();
            c.setEmail(clientEmail);
            c.setPassword(clientPassword);
            User.addUser(c);
            SignUpController.hideSignUp();
        }
    }

    private static boolean validateEmail(String email) {
        Pattern p;
        Matcher match;
        p = Pattern.compile("^[\\w\\\\\\+]+(\\.[\\w\\\\]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");

        match = p.matcher(email);
        return match.find();
    }

    private static boolean validations(String clientEmail, String clientPassword, String confirmPassword) {
        if (clientEmail.isEmpty() || clientPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "is necessary to fill all the fields", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;

        } else if (!clientPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "The confirm password doesn't match", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;

        } else if (clientPassword.length() < 4) {
            JOptionPane.showMessageDialog(null, "The password must be at least 4 characters", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;

        } else if (!validateEmail(clientEmail)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid mail", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return false;

        }
        return true;
    }
}
