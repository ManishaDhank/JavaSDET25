package Labsession2207;

public class methodeven {
	public static boolean isEven(int number) {
        return number % 2 == 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testNumber1 = 10;
        int testNumber2 = 7;

        System.out.println( isEven(testNumber1));
        System.out.println( isEven(testNumber2));
	}

}
