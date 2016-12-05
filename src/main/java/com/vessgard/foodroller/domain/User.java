package com.vessgard.foodroller.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * User.
 *
 * @author MiVe
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    private List<Ingredient> ingredients = new ArrayList<>();

    protected User() {
    }

    public User(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
