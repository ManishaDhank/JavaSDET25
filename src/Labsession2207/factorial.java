package Labsession2207;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 5;
        
        long factorial = 1;
        
        if (number < 0) {
            System.out.println("no");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
	}

}
