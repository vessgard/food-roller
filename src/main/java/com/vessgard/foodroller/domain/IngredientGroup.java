package com.vessgard.foodroller.domain;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * IngredientGroup.
 *
 * @author MiVe
 */
@Entity
public class IngredientGroup {

    @Id
    @GeneratedValue
    private String id;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private Set<Ingredient> ingredients = new HashSet<Ingredient>();

    protected IngredientGroup() {
    }

    public IngredientGroup(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public Set<Ingredient> getIngredients() {
        return Collections.unmodifiableSet(ingredients);
    }
}
