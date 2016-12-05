package com.vessgard.foodroller.domain;

import java.util.List;

/**
 * IngredientMealItem.
 *
 * @author MiVe
 */
public class RecepieMealItem implements MealItem {

    private Recepie recepie;

    public RecepieMealItem(Recepie recepie) {
        this.recepie = recepie;
    }

    @Override
    public String getDescription() {
        return recepie.getName();
    }

    @Override
    public List<Ingredient> getIngredients() {
        return null;
    }
}
