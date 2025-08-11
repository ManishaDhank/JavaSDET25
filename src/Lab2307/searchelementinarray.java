package Lab2307;

public class searchelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		  
		  a[1]= 21;
		  a[2]=90;
		  a[3]=23;
		  a[4]=7;
		  
		  int target=90;
		  boolean found = false;
	        int position = -1;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == target) {
	                found = true;
	                position = i;
	                break;
	            }
	        }

	    
	        if (found) {
	            System.out.println("Element " + target + " found at index " + position + ".");
	        } else {
	            System.out.println("Element " + target + " not found in the array.");
	        }
	}

}
