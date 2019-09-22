package service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Ingredient;
import model.Recipe;

import java.util.Arrays;
import java.util.Optional;

public class CookbookService {
    public void setSelectedRecipe(
            Recipe recipe, TextField tf_title, TextArea ta_description, TextField tf_type,
            TextField tf_level, TextField tf_meal, TextField tf_time, ListView tf_ingredients,
            ImageView iv_image) {
        // przypisanie pól obiektu Recipe do kontrolek
        tf_title.setText(recipe.getTitle());
        ta_description.setText(recipe.getDescription());
        tf_meal.setText(recipe.getMeal().name());
        tf_level.setText(recipe.getLevel().name());
        tf_type.setText(recipe.getType().name());
        tf_time.setText(String.valueOf(recipe.getPrepareTime()));
        // przypisanie listy składników do LV
        ObservableList<Ingredient> ingredients = FXCollections.observableArrayList();
        ingredients.addAll(recipe.getIngredients());
        tf_ingredients.setItems(ingredients);
        // ustawienie obrazka na IV
        iv_image.setImage(new Image(recipe.getImagePath()));
    }

    public void setTableProperty(
            TableColumn c_title, TableColumn c_description, TableColumn c_time, TableColumn c_meal,
            TableColumn c_level, TableColumn c_type, TableColumn c_ingredients) {
        c_title.setCellValueFactory(new PropertyValueFactory<>("title"));
        c_description.setCellValueFactory(new PropertyValueFactory<>("description"));
        c_time.setCellValueFactory(new PropertyValueFactory<>("prepareTime"));
        c_meal.setCellValueFactory(new PropertyValueFactory<>("meal"));
        c_level.setCellValueFactory(new PropertyValueFactory<>("level"));
        c_type.setCellValueFactory(new PropertyValueFactory<>("type"));
        c_ingredients.setCellValueFactory(new PropertyValueFactory<>("ingredients"));
    }

    public void setTableItems(TableView tbl_recipes, ObservableList recipes_fx) {
        tbl_recipes.setItems(recipes_fx);
    }

    // metoda pobierająca obiekt z wybranego rekordu
    public Recipe getIdFromSelectedRow(TableView<Recipe> tbl_recipe) {
        return tbl_recipe.getSelectionModel().getSelectedItem();
    }

    // metoda usuwająca recepture po obiekcie Recipe
    public void deleteRecipeById(Recipe recipe, ObservableList recipes_fx) {
        if (recipe != null) {
            recipes_fx.remove(recipe);
        }
    }


}
