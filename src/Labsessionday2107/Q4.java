package Labsessionday2107;

public class Q4 {
	public static void main(String[] args) {
       

		 int a = 5;  // hardcoded value
	        int b = 10; // hardcoded value

	        System.out.println("Before swapping: a = " + a + ", b = " + b);

	        // Swapping using third variable
	        int temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    }
	}
