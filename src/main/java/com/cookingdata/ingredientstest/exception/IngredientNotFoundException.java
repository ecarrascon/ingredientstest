package com.cookingdata.ingredientstest.exception;

public class IngredientNotFoundException extends  RuntimeException {
    public IngredientNotFoundException(String message) {
        super(message);
    }
}
