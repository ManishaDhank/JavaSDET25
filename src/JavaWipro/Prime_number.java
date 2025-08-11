package JavaWipro;

public class Prime_number {
	
	 public static boolean isPrime(int n) {
	         
	        for (int i = 2; i <= n/2; i++) {
	            if (n % i == 0) return false;
	        }

	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =89;
		if ( isPrime(number)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	

	}

}
