package com.cookingdata.ingredientstest.service;

import com.cookingdata.ingredientstest.exception.IngredientNotFoundException;
import com.cookingdata.ingredientstest.model.Ingredient;
import com.cookingdata.ingredientstest.repo.IngredientsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    private final IngredientsRepo ingredientsRepo;

    @Autowired
    public IngredientService(IngredientsRepo ingredientsRepo) {
        this.ingredientsRepo = ingredientsRepo;
    }

    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientsRepo.save(ingredient);
    }

    public List<Ingredient> findAllIngredients() {
        return ingredientsRepo.findAll();
    }

    public Ingredient updateIngredient(Ingredient ingredient) {
        return  ingredientsRepo.save(ingredient);
    }

    public Ingredient findIngredientById(Long id) {
        return ingredientsRepo.findIngredientById(id)
                .orElseThrow(() -> new IngredientNotFoundException("Ingredient by id " + id + " was not found"));
    }

    public void deleteIngredient(Long id) {
        ingredientsRepo.deleteById(id);
    }
}
