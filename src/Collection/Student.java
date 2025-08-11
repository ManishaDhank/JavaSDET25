package Collection;

import java.util.*;

public class Student implements Comparable<Student>{
int rollNo;
String Name;


//constructor of the class to pass the parameters


public Student (int rollNo, String Name) {
	this.rollNo=rollNo;
	this.Name=Name;
}

//implement compareTo method for natural ordering (by rollNo)

public int compareTo (Student s) {
	return this.rollNo-s.rollNo;
}

public String toString() {

	return rollNo + "_" + Name;
	
}

//sort a list of students by rollNo (Ascending order)

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		 
		students.add(new Student(103,"Ravi"));
		
		students.add(new Student(101,"Rashi"));
		
		students.add(new Student(102,"Zara"));
		Collections.sort(students
				);
		for(Student s: students) {
			System.out.println(s);
		}
	}

}
