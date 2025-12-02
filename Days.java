package com.mycompany.project;
public class Days extends Menu {
   private Menu[] weeklyMenu;

    public Days() {
        weeklyMenu = new Menu[7];
        initializeMenus();
    }
    
    public void addFood(int i,FoodItem food){
        if (i < 0 || i >= 7) {
        throw new IllegalArgumentException("Invalid day index. Must be between 0 and 6.");
    }
        weeklyMenu[i].addFood(food);
    }
    
    public boolean removeFood(int i,String foodName){
        if (i < 0 || i >= 7) {
        throw new IllegalArgumentException("Invalid day index. Must be between 0 and 6.");
         }
        weeklyMenu[i].removeFood(foodName);
       return true;
        
    }

    private void initializeMenus() {
        Menu sundayMenu = new Menu();
        sundayMenu.addFood(new FoodItem("Egg Sandwich", 3.00, 250));
        sundayMenu.addFood(new FoodItem("Cheese Sandwich", 3.00, 250));
        sundayMenu.addFood(new FoodItem("Rice with Chicken", 8.00, 600));
        sundayMenu.addFood(new FoodItem("Burger", 6.50, 700));
        sundayMenu.addFood(new FoodItem("Fresh Fruits", 1.50, 80));
        sundayMenu.addFood(new FoodItem("Natural Juice", 3.00, 120));
        weeklyMenu[0] = sundayMenu;
        
        
        Menu mondayMenu = new Menu();
        mondayMenu.addFood(new FoodItem("Spinach Pastries", 2.50, 300));
        mondayMenu.addFood(new FoodItem("Thyme Sandwich", 3.00, 250));
        mondayMenu.addFood(new FoodItem("Bechamel Pasta", 7.00, 500));
        mondayMenu.addFood(new FoodItem("Green Salad", 4.00, 150));
        mondayMenu.addFood(new FoodItem("Nuts", 3.00, 250));
        mondayMenu.addFood(new FoodItem("Tea", 2.00, 100));
        weeklyMenu[1] = mondayMenu;
        
        
        Menu tuesdayMenu = new Menu();
        tuesdayMenu.addFood(new FoodItem("Cheese Croissant", 2.00, 200));
        tuesdayMenu.addFood(new FoodItem("Lentil Soup", 5.00, 200));
        tuesdayMenu.addFood(new FoodItem("Pasta with Sauce", 7.00, 500));
        tuesdayMenu.addFood(new FoodItem("Falafel Salad", 4.00, 150));
        tuesdayMenu.addFood(new FoodItem("Fresh Fruits", 1.50, 80));
        tuesdayMenu.addFood(new FoodItem("Orange Juice", 3.00, 120));
        weeklyMenu[2] = tuesdayMenu; 
        
        
        Menu wednesdayMenu = new Menu();
        wednesdayMenu.addFood(new FoodItem("Labneh Sandwich", 3.00, 250));
        wednesdayMenu.addFood(new FoodItem("Small Pizza", 6.50, 700));
        wednesdayMenu.addFood(new FoodItem("Vegetable Soup", 5.00, 200));
        wednesdayMenu.addFood(new FoodItem("Tabbouleh Salad", 4.00, 150));
        wednesdayMenu.addFood(new FoodItem("Nuts", 3.00, 250));
        wednesdayMenu.addFood(new FoodItem("Tea", 2.00, 100));
        weeklyMenu[3] = wednesdayMenu; 
        
        
        Menu thursdayMenu = new Menu();
        thursdayMenu.addFood(new FoodItem("Spinach Pies", 2.50, 300));
        thursdayMenu.addFood(new FoodItem("Beef Burger", 6.50, 700));
        thursdayMenu.addFood(new FoodItem("Lentil Soup", 5.00, 200));
        thursdayMenu.addFood(new FoodItem("Green Salad", 4.00, 150));
        thursdayMenu.addFood(new FoodItem("Fresh Fruits", 1.50, 80));
        thursdayMenu.addFood(new FoodItem("Natural Juice", 3.00, 120));
        weeklyMenu[4] = thursdayMenu; 
        
        
        Menu fridayMenu = new Menu();
        fridayMenu.addFood(new FoodItem("Chicken Sandwich", 3.50, 300));
        fridayMenu.addFood(new FoodItem("Thyme Pastries", 2.50, 300));
        fridayMenu.addFood(new FoodItem("Pasta with Sauce", 7.00, 500));
        fridayMenu.addFood(new FoodItem("Fattoush Salad", 4.00, 150));
        fridayMenu.addFood(new FoodItem("Nuts", 3.00, 250));
        fridayMenu.addFood(new FoodItem("Tea", 2.00, 100));
        weeklyMenu[5] = fridayMenu; 
        
        
        Menu saturdayMenu = new Menu();
        saturdayMenu.addFood(new FoodItem("Chocolate Croissant", 2.00, 200));
        saturdayMenu.addFood(new FoodItem("Vegetable Soup", 5.00, 200));
        saturdayMenu.addFood(new FoodItem("Rice with Meat", 8.00, 600));
        saturdayMenu.addFood(new FoodItem("Green Salad", 4.00, 150));
        saturdayMenu.addFood(new FoodItem("Fresh Fruits", 1.50, 80));
        saturdayMenu.addFood(new FoodItem("Apple Juice", 3.00, 120));
        weeklyMenu[6] = saturdayMenu; 
        
    }

    public Menu getMenuForDay(int dayIndex) {
    if (dayIndex < 0 || dayIndex >= 7) {
        throw new IllegalArgumentException("Invalid day index. Must be between 0 and 6.");
    }
    Menu menu = weeklyMenu[dayIndex];
    if (menu == null) {
        throw new IllegalStateException("Menu for the specified day is not initialized.");
    }
    return menu; 
}

}
    

