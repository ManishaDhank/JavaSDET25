package lab3107;

import java.util.*;

//Employee class definition
class Employee {
 int empSal;
 String name;

 public Employee(int  empSal, String name) {
     this. empSal =  empSal;
     this.name = name;
 }


 public String toString() {
     return  empSal + " - " + name;
 }
}

//Comparator for descending order by name
public class CompareDesc implements Comparator<Employee> {

 public int compare(Employee e1, Employee e2) {
     // Descending order
	 return Integer.compare(e2.empSal, e1.empSal);
 }

 public static void main(String[] args) {
	 
     List<Employee> employees = new ArrayList<>();

     employees.add(new Employee(89000, "Ravi"));
     employees.add(new Employee(90000, "Rashi"));
     employees.add(new Employee(78900, "Zara"));
     employees.add(new Employee(10000, "John"));

  
     Collections.sort(employees, new CompareDesc());

   
     for (Employee e : employees) {
         System.out.println(e);
     }
 }
}