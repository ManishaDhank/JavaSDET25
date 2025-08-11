package Collection;

import java.util.HashSet;

public class Hashhset {

	public static void main(String[] args) {
		
		//asc order 
		//duplicates only printed once
		//multiple nulls are allowed but printed only once
		
		
		// TODO Auto-generated method stub
		HashSet<String> al = new HashSet<>();
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
