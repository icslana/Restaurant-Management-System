package com.mycompany.project;
public class Admin extends Menu  {
    private double Profit= 0.1;
    private double salesAmount = 0;

    public Admin(){}
    
    public double getProfit() {
        return Profit;
    }

    public void setProfit(double Profit) {
        this.Profit = Profit;
    }
    
    public void addFood(Days day,int i,FoodItem food){
        day.addFood(i,food);
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
    
    public void removeFood(Days day,int i,String foodName){
        boolean remove = day.removeFood(i,foodName);
        if (remove){
            System.out.println("it is remove");
        }
    }
    
    public void editPrice(Days day,String foodName,double newPrice){
        for (int dayIndex = 0;dayIndex<7;dayIndex++){
            Menu menu = day.getMenuForDay(dayIndex);
            for(FoodItem i: menu.getItems()){
                if (i.getName().equalsIgnoreCase(foodName)) {
                i.setPrice(newPrice);
            }
            }
            
        }
    }
    
    public void CalculateProfit(){ 
        System.out.println("your Profit"+salesAmount*Profit);
    }
    
    
}
