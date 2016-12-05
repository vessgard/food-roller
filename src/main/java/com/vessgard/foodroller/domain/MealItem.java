package com.vessgard.foodroller.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Meal.
 *
 * @author MiVe
 */
public interface MealItem {

    String getDescription();

    List<Ingredient> getIngredients();
}
