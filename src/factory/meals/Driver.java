package factory.meals;

import factory.meals.german.GermanMealFactory;
import factory.meals.normal.NormalMealFactory;

public class Driver {

    public static void main(String[] args) {
        //GermanMealFactory mealFactory = new GermanMealFactory();
        NormalMealFactory mealFactory = new NormalMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
