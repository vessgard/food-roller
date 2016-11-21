package com.vessgard.foodroller.controller;

import com.vessgard.foodroller.domain.Ingredient;
import com.vessgard.foodroller.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * IngredientController.
 *
 * @author MiVe
 */
@Controller
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @RequestMapping("list")
    @ResponseBody
    public List<Ingredient> list() {

        return ingredientRepository.findAll();
    }
}
