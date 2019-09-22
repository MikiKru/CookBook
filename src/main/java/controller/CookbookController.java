package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.Recipe;
import service.CookbookService;
import service.WindowService;
import utility.InMemoryDB;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class CookbookController {

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
    @FXML
    private ComboBox<Recipe> cb_recipe;
    // obiekty globalne
    private ObservableList<Recipe> recipes_fx = FXCollections.observableArrayList();
    private WindowService windowService;
    private CookbookService cookbookService;

    public void initialize(){
        windowService = new WindowService();
        cookbookService = new CookbookService();
        // wprowadź obiekty z listy recipes do recipes_fx
        recipes_fx.addAll(InMemoryDB.recipes);
        // wprowadzenie tytułów do combo
        cb_recipe.setItems(recipes_fx);
    }

    @FXML
    void getRecipeAction(ActionEvent event) {
        Recipe selectedRecipe = cb_recipe.getValue();
        cookbookService.setSelectedRecipe(selectedRecipe,
                tf_title,ta_description,tf_type,tf_level,tf_meal,tf_time,tf_ingredients);
    }

    @FXML
    void logoutAction(ActionEvent event) {

    }


}
