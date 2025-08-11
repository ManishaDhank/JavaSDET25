package lab3007;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ARRlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] numbers = {4, 7, 2, 7, 3, 4, 9, 10, 3};

	        Set<Integer> s = new HashSet<>();
	        Set<Integer> d = new HashSet<>();


	        for (int num : numbers) {
	            if (!s.add(num)) {
	                
	                d.add(num);
	            }
	        }

	        System.out.println( Arrays.toString(numbers));
	        System.out.println( d);
	    }
	
	

}
