package Labsession2207;

public class decimalpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=12345;
		double num2=2534;
		num1 = Math.round(num1 * 100.0) / 100.0;
        num2 = Math.round(num2 * 100.0) / 100.0;

        // Comparison
        if (num1 == num2) {
            System.out.println("Numbers are the same up to two decimal places.");
        } else {
            System.out.println("Numbers are different.");
	}

	}}
