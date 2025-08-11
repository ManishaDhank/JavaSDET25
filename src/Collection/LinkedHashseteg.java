package Collection;


import java.util.LinkedHashSet;

public class LinkedHashseteg {

	public static void main(String[] args) {

		//no duplicates allowed
		// insertion order
		//onlly one null is allowed
		//non synchronized
		//slightly slower than hash set (order main)
		
		LinkedHashSet<String> al = new LinkedHashSet<>();
		al.add("Rima");
		al.add("Ravi");
		al.add("Tina");
		al.add("Peter");
		al.add("Peter");
		al.add(null);
		al.add(null);
		System.out.println(al);

		System.out.println(al.isEmpty());
		System.out.println(al.remove("Peter"));

		System.out.println(al);
		System.out.println(al.size());
	}

}
