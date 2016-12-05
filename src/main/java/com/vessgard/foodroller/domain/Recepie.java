package com.vessgard.foodroller.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Recepie.
 *
 * @author MiVe
 */
@Entity
public class Recepie {

    @Id
    @GeneratedValue
    private long id;


    protected Recepie() {
    }

    public String getName() {
        return null;
    }
}
