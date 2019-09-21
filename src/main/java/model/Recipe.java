package model;

import lombok.Data;
import model.enums.Level;
import model.enums.Meal;
import model.enums.Type;

import java.util.ArrayList;
import java.util.List;

@Data
public class Recipe {
    public static int id;
    private int recipe_id;
    private String title;
    private String description;
    private int prepareTime;
    private String imagePath;
    private Meal meal;
    private Level level;
    private Type type;
    private List<Ingredient> ingredients;

    public Recipe(String title,
                  String description,
                  int prepareTime,
                  String imagePath,
                  Meal meal,
                  Level level,
                  Type type,
                  List<Ingredient> ingredients) {
        this.title = title;
        this.description = description;
        this.prepareTime = prepareTime;
        this.imagePath = imagePath;
        this.meal = meal;
        this.level = level;
        this.type = type;
        this.ingredients = ingredients;
        this.recipe_id = id;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Recipe.id = id;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(int prepareTime) {
        this.prepareTime = prepareTime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
