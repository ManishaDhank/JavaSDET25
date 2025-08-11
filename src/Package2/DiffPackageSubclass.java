package Package2;
import Package1.package1;
public class DiffPackageSubclass extends package1{

	public void create() {
		System.out.println("Creating in subclass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffPackageSubclass s= new DiffPackageSubclass();
		s.create();
		s.display();
		s.dam();
	}

}
