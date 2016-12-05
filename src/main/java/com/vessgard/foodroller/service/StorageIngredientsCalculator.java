package com.vessgard.foodroller.service;

import com.vessgard.foodroller.domain.Ingredient;
import com.vessgard.foodroller.domain.Meal;
import com.vessgard.foodroller.domain.MealType;
import com.vessgard.foodroller.domain.User;
import com.vessgard.foodroller.storage.MealStorage;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * StorageIngredientsCalculator.
 *
 * @author MiVe
 */
public class StorageIngredientsCalculator implements IngredientsCalculator {

    private int lookbackDays = 4;
    private MealStorage mealStorage;

    public StorageIngredientsCalculator(MealStorage mealStorage) {
        this.mealStorage = mealStorage;
    }

    public void setLookbackDays(int lookbackDays) {
        this.lookbackDays = lookbackDays;
    }

    public void setMealStorage(MealStorage mealStorage) {
        this.mealStorage = mealStorage;
    }

    @Override
    public List<Ingredient> getValidIngredients(User user, LocalDate date, MealType mealType) {

        LocalDate dateYesterday = date.minusDays(1);

        List<Meal> prevMeals = mealStorage.getMeals(user, date.minusDays(lookbackDays), dateYesterday);

        Set<Ingredient> invalidIngredients = new HashSet<>();

        for (Meal prevMeal : prevMeals) {

            if(!prevMeal.getDate().equals(dateYesterday) || prevMeal.getType().ordinal() < mealType.ordinal()) {

            }
        }

        return null;
    }

    private List<Ingredient> getIngredients(List<Meal> meals) {
        return null;
    }
}
