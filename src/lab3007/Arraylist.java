package lab3007;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Yellow"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(2));
		System.out.println(al.set(3, "Black"));
		System.out.println(al);
		System.out.println(al.size());
	}

}
