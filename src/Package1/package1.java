package Package1;

public class package1 {
	
	private static String empSalary="7878787";
	private void fetchSalary() {
		System.out.println("The emp Salary is "+ empSalary);
	}
	public void display() {
		System.out.println("Displaying the data");
		
	}
	
	// default variable
	int empID= 7787;
	
	//default method
	void fethempID() {
		System.out.println("The emp ID is "+ empID);
	}
	protected void dam() {
		System.out.println("Dam of water");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
package1 p1=new package1();
p1.display();
p1.fetchSalary();
p1.fethempID();
p1.dam();
	}

}
