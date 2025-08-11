package JavaWipro;

public interface Interface1 {
	
	//abstract methods
	
	abstract void display();
	
	//static
	static void write() {
		System.out.println("Writing in interface");
	}
	
	
	//default
	default void show() {
		System.out.println("Showing");
	}
	
	
	public static final String empname="Jaya";
	int empId=9090;
}
