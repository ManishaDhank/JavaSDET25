package JavaWipro;

public class SubClass2 extends SingleChildClass{
	
	String location="New York";
	
	public void Show() {
		System.out.println("Show "+ location);
		System.out.println("Model "+ model);
		System.out.println("Brand " + brand);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass2 p=new SubClass2();
		p.Show();
		p.display();
		p.start();
	}

}
