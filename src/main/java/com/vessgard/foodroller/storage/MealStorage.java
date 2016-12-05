package com.vessgard.foodroller.storage;

import com.vessgard.foodroller.domain.Meal;
import com.vessgard.foodroller.domain.User;

import java.time.LocalDate;
import java.util.List;

/**
 * MealStorage.
 *
 * @author MiVe
 */
public interface MealStorage {

    void save(Meal meal);

    List<Meal> getMeals(User user, LocalDate fromDate, LocalDate toDate);
}
