package com.mycompany.project;
import java.util.ArrayList;
import java.util.List;
public class Menu {
   private List<FoodItem> items ;

    public Menu() {
        items = new ArrayList<>();
    }

    public void setItems(ArrayList<FoodItem> items) {
        this.items = items;
    }
    
    
    public List<FoodItem> getItems() {
        return items;
    }
    
   public void addFood(FoodItem food){
       items.add(food);
   }
   
   public boolean removeFood(String FoodName){
       for (FoodItem i : items ){
            if(i.getName().equals(FoodName)){
               items.remove(i);
                return true;
            }
        }
       return false;
   }
   public int CaloriesFood(String FoodName){
       for (FoodItem i : items ){
            if(i.getName().equals(FoodName)){
               int Calories = i.getCalories();
                return Calories;
            }
       }
       return 0;
   }
   
   public FoodItem searchFood(String name) {        
       for (FoodItem food : items) {
            if (food.getName().equalsIgnoreCase(name)) {
                return food; 
            }
       }
        return null;
   }
   
   public boolean checkFood(String name) {        
       for (FoodItem food : items) {
            if (food.getName().equalsIgnoreCase(name)) {
                return true; 
            }
       }
        return false;
   }
   
    public void displayMenu() {
        System.out.println("Menu:");        
        for (FoodItem food : items) {
            System.out.println(food.getName() + " " + food.getPrice() + " " + food.getCalories() + " calories");        }
    }
}
