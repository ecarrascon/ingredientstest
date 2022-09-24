package com.cookingdata.ingredientstest.repo;

import com.cookingdata.ingredientstest.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientsRepo extends JpaRepository<Ingredient, Long> {
    Optional<Ingredient> findIngredientById(Long id);

}
