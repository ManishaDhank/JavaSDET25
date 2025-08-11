package Lab2307;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		  a[0]=0;
		  a[1]=10;
		  a[2]=20;
		  a[3]=30;
		  a[4]=40;
		  int sum = 0;
	        for (int i = 0; i < a.length; i++) {
	            sum += a[i];
	        }

	       
	        System.out.println("Sum of array elements: " + sum);
	}

}
