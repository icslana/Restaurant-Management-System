package com.mycompany.project;
public class Bill extends Order {
     private double totalAmount;
     private static double discount;

     
    public Bill(Order order) {
        this.totalAmount = order.getTotalPrice();
        this.discount = 0.0;
    }

    public double calculateTotal() {
        return totalAmount - discount;
    }

    public String generateInvoice() {
        return "Total Amount: " + totalAmount + "\nDiscount: " + discount + "\nFinal Total: " + calculateTotal();
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    public double getDiscount() {
        return discount;
    }
    public static void setDiscount(double discount) {
        Bill.discount = discount;
    }
}
