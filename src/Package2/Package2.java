package Package2;
import Package1.package1;

public class Package2 {
	public void print() {
		System.out.println("Printing the data");
		
	}
	public static void main(String[] args) {
		package1 p1=new package1();
		Package2 p=new Package2();
		p1.display();
		p.print();
		
	}
	}


