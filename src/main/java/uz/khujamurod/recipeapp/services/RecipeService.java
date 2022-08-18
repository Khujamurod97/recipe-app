package uz.khujamurod.recipeapp.services;

import uz.khujamurod.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
