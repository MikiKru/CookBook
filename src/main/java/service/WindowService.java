package service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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
}
