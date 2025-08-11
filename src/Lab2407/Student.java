package Lab2407;

public class Student {
	
	//private
	private String name="Harry";
    private int id=78;
    private String department="IT";

    private void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Department: " + department);
    }
    
    //public with protected data
    protected String Name="harry";
    protected int Id=89;
    protected String Department="IT";
    
    public void displayInfo() {
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee ID: " + Id);
        System.out.println("Department: " + Department);
    }
    
    //protected (accessible within package and subclass outside package)
    protected String cname="Aish";
    protected int cId=8;
    protected void customer() {
    	System.out.println("Customer "+ cname);
    	System.out.println("CustomerID "+ cId);
    }
    
    
    // default specifier for games only access in same package
    String gname="PubG";       
    int gid=6;           
    String gtype="online";
    
    void display() {
        System.out.println("Game Name: " + gname);
        System.out.println("Game ID: " + gid);
        System.out.println("Game Type: " + gtype);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s=new Student();
	s.displayDetails(); // private
	s.displayInfo();	//public
	s.customer();		//protected		
	s.display();		//default
	}

}
