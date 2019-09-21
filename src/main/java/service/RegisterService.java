package service;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.User;
import utility.InMemoryDB;

import java.util.Optional;

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
    public boolean passwordsEquality(
            CheckBox cb_showPassword, TextField tf_password, PasswordField pf_password,
            TextField tf_password_confirm, PasswordField pf_password_confirm, Label lbl_error){
        if(cb_showPassword.isSelected()){
            if(!tf_password.equals(tf_password_confirm)){
                lbl_error.setText("hasła nie są jednakowe");
                return false;
            }
            return true;
        } else {
            if(!pf_password.equals(pf_password_confirm)){
                lbl_error.setText("hasła nie są jednakowe");
                return false;
            }
            return true;
        }
    }
    public boolean loginCheck(TextField tf_login, Label lbl_error){
        // sprawdzenie czy dany login występuje w bazie danych
        Optional<User> user_valid = InMemoryDB.users.stream()
                                    .filter(user -> user.getLogin().equals(tf_login.getText()))
                                    .findAny();
        if(user_valid.isPresent()){
            lbl_error.setText("Istnieje już użytkownik o podanym loginie");
            return false;
        }
        return true;
    }
}
