package lab2807;

import java.util.Arrays;
import java.util.LinkedList;

public class equallinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list1 = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
	        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
	        
	        System.out.println(list1.equals(list2));
	}

}
