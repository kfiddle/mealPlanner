//package com.example.demo;
//
//
//import com.example.demo.models.*;
//import com.example.demo.repositories.IngredientRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DataJpaTest
//public class JPAWiringTest {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    IngredientRepository ingredientRepo;
//
//
//
//    @Test
//    public void shouldBeAbleToAddRecipeToUser() {
//
//        Ingredient recipe = new Ingredient();
//        ingredientRepo.save(recipe);
//
//        assertEquals(ingredientRepo.count(), 1);
//
//
//    }
//
//
//}
