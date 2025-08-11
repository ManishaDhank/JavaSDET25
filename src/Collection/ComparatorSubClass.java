package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSubClass implements Comparator<Employee>{
	
	public int compare (Employee e1, Employee e2) {
		 return e1.name.compareTo(e2.name); //asc order
	}



//sort a list of students by rollNo (Ascending order)

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		 
		employees.add(new Employee(103,"Ravi"));
		
		employees.add(new Employee(101,"Rashi"));
		
		employees.add(new Employee(102,"Zara"));
		
		employees.add(new Employee(104,"John"));
		
		Collections.sort(employees , new ComparatorSubClass());
		
		for(Employee e: employees) {
			System.out.println(e);
		}
	}}

