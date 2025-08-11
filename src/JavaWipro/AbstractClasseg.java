package JavaWipro;

abstract class AbstractClasseg {
	//abstract method- no body
	
	abstract void makesound() ;
	
	//concrete methods
	public void eat() {
		System.out.println("The animal eats food");
	}
	
	 AbstractClasseg(){
		 System.out.println("Creating constructor in abstract class");
	 }
	 
	 // instance variables
	 
	 public static String animalName="Lion";
	 //final variable
	 
	 private final String animalBehavior="roars";
}
