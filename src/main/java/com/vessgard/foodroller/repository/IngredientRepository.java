package com.vessgard.foodroller.repository;

import com.vessgard.foodroller.domain.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * IngredientRepository.
 *
 * @author MiVe
 */
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
