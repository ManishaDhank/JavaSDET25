package Collection;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*An object that map keys to values
		 * Each key can map to at most one value
		 * Ordering- it is sorted based on the natural ordering of keys
		 * Values can be duplicated
		 * No null as key are allowed
		 * Multiple null values are allowed.
		 * This implementation is not synchronized
		 */
		
Map<Integer, String> map= new TreeMap<Integer, String>();

map.put(2, "harry");
map.put(3,"Rahul");
map.put(4,null);


map.put(3,"Raj");
map.put(1, "Aisha");
map.put(1, "Isha");



//converting map to set

Set s=map.entrySet();
Iterator it=s.iterator();

while (it.hasNext()) {
	
	Entry e=(Map.Entry)it.next();
	System.out.println(e.getKey() + " " + e.getValue());
	
}
	}

}
