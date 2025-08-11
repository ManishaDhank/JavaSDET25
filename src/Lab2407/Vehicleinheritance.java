package Lab2407;

//Abstract class
abstract class Vehicle {
 // Abstract method
 abstract void move();
}

//Car subclass
class Car extends Vehicle {
 @Override
 void move() {
     System.out.println("Car is moving on four wheels");
 }
}

//Bike subclass
class Bike extends Vehicle {
 @Override
 void move() {
     System.out.println("Bike is moving on two wheels");
 }
}

//Bus subclass
class Bus extends Vehicle {
 @Override
 void move() {
     System.out.println("Bus is moving on six wheels");
 }
}

//Main class
public class Vehicleinheritance {
 public static void main(String[] args) {
     // Create objects
     Vehicle car = new Car();
     Vehicle bike = new Bike();
     Vehicle bus = new Bus();

     // Call move method on each
     car.move();
     bike.move();
     bus.move();
 }
}
