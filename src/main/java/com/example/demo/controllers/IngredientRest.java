package com.example.demo.controllers;


import com.example.demo.models.IngredientAmount;
import com.example.demo.models.Recipe;
import com.example.demo.models.User;
import com.example.demo.repositories.IngredientAmountRepository;
import com.example.demo.repositories.IngredientRepository;
import com.example.demo.repositories.RecipeRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class IngredientRest {

    @Resource
    IngredientRepository ingredientRepo;

    @Resource
    IngredientAmountRepository iuRepo;

    @Resource
    RecipeRepository recipeRepo;

    @Resource
    UserRepository userRepo;


    @PostMapping("/add-recipe/{userId}")
    public Collection<Recipe> addRecipeToDB(@RequestBody Recipe incomingRecipe, @PathVariable Long userId) {

        Recipe newRecipe = new Recipe();
        newRecipe.setAllProps(incomingRecipe);
        recipeRepo.save(newRecipe);

        User currentUser = userRepo.findById(userId).get();
        Collection<Recipe> userRecipes = currentUser.getRecipes();
        userRecipes.add(newRecipe);
        currentUser.setRecipes(userRecipes);

        for (IngredientAmount iAmount : newRecipe.getIngredientAmounts()) {
            if (!currentUser.userHasIngredient(iAmount.getIngredient())) {


            }
        }

        userRepo.save(currentUser);
        return (Collection<Recipe>) recipeRepo.findAll();
    }



}
