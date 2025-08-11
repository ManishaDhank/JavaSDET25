package lab2507;


	// Interface
	interface A{
	    double getArea();
	}

	// Rectangle class implementing Shape
	class Rectangle implements A{
	    double length=8; // didn't use constructor
	    double width=9;

	   
	    // Implementing getArea
	    public double getArea() {
	        return length * width;
	    }
	}

	// Circle class implementing Shape
	class Circle implements A{
	    double radius=5;

	  

	    // Implementing getArea
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	}

	// Triangle class implementing Shape
	class Triangle implements A{
	     double base=8;
	    double height=9;

	   

	    // Implementing getArea
	    public double getArea() {
	        return 0.5 * base * height;
	    }
	}

	// Main class
	public class Area {
	    public static void main(String[] args) {
	       Rectangle r=new Rectangle();
	       Circle c=new Circle();
	       Triangle t=new Triangle();

	        System.out.println("Area of Rectangle: " + r.getArea());
	        System.out.println("Area of Circle: " + c.getArea());
	        System.out.println("Area of Triangle: " + t.getArea());
	    }
	}