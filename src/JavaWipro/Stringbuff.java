package JavaWipro;

public class Stringbuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		//mutable in nature 
		
		//append
		sb.append("World");
		
		System.out.println(sb);
 //string buffer methods
		
	//reverse, is empty, insert, delete, substring, replace, char at index, length, repeat
		
		sb.reverse();
		System.out.println(sb);
		
	System.out.println(sb.isEmpty());
	
	
	System.out.println(sb.replace(0, 2, "abc"));
	
	System.out.println(sb.insert(0, "fa"));
		
	}

}
