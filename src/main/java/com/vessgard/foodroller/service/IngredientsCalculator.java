package com.vessgard.foodroller.service;

import com.vessgard.foodroller.domain.Ingredient;
import com.vessgard.foodroller.domain.MealType;
import com.vessgard.foodroller.domain.User;

import java.time.LocalDate;
import java.util.List;

/**
 * IngredientsCalculator.
 *
 * @author MiVe
 */
public interface IngredientsCalculator {

    List<Ingredient> getValidIngredients(User user, LocalDate date, MealType mealType);
}
