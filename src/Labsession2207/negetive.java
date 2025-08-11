package Labsession2207;

public class negetive {
	public static boolean isEven(int n) {
        return n % 2 == 0;
    }
	public static void main(String[] args) {
        int number = 7; // You can change this number

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
