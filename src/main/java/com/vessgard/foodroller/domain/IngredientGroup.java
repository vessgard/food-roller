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
    private long id;

    @Column(nullable = false)
    private String name;

    protected IngredientGroup() {
    }

    public IngredientGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
