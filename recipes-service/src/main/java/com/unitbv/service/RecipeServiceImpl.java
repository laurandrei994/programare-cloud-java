package com.unitbv.service;

import com.unitbv.datasource.MyRecipe;
import com.unitbv.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final MyRecipe recipe;

    @Autowired
    public RecipeServiceImpl(MyRecipe pantry){
        this.recipe = pantry;
    }

    @Override
    public List<Recipe> getAllRecipes(){return recipe.getAllRecipes();}

    @Override
    public Recipe saveRecipe(Recipe recipeToAdd){return recipe.saveRecipe(recipeToAdd); }
}
