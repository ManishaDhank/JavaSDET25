package Lab2307;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		  a[0]=0;
		  a[1]=10;
		  a[2]=20;
		  a[3]=30;
		  a[4]=40;
		  for (int i = 0; i <a.length / 2; i++) {
	            int temp = a[i];
	            a[i] = a[a.length- 1 - i];
	            a[a.length - 1 - i] = temp;
	        }

	        
	        System.out.println("Reversed array:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	}

}
