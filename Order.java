package com.mycompany.project;
import java.util.ArrayList;
public class Order extends Menu {
    private ArrayList<FoodItem> items;
    private double totalPrice;

    public Order() {
        items = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void addItem(FoodItem food) {
        items.add(food);
        totalPrice += food.getPrice();
    }

    public ArrayList<FoodItem> getItems() {
        return items;
    }
    public void displayOrder() {
        System.out.println("Menu:");        
        for (FoodItem food : items) {
            System.out.println(food.getName() + " " + food.getPrice() + " " + food.getCalories() + " calories");        }
    }
    
    public boolean removeFood(String FoodName){
       for (FoodItem i : items ){
            if(i.getName().equals(FoodName)){
               items.remove(i);
               totalPrice -= i.getPrice();
                return true;
            }
        }
       return false;
   }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
    

