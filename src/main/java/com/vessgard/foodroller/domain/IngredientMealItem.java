package com.vessgard.foodroller.domain;

import java.util.Collections;
import java.util.List;

/**
 * IngredientMealItem.
 *
 * @author MiVe
 */
public class IngredientMealItem implements MealItem {

    private Ingredient ingredient;

    public IngredientMealItem(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String getDescription() {
        return ingredient.getName();
    }

    @Override
    public List<Ingredient> getIngredients() {
        return Collections.singletonList(ingredient);
    }
}
