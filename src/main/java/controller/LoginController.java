package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import service.LoginService;

import java.io.IOException;

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
    void enterMouseAction(MouseEvent mouseEvent) {
        loginService.setButtonColor(btn_login, "lightgrey");
    }
    @FXML
    void enterRegisterMouseAction(MouseEvent event) {
        loginService.setButtonColor(btn_register, "lightgrey");
    }
    @FXML
    void exitMouseAction(MouseEvent mouseEvent) {
        loginService.setButtonColor(btn_login, "lightgreen");
    }
    @FXML
    void exitRegisterMouseAction(MouseEvent event) {
        loginService.setButtonColor(btn_register, "yellow");
    }
    @FXML
    void registerAction(ActionEvent event) throws IOException {
        // utworzenie obiektu sceny
        Stage registerStage = new Stage();
        Parent resource = FXMLLoader.load(getClass().getResource("/view/registerView.fxml"));
        registerStage.setTitle("Panel rejestracji");
        Scene scene = new Scene(resource);
        scene.getStylesheets().add("css/init.css");
        registerStage.setScene(scene);
        registerStage.show();
    }
}
