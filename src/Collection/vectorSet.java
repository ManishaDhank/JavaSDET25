package Collection;

import java.util.Vector;

public class vectorSet {

	public static void main(String[] args) {
		
		//growable array of objects
		//zero based index
		//maintains the insertion order
		//stores duplicate elements
		//capacity increment
		// null values allowed
		// Synchronized in nature
		
		 Vector<String> n= new Vector<>();

	        // Add elements
	        n.add("Ace");
	        n.add("Base");
	        n.add("Chase");
	        n.add("Chase"); 
	        System.out.println(n);

	        
	        System.out.println(n.get(1));

	       
	        System.out.println(n.contains("Betty"));


	        System.out.println(n.size());

	     
	        n.remove("Ace");
	        System.out.println(n);

	       System.out.println(n.capacity());
	       System.out.println(n.firstElement());
	       System.out.println(n.equals(3));
	        }
	    
	}

