package com.vessgard.foodroller.domain;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Meal.
 *
 * @author MiVe
 */
@Entity
public class Meal {

    private User user;
    private LocalDate date;
    private MealType type;
    private List<MealItem> items = new ArrayList<>();

    public Meal(LocalDate date, MealType type) {
        this.date = date;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public MealType getType() {
        return type;
    }

    public void addItem(MealItem item) {
        items.add(item);
    }

    public List<MealItem> getItems() {
        return items;
    }

    public void setItems(List<MealItem> items) {
        this.items = items;
    }

    public List<Ingredient> getIngredients() {
        Set<Ingredient> ingredients = new HashSet<>();

        for (MealItem item : items) {
            ingredients.addAll(item.getIngredients());
        }

        return new ArrayList<>(ingredients);
    }
}
