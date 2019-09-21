package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import model.Recipe;
import utility.InMemoryDB;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CookbookController {
    @FXML
    private ComboBox<String> cb_recipe;
    @FXML
    private TextField tf_type;
    @FXML
    private TextField tf_level;
    @FXML
    private TextField tf_meal;
    @FXML
    private TextField tf_time;
    @FXML
    private ListView<?> tf_ingredients;
    @FXML
    private TextField tf_title;
    @FXML
    private TextArea ta_description;
    @FXML
    private ImageView iv_image;
    // obiekty globalne
    private ObservableList<String> recipes_title = FXCollections.observableArrayList();

    @FXML
    void getReciepeAction(ActionEvent event) { }

    @FXML
    void logoutAction(ActionEvent event) { }

    public void initialize(){
        // wprowadź obiekty z listy recipes do recipes_fx
        for(Recipe recipe : InMemoryDB.recipes){
            recipes_title.add(recipe.getTitle());
        }
        // wprowadzenie tytułów do combo
        cb_recipe.setItems(recipes_title);

    }
}
