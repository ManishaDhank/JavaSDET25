package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*An object that map keys to values
		 * Each key can map to at most one value
		 * Ordering- it is sorted based on the keys
		 * Only one null as key is allowed
		 * Multiple null values are allowed.
		 */
		
Map<Integer, String> map= new HashMap<Integer, String>();

map.put(2, "harry");
map.put(3,"Rahul");
map.put(4,null);
map.put(4,"Rahul");
map.put(null,null);
map.put(3,"Raj");
map.put(1, "Aisha");
map.put(1, "Isha");
map.put(null,null);


//converting map to set

Set s=map.entrySet();
Iterator it=s.iterator();

while (it.hasNext()) {
	
	Entry e=(Map.Entry)it.next();
	System.out.println(e.getKey() + " " + e.getValue());
	
}
	}

}
