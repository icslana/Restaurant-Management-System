package com.mycompany.project;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.DayOfWeek;
public class Project {
    
    static String main_menu = 
            """
            
            **** Select ****
            1.Admin
            2.Customer
            3.Show the menu
            4.Exit
            The Number you chose: """;
    static String Days_menu = 
            """
            
            **** Select the day you want the menu for ****
            1.Sunday
            2.Monday
            3.Tuesday
            4.Wednesday
            5.Thursday
            6.friday
            7.Saturday
            8.Exit
            The Number you chose: """;
    static String Admin_menu = 
            """
            
            **** Select ****
            1.Get Profit rate
            2.Add Food
            3.Remove Food
            4.Edit Price
            5.Add discount
            6.Calculate Profit
            7.Exit
            The Number you chose: """;
    
    static String Customer_menu = 
            """
            
            **** Select ****
            1.Browse Menu
            2.Calculate Calories
            3.Choose Between Item
            4.purchase
            5.Exit
            The Number you chose: """;
    
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        
        int day;
        int commander;
        int employeeNumber;
        int employeeCommander;
        int calories;
        int CustomerCommander;
        int numberOfDishes;
        int Order;
        double sale;
        double price;
        double discount;
        String foodname;
        String choose;
        Days days = new Days();
        Admin admin = new Admin();
        Customer customer = new Customer();
        Order yourOrder = new Order();
        Bill yourBill = new Bill(yourOrder);
        
        do{
        System.out.print(main_menu);
        commander = input.nextInt();
        
            switch (commander) {
                case 1: {
                    System.out.print("Verify your identity with employee number:");
                    employeeNumber = input.nextInt();
                    
                    if(employeeNumber==1375){
                        do{
                        System.out.print(Admin_menu);
                        employeeCommander = input.nextInt();
                        switch(employeeCommander){
                            case 1 :
                                System.out.println(admin.getProfit());
                                break;
                            case 2 :
                                System.out.print("""
                                                   **** Select the day you want to add dish for it ****
                                                        1.Sunday
                                                        2.Monday
                                                        3.Tuesday
                                                        4.Wednesday
                                                        5.Thursday
                                                        6.friday
                                                        7.Saturday
                                                        8.Exit
                                                        The Number you chose: """);
                                day = input.nextInt();
                                
                                System.out.print("""
                                                 Add the new dish:
                                                 Name: """);
                                input.nextLine();
                                foodname = input.nextLine();
                                
                                System.out.print("Price: ");
                                price = input.nextDouble();
                                
                                System.out.print("Calories: ");
                                calories = input.nextInt();
                                
                                FoodItem newfood=new FoodItem(foodname,price,calories);
                                admin.addFood(days,day-1,newfood);
                                break;
                            case 3:
                                System.out.print("""
                                                   **** Select the day you want to remove dish from it ****
                                                    1.Sunday
                                                    2.Monday
                                                    3.Tuesday
                                                    4.Wednesday
                                                    5.Thursday
                                                    6.friday
                                                    7.Saturday
                                                    8.Exit
                                                    The Number you chose: """);
                                day = input.nextInt();
                                input.nextLine();
                                
                                System.out.println("name the dish you want to delete: ");
                                foodname = input.nextLine();
                                admin.removeFood(days,day-1,foodname);
                                break;
                            case 4 :
                                input.nextLine();
                                foodname = input.nextLine();
                                
                                price = input.nextDouble();
                                admin.editPrice(days,foodname,price);
                                break;
                            case 5 :    
                                System.out.println("How much discount do you want to add?");
                                discount = input.nextDouble();
                                Bill.setDiscount(discount);
                            case 6 : 
                                admin.CalculateProfit();
                                break;
                                
                            case 7 : 
                                break;
                                
                            default : 
                                System.out.print("Wrong Entry. Please enter a valid option.");
                        }
                        }
                        while (employeeCommander!=7);
                        break;
                    }
                    else {
                        System.out.print("The employee number incorrect.");  
                        break;
                    }
                }
                    
                case 2:{
                     int getCurrentDayIndex = getCurrentDay();
                        Menu menu = days.getMenuForDay(getCurrentDayIndex);
                       do{
                       System.out.print(Customer_menu); 
                       CustomerCommander = input.nextInt();
                       switch(CustomerCommander){
                           case 1:
                               customer.browseMenu(menu);
                               break;
                               
                           case 2:
                               System.out.print("  Enter the number of dishes you want to calculate their calores: ");
                               numberOfDishes = input.nextInt();
                               int totalCalorie = 0;
                               int Calorie;
                               System.out.println("  Enter the names of dishes: ");
                               input.nextLine();
                               for(int i=0; i < numberOfDishes ;i++){
                                   foodname = input.nextLine();
                                   if(!menu.checkFood(foodname)){
                                     System.out.println("  Dish not found .Try again:\n");
                                     i= -1;
                                     totalCalorie=0;
                                   }
                                   else{
                                    Calorie = menu.CaloriesFood(foodname);
                                    totalCalorie = totalCalorie + Calorie;
                                   }
                               }
                               System.out.println("Calorie: "+totalCalorie);
                               break; 
                               
                           case 3:
                               System.out.println("\n");
                               customer.browseMenu(menu);
                               System.out.print("\nEnter how many dishes you want: ");
                               numberOfDishes = input.nextInt();
                               System.out.print("\nEnter the names of dishes: ");
                               input.nextLine();
                               for(int i=0; i < numberOfDishes ;i++){
                                   foodname = input.nextLine();
                                   yourOrder.addItem(menu.searchFood(foodname));}
                               
                               System.out.println("\n");
                               yourOrder.displayOrder();
                               System.out.print("Do you want to buy now? yes/no: ");
                               choose = input.next();
                               if ("yes".equalsIgnoreCase(choose)){
                                   
                               }  
                               else{
                               break;}
                               
                           case 4:
                               
                               System.out.println("This your order/ ");
                               yourOrder.displayOrder();
                               do{
                               System.out.print("""
                                                  1.Add
                                                  2.Remove
                                                  3.buy
                                                  4.exit
                                                  """);
                                Order=input.nextInt();
                           switch (Order) {
                               case 1:
                                   System.out.print("Enter how many dishes you want: ");
                                   numberOfDishes = input.nextInt();
                                   System.out.print("Enter the names of dishes: ");
                                   input.nextLine();
                                   for(int i=0; i < numberOfDishes ;i++){
                                       foodname = input.nextLine();
                                       yourOrder.addItem(menu.searchFood(foodname));
                                   }   System.out.println("\n");
                                   yourOrder.displayOrder();
                                   break;
                                   
                               case 2:
                                   System.out.print("Enter the name of dish: ");
                                   input.nextLine();
                                   foodname=input.nextLine();
                                   yourOrder.removeFood(foodname);
                                   System.out.println("\n");
                                   yourOrder.displayOrder();
                                   break;
                                   
                               case 3:
                                   yourBill.setTotalAmount(yourOrder.getTotalPrice());
                                   System.out.println("Your Bill:\n"+yourBill.generateInvoice());
                                   sale = yourBill.calculateTotal();
                                   admin.setSalesAmount(sale);
                                   break;
                                   
                               case 4:
                                   break;
                                   
                               default:
                                   break;}
                           
                               }while(Order!=4);
                               
                               break;
                               
                           case 5:
                               break;
                               
                           default:
                               System.out.print("Wrong Entry. Please enter a valid option.");}
                       
                       }while (CustomerCommander!=5);
                       break;}
                case 3: 
                {
                    System.out.print(Days_menu);
                    day = input.nextInt();
                    int x = day - 1;
                    Menu selsctedMenu = days.getMenuForDay(x);
                    selsctedMenu.displayMenu();
                    break;
                }
                case 4: {
                   System.exit(0);}
                default : System.out.print("Wrong Entry. Please enter a valid option.");}
        }
        while (commander!=4);}
   
   private static int getCurrentDay(){
       LocalDate today = LocalDate.now();
       DayOfWeek dayOfweek = today.getDayOfWeek();
        return dayOfweek.getValue()%7;}
}

