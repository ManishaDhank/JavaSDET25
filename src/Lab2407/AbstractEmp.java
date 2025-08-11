package Lab2407;

//Abstract class
abstract class Employee {
 String name;
 int id;

 // Constructor
 Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Abstract method
 abstract double calculateSalary();
}

//PermanentEmployee subclass
class PermanentEmp extends Employee {
 double monthlySalary;

 // Constructor
 PermanentEmp(String name, int id, double monthlySalary) {
     super(name, id);
     this.monthlySalary = monthlySalary;
 }

 @Override
 double calculateSalary() {
     return monthlySalary;
 }
}

//ContractEmployee subclass
class ContractEmployee extends Employee {
 double hourlyRate;
 int hoursWorked;

 // Constructor
 ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 double calculateSalary() {
     return hourlyRate * hoursWorked;
 }
}


public class AbstractEmp {
 public static void main(String[] args) {
  
     PermanentEmp pe = new PermanentEmp("Con",90,89);
     System.out.println("Permanent Employee Salary: " + pe.calculateSalary());

   
     ContractEmployee ce = new ContractEmployee("Belly", 202, 500, 80);
     System.out.println("Contract Employee Salary: " + ce.calculateSalary());
 }
}