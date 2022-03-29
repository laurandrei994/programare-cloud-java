package com.unitbv.datasource;

import com.unitbv.model.Ingredient;
import com.unitbv.model.Recipe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class MyRecipe {

    private List<Recipe> recipes = new ArrayList<Recipe>();

    public MyRecipe(){
    }

    public List<Recipe> getAllRecipes(){
        return recipes;
    }

    public Optional<Recipe> findRecipeByName(String name){
        return recipes.stream().filter(i -> i.getName().equals(name)).findFirst();
    }

    public Recipe saveRecipe(Recipe recipe){
        for(Ingredient ingredient: recipe.getIngredients()){
            if(ingredient.getName() == null){
                throw new RuntimeException("Ingredient name not given");
            }
        }
        if(recipe.getName() == null){
            throw new RuntimeException("Recipe name not given");
        }
        findRecipeByName(recipe.getName()).ifPresent(i -> {
            throw new RuntimeException("Recipe with name " + i.getName() + " already exists!");
        });
        this.recipes.add(recipe);

        return recipe;
    }
}
