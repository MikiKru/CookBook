package service;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginService {
    public void login(Label lbl_error, TextField tf_login, PasswordField pf_password){
        lbl_error.setVisible(true);
        if(tf_login.getText().equals("user")
                && pf_password.getText().equals("user")){
            lbl_error.setText("zalogowano");
            lbl_error.setStyle("-fx-text-fill: blue");
        } else {
            lbl_error.setText("błąd logowania");
            lbl_error.setStyle("-fx-text-fill: red");
        }
    }
}
