package JavaWipro;

public class MethodOverloading {
	/* 1. Same method name
	   2. Different no of parameters.
	   3. diff types of parameters
	   4.it happens in same class
	   5. diff order of parameters
	  */
	
	// method add with 2 parameters
	
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	// method add with 3 parameters
	
		public int add(int a, int b, int c) {
			int d=a+b+c;
			return d;
		}
		
		// method add with 4 parameters
		
		public int add(int a, int b, int c, int d) {
			int e=a+b+c+d;
			return e;
		}
		// diff parameters
		 public double add(double a, double b) {
		        return a + b;
		    }

		    // Different order of parameters
		    public double add(int a, double b) {
		        return a + b;
		    }

		    public double add(double a, int b) {
		        return a + b;
		    }
	public static void main(String[] args) {
MethodOverloading m=new MethodOverloading();
System.out.println(m.add(1,2));
System.out.println(m.add(2 , 4, 8));
System.out.println(m.add(8,9,10,11));
System.out.println("add(double, double): " + m.add(2.5, 3.5));
System.out.println("add(int, double): " + m.add(4, 2.5));
System.out.println("add(double, int): " + m.add(3.5, 2));
 
	}

}
