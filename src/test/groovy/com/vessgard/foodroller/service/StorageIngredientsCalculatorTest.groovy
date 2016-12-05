package com.vessgard.foodroller.service

import com.vessgard.foodroller.domain.Ingredient
import com.vessgard.foodroller.domain.MealType
import com.vessgard.foodroller.domain.User
import com.vessgard.foodroller.storage.InMemoryMealStorage
import com.vessgard.foodroller.storage.MealStorage
import spock.lang.Shared
import spock.lang.Specification

import java.time.LocalDate

/**
 * StorageIngredientsCalculatorTest.
 *
 * @author MiVe
 */
class StorageIngredientsCalculatorTest extends Specification {

    private LocalDate date = new LocalDate()

    private Ingredient A = new Ingredient("A")
    private Ingredient B = new Ingredient("B")
    private Ingredient C = new Ingredient("C")
    private Ingredient D = new Ingredient("D")
    private Ingredient E = new Ingredient("E")

    @Shared
    private User user = new User([A, B, C, D, E])

    @Shared
    private StorageIngredientsCalculator ingredientsCalculator = new StorageIngredientsCalculator(mealStorage)


    def "blahaj"(int day, MealType mealType, List<Ingredient> ingredients, List<MealTest> mealTests) {


        when:
        ingredientsCalculator.getValidIngredients(user,)

        then:

        where:

        day | mealType        | ingredients | mealTests
        1   | MealType.Dinner | [A, B, C]   | [new MealTest(2, MealType.Breakfast, [A, B, C, D, E]),
                                               new MealTest(2, MealType.Dinner,    [D, E])]

    }

    class MealTest {
        private int day;
        private MealType type;
        private List<Ingredient> ingredients;

        MealTest(int day, MealType type, List<Ingredient> ingredients) {
            this.day = day
            this.type = type
            this.ingredients = ingredients
        }

        int getDay() {
            return day
        }

        MealType getType() {
            return type
        }

        List<Ingredient> getIngredients() {
            return ingredients
        }
    }
}
