package Collection;

import java.util.Set;
import java.util.TreeSet;

public class SetSeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//contains no duplicate elements
		// non synchronized
		// data is displayed in ascending order
		//operations are faster than list interface
		
		Set<String> al=new TreeSet<String>();
		
		//no null values allowed in treset
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("null");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.remove("Blue"));
		System.out.println(al);
		System.out.println(al.size());

		
	}

}
