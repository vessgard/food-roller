package com.vessgard.foodroller.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * IngredientUsage.
 *
 * @author MiVe
 */
@Entity
public class IngredientUsage {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Ingredient ingredient;

    @Column
    private Date date;

    protected IngredientUsage() {
    }

    public IngredientUsage(Ingredient ingredient, Date date) {
        this.ingredient = ingredient;
        this.date = date;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "IngredientUsage{" +
                "id='" + id + '\'' +
                ", ingredient=" + ingredient +
                ", date=" + date +
                '}';
    }
}
