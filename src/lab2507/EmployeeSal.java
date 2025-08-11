package lab2507;

class Employee {
    // private fields
    private String name;
    private int id;
    private int salary;

    // Constructor
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        setSalary(salary); 
    }

    // Setter 
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary for " + name);
            this.salary = 0;
        }
    }
 // Getter 
    public int getSalary() {
        return salary;
    }

   
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
       
    }
}


public class EmployeeSal {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("Hana", 10, 8000);
        Employee emp2 = new Employee("Rina", 11, -200); 
        

      
        emp1.displayDetails();
        emp2.displayDetails();
    }
}