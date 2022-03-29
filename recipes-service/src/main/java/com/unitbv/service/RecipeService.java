package com.unitbv.service;

import com.unitbv.model.Ingredient;
import com.unitbv.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> getAllRecipes();
    Recipe saveRecipe(Recipe recipe);
}
