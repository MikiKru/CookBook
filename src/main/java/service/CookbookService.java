package service;

import javafx.collections.FXCollections;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Recipe;

import java.util.Arrays;

public class CookbookService {
    public void setSelectedRecipe(
            Recipe recipe, TextField tf_title, TextArea ta_description, TextField tf_type,
            TextField tf_level, TextField tf_meal, TextField tf_time, ListView tf_ingredients){
        // przypisanie pól obiektu Recipe do kontrolek
        tf_title.setText(recipe.getTitle());
        ta_description.setText(recipe.getDescription());
        tf_meal.setText(recipe.getMeal().name());
        tf_level.setText(recipe.getLevel().name());
        tf_type.setText(recipe.getType().name());
        tf_time.setText(String.valueOf(recipe.getPrepareTime()));
        // przypisanie listy składników do LV
        tf_ingredients.setItems(FXCollections.observableArrayList(Arrays.asList(recipe.getIngredients())));
    }
}