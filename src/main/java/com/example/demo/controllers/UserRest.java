package com.example.demo.controllers;


import com.example.demo.models.Ingredient;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class UserRest {

    @Resource
    UserRepository userRepo;


    @PostMapping("add-ingredients/{userId}")
    public void addIngredientsToUser(@RequestBody Ingredient incomingIngredient, @PathVariable Long userId) {

        User userToFind = userRepo.findById(userId).get();

        Collection<Ingredient> currentIngredients = userToFind.getIngredients();

        for (Ingredient ingredient : currentIngredients) {
            if (ingredient.getName().equals(incomingIngredient.getName())) {
                ingredient.setAmount(ingredient.getAmount() + incomingIngredient.getAmount());
            } else {
                currentIngredients.add(incomingIngredient);
            }
        }
        userToFind.setIngredients(currentIngredients);
        userRepo.save(userToFind);
    }

    @PostMapping("get-all-ingredients")
    public Collection<Ingredient> getFullMonty(@RequestBody User user) {

        User userToFind = userRepo.findById(user.getId()).get();

        return userToFind.getIngredients();
    }

}
