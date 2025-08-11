package JavaWipro;

public class SingleChildClass extends SingleSuperClass {
	
	String model="Mustang";
	public void display() {
		System.out.println("Brand is " + brand); //inherited
		System.out.println("Model is "+ model);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChildClass obj=new SingleChildClass();
		obj.start();	//inherited method
		obj.display(); //own method
	}

}
