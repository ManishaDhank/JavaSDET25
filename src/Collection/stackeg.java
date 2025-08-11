package Collection;

import java.util.Stack;

public class stackeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Integer> s = new Stack<>();

	    
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.push(40);
	        
	        System.out.println(s);
	        
	        System.out.println(s.peek());
	        
	        System.out.println(s.pop());
	        
	        System.out.println(s);
	        
	        System.out.println(s.indexOf(10));
	        
	        System.out.println(s.isEmpty());
	        
	        System.out.println(s.search(40));

	}

}
