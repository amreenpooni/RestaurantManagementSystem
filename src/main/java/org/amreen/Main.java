package org.amreen;

import org.amreen.dto.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
        Dish squid = new Dish("Squid", 12.99, FoodType.SEA_FOOD);
        Beverage icedTea = new Beverage("Iced Tea", 3.99, false);
        Combo icedTeaAndSquid = new Combo("Tea & Squid");
        icedTeaAndSquid.addDish(squid);
        icedTeaAndSquid.addBeverage(icedTea);

        restaurantManagementSystem.addCombo(icedTeaAndSquid);

        System.out.println(restaurantManagementSystem);
    }
}