/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.meals.normal;

import factory.meals.Meal;
import factory.meals.MealFactory;

/**
 *
 * @author ayerj
 */
public class NormalMealFactory implements MealFactory {

    public Meal getMeal(String mealType) {
       switch (mealType) {
            case "breakfast":
                return new Breakfast();
            case "lunch":
                return new Lunch();
            case "supper":
                return new Supper();
            default:
                return null;
        }
    }
    
}
