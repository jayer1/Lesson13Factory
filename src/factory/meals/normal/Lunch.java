/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.meals.normal;

import factory.meals.Meal;

/**
 *
 * @author ayerj
 */
public class Lunch implements Meal {
    private String description;

    public Lunch() {
        description = "Chicken Caesar Salad";
    }
    
    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
    
}
