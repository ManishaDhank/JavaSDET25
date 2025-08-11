package Collection;

import java.util.ArrayList;

public class ArrayListEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Rima");
al.add("Ravi");
al.add("Tina");
al.add("Peter");
al.add(null);
System.out.println(al);
System.out.println(al.get(2));
System.out.println(al.indexOf("Rima"));
System.out.println(al.isEmpty());
System.out.println(al.remove(2));
System.out.println(al.set(3, "King"));
System.out.println(al);
System.out.println(al.size());

	}

}
