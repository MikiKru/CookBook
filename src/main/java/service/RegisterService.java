package service;

import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterService {
    public void showPassword(
            CheckBox cb_showPassword, TextField tf_password, PasswordField pf_password,
            TextField tf_password_confirm, PasswordField pf_password_confirm){
        if(cb_showPassword.isSelected()){
            // gdy hasło jest widoczne
            tf_password.setVisible(true);
            tf_password_confirm.setVisible(true);
            pf_password.setVisible(false);
            pf_password_confirm.setVisible(false);
            // przeniesienie zawartośći pf do tf
            tf_password.setText(pf_password.getText());
            tf_password_confirm.setText(pf_password_confirm.getText());
        } else {
            // gdy hasło jest ukryte
            tf_password.setVisible(false);
            tf_password_confirm.setVisible(false);
            pf_password.setVisible(true);
            pf_password_confirm.setVisible(true);
            // przeniesienie zawartośći tf do pf
            pf_password.setText(tf_password.getText());
            pf_password_confirm.setText(tf_password_confirm.getText());
        }
    }
}
