package com.mycompany.project;
public class Customer extends Menu {
    private double caloriesConsumed; 
    private static int customerCount = 0; 

    public Customer() {
        caloriesConsumed = 0.0;
        customerCount++; 
    }

    public void browseMenu(Menu menu) {
        menu.displayMenu();
    }

    public void purchase(String name, Menu menu) {
        FoodItem food = menu.searchFood(name);
        if (food != null) {
            caloriesConsumed += food.getCalories();
        }
    }
    
    public void CalculateCalories(int Calories){
    caloriesConsumed  = caloriesConsumed + Calories;
        System.out.println("caloriesConsumed");
    }

    public double getCaloriesConsumed() {
        return caloriesConsumed;
    }

    public void setCaloriesConsumed(double calories) {
        this.caloriesConsumed = calories;
    }

    public static int getCustomerCount() {
        return customerCount;
    }
}

