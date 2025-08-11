package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListusingDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Deque<String> l= new LinkedList<>();
l.add("c");
l.add("C++");
System.out.println(l);

//access first element

System.out.println(l.peek());
//remove

System.out.println(l.remove("c"));

System.out.println(l);

//poll
System.out.println(l.poll());


	}

}
