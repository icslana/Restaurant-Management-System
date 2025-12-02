# Restaurant-Management-System
A Java-based restaurant management system demonstrating OOP concepts, including menu management, customer orders, billing, and weekly scheduling.
Restaurant Management System (Java OOP Project)

A Java-based restaurant management system designed using Object-Oriented Programming (OOP) concepts.  
The system includes menu management, customer interactions, order processing, billing, and daily menu scheduling.  
This project demonstrates clean class design, inheritance, encapsulation, method overriding, and modular programming.

---

📂 Features
- Manage restaurant menus (add, remove, search, edit items)
- Track calorie information for each food item
- Handle customer interactions and orders
- Calculate total orders, prices, calories, and discounts
- Generate detailed invoices
- Admin controls (profit calculation, daily menu editing)
- Weekly menu system with different items for each day



🧱 System Architecture (Class Overview)

**1. Admin**
Handles administrative tasks:
- Add/remove food items for specific days
- Edit prices
- Set profit percentage
- Calculate profits from sales
- Manage daily menus using the `Days` class

**2. Customer**
Used by users to:
- Browse menus
- Purchase items
- Track calorie intake
- Maintain total customer count (static)

**3. FoodItem**
Represents a single food item:
- Name
- Price
- Calorie count
- Getters & setters

**4. Menu**
Maintains a list of food items:
- Add/remove/search items
- Display menu
- Check calories of individual items
- Returns full list of `FoodItem` objects

**5. Order**
Represents a customer's full order:
- Add/remove items
- Calculate total price
- Display order details
- Inherits from `Menu`

**6. Bill**
Handles payment and invoicing:
- Calculates total after discount
- Generates invoice
- Manages static discount applied to all bills

**7. Days**
Represents the weekly menu:
- 7 menus (Sunday → Saturday)
- Add/remove items per day
- Preloaded menus on initialization
- Retrieve menu for a specific day

---

🔧 Technologies Used
- **Java (OOP)**
- ArrayList Collection
- Inheritance, Polymorphism, Encapsulation
- Modular class-based design

---

🚀 How to Run
1. Clone the repo:
```bash
git clone https://github.com/yourusername/RestaurantSystem.git
```

2. Open in any Java IDE (NetBeans, IntelliJ, Eclipse)

3. Compile and run:
```bash
javac *.java
java Main
```

---

🧪 OOP Concepts Demonstrated
✔️ Encapsulation — private fields w/ getters & setters  
✔️ Inheritance — `Order → Menu`, `Bill → Order`, `Days → Menu`  
✔️ Polymorphism — overridden methods where needed  
✔️ Abstraction — clear separation of responsibilities  
✔️ Static Members — global customer count & discount  

---

✨ Example Workflow
- Admin edits weekly menu  
- Customer browses menu  
- Customer creates an order  
- Order calculates total price  
- Bill calculates discount and final total  
- Invoice is generated
