package com.vessgard.foodroller.repository;

import com.vessgard.foodroller.domain.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MealRepository.
 *
 * @author MiVe
 */
public interface MealRepository extends JpaRepository<Meal, Long> {

}
