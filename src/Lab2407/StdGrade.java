package Lab2407;

//Abstract class
abstract class St {
 String name;
 int rollNo;

 // Constructor
 St(String name, int rollNo) {
     this.name = name;
     this.rollNo = rollNo;
 }

 // Abstract method
 abstract String getGrade();
}

//EngineeringStudent subclass
class EngineeringStudent extends St{
 int marks;

 EngineeringStudent(String name, int rollNo, int marks) {
     super(name, rollNo);
     this.marks = marks;
 }

 @Override
 String getGrade() {
     if (marks >= 90) return "A";
     else if (marks >= 75) return "B";
     else if (marks >= 60) return "C";
     else if (marks >= 40) return "D";
     else return "Fail";
 }
}

//MedicalStudent subclass
class MedicalStudent extends St {
 int marks;

 MedicalStudent(String name, int rollNo, int marks) {
     super(name, rollNo);
     this.marks = marks;
 }

 @Override
 String getGrade() {
     if (marks >= 85) return "A";
     else if (marks >= 70) return "B";
     else if (marks >= 55) return "C";
     else if (marks >= 40) return "D";
     else return "Fail";
 }
}

//Main class
public class  StdGrade {
 public static void main(String[] args) {
     // Engineering student
     St eng = new EngineeringStudent("Alice", 101, 82);
     System.out.println("Engineering Student Grade: " + eng.getGrade());

     // Medical student
     St med = new MedicalStudent("Bob", 202, 73);
     System.out.println("Medical Student Grade: " + med.getGrade());
 }
}
