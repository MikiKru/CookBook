package service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class WindowService {
    public void openNewWindow(String windowPath, String title) throws IOException {
        // utworzenie obiektu sceny
        Stage registerStage = new Stage();
        Parent resource = FXMLLoader.load(getClass().getResource(windowPath));
        registerStage.setTitle(title);
        Scene scene = new Scene(resource);
        scene.getStylesheets().add("css/init.css");
        registerStage.setScene(scene);
        registerStage.show();
    }
    public void closeCurrentWindow(Node node){
        // dla podanego noda - kontrolki pobierz stage na którym się znajduje
        Stage currentStage = (Stage) node.getScene().getWindow();
        // zamknij stage-a
        currentStage.close();
    }
    public void getConfrimationAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setContentText(content);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            // ... user chose OK
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }
}
