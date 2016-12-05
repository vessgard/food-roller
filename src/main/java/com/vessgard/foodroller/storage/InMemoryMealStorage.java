package com.vessgard.foodroller.storage;

import com.vessgard.foodroller.domain.Meal;
import com.vessgard.foodroller.domain.User;

import java.time.LocalDate;
import java.util.List;

/**
 * InMemoryMealStorage.
 *
 * @author MiVe
 */
public class InMemoryMealStorage implements MealStorage {
    @Override
    public void save(Meal meal) {

    }

    @Override
    public List<Meal> getMeals(User user, LocalDate fromDate, LocalDate toDate) {
        return null;
    }
}
