package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import service.LoginService;

public class LoginController {
    @FXML
    private Button btn_login;
    @FXML
    private Button btn_register;
    @FXML
    private TextField tf_login;
    @FXML
    private PasswordField pf_password;
    @FXML
    private Label lbl_error;
    // pola globalne
    private LoginService loginService;
    // metoda implementująca instrukcje rozpoczynające działanie aplikacji
    public void initialize(){
        loginService = new LoginService();
    }
    @FXML
    void keyLoginAction(KeyEvent keyEvent) {
        // nasłuchiwanie na enter
        if(keyEvent.getCode() == KeyCode.ENTER) {
            loginService.login(lbl_error, tf_login, pf_password);
        }
    }
    @FXML
    void loginAction(ActionEvent event) {
        loginService.login(lbl_error,tf_login,pf_password);
    }
    @FXML
    void registerAction(ActionEvent event) {

    }
    @FXML
    void exitMouseAction(MouseEvent mouseEvent) {
        loginService.setButtonColor(btn_login, "lightgreen");

    }
    @FXML
    void enterMouseAction(MouseEvent mouseEvent) {
        loginService.setButtonColor(btn_login, "lightgrey");
    }
}
