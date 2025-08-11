package JavaWipro;
//main class
class Animal{
	
	
	
	public void eat() {
		System.out.println("Animal eats food");
	}
	}
	//sub class
	class Dog extends Animal{
		
		public void bark() {
			System.out.println("Dog barks");
		}
		
	}
	//sub class 2
	class cat extends Animal{
		public void meow(){
			System.out.println("Cat meows");
		}
	}
	
	//sub class 3
	class cow extends Animal{
		public void moos(){
			System.out.println("Cow moos");
		}
	}
	
class AnimalClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();
		d.bark();
		
		cat t=new cat();
		t.eat();
		t.meow();
		
		cow c=new cow();
		c.eat();
		c.moos();

	}

}

