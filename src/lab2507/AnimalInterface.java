package lab2507;

interface Animal {
    void bark(); // abstract method
}

// Implementing class Dog
class Dog implements Animal {
   
    public void bark() {
        System.out.println("Dog is barking");
    }
}


public class AnimalInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();  
    }
}