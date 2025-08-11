package Package2;

import Package1.package1;

public class DiffPackNonSubclass {
	public void print() {
		System.out.println("Printing in subclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 package1 p=new package1();
 DiffPackNonSubclass d=new DiffPackNonSubclass();
 p.display();
 d.print();
 
	}

}
