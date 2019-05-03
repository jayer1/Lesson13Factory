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
public class Breakfast implements Meal {
    private String description;
    private int calories;
    
    public Breakfast() {
        description = "Eggs, Bacon, Salmon, Cream Cheese and Bagel";
        calories = 1027;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
    
}
