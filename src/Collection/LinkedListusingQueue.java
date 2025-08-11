package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListusingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> al = new LinkedList<>();
		al.add("Rima");
		al.add("Ravi");
		al.add("Tina");
		al.add("Peter");
		
		System.out.println(al);
		
		System.out.println(al.element());
		System.out.println(al.peek());
		System.out.println(al.size());
		
		
	}

}
