package Lab2407;
//Abstract class
abstract class Bill {
 String customerName;
 int accountNumber;

 // Constructor
 Bill(String customerName, int accountNumber) {
     this.customerName = customerName;
     this.accountNumber = accountNumber;
 }

 // Abstract method
 abstract void generateBill();
}

//ElectricityBill subclass
class ElectricityBill extends Bill {
 int unitsConsumed;
 double ratePerUnit = 7.5;

 ElectricityBill(String customerName, int accountNumber, int unitsConsumed) {
     super(customerName, accountNumber);
     this.unitsConsumed = unitsConsumed;
 }

 @Override
 void generateBill() {
     double amount = unitsConsumed * ratePerUnit;
     System.out.println("Electricity Bill");
     System.out.println("Customer: " + customerName);
     System.out.println("Account No: " + accountNumber);
     System.out.println("Units: " + unitsConsumed);
     System.out.println("Total Amount: ₹" + amount);
     System.out.println("----------------------------");
 }
}

//WaterBill subclass
class WaterBill extends Bill {
 int litersUsed;
 double ratePerLiter = 0.05;

 WaterBill(String customerName, int accountNumber, int litersUsed) {
     super(customerName, accountNumber);
     this.litersUsed = litersUsed;
 }

 @Override
 void generateBill() {
     double amount = litersUsed * ratePerLiter;
     System.out.println("Water Bill");
     System.out.println("Customer: " + customerName);
     System.out.println("Account No: " + accountNumber);
     System.out.println("Liters Used: " + litersUsed);
     System.out.println("Total Amount: ₹" + amount);
     System.out.println("----------------------------");
 }
}

//Main class
public class Billing {
 public static void main(String[] args) {
     // Create electricity bill
     Bill electricity = new ElectricityBill("Alice", 12345, 350);
     electricity.generateBill();

     // Create water bill
     Bill water = new WaterBill("Bob", 67890, 1200);
     water.generateBill();
 }
}