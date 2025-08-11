package lab3107;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234567890;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;      
            reversed = reversed * 10 + digit; 
            num /= 10;                 
            
        }

        System.out.println("Reversed number: " + reversed);
    
	}

}
