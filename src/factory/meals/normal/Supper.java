/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.meals.normal;

import factory.meals.Meal;

public class Supper implements Meal {
    private String description;
    private boolean isDelicious;
    
    public Supper(){
        description = "Tacos, Pizza and Burgers";
        isDelicious = true;
    }
    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
    
}
