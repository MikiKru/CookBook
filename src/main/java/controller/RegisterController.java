package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class RegisterController {
    @FXML
    private TextField tf_login;
    @FXML
    private PasswordField pf_password;
    @FXML
    private Button btn_register;
    @FXML
    private Button btn_back;
    @FXML
    private Label lbl_error;
    @FXML
    private PasswordField pf_password_confirm;
    @FXML
    private TextField tf_password;
    @FXML
    private TextField tf_password_confirm;

    @FXML
    void backAction(ActionEvent event) { }
    @FXML
    void enterMouseAction(MouseEvent event) { }
    @FXML
    void enterRegisterMouseAction(MouseEvent event) { }
    @FXML
    void exitMouseAction(MouseEvent event) { }
    @FXML
    void exitRegisterMouseAction(MouseEvent event) { }
    @FXML
    void keyRegisterAction(KeyEvent event) { }
    @FXML
    void registerAction(ActionEvent event) { }
    @FXML
    void showPasswordAction(ActionEvent event) { }

}
