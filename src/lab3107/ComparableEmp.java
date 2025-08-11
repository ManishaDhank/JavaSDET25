package lab3107;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparableEmp implements Comparable<ComparableEmp>{
int Empid;
String Name;


//constructor of the class to pass the parameters


public ComparableEmp (int Empid, String Name) {
	this.Empid=Empid;
	this.Name=Name;
}

//implement compareTo method for natural ordering (by rollNo)

public int compareTo (ComparableEmp s) {
	return this.Name.compareTo(s.Name);
}

public String toString() {

	return Empid + "_" + Name;
	
}

//sort a list of students by rollNo (Ascending order)

	public static void main(String[] args) {
		List<ComparableEmp> emp=new ArrayList<>();
		 
		emp.add(new ComparableEmp(103,"Ravi"));
		
		emp.add(new ComparableEmp(101,"Rashi"));
		
		emp.add(new ComparableEmp(102,"Zara"));
		
		Collections.sort(emp);
		for(ComparableEmp s: emp) {
			System.out.println(s);
		}
	}}