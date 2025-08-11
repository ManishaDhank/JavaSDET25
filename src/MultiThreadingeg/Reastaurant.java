package MultiThreadingeg;

public class Reastaurant {

	public static void main(String[] args) {
		
		Thread  t1= new CookingTask("Pasta");
		
		Thread t2= new CookingTask("Dosa");
		
		Thread t3= new CookingTask("Salad");
		
		Thread t4= new CookingTask("Dessert");
		
		Thread t5= new CookingTask("Rice");
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
		t4.start();
		
		t5.start();
		
		
		

	}

}
