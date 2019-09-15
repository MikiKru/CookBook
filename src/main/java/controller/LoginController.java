package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField tf_login;
    @FXML
    private PasswordField pf_password;
    @FXML
    private Label lbl_error;

    @FXML
    void loginAction(ActionEvent event) {
        if(tf_login.getText().equals("user") && pf_password.getText().equals("user")){
            lbl_error.setText("zalogowano");
            lbl_error.setStyle("-fx-text-fill: blue");
        } else {
            lbl_error.setText("błąd logowania");
            lbl_error.setStyle("-fx-text-fill: red");
        }
    }
    @FXML
    void registerAction(ActionEvent event) {

    }
}
