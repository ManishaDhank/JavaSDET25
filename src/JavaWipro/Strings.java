package JavaWipro;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//strings - sequence of characters stored
		//zero based index, immutability, cannot be changed
		//string buffer
		// string builder
		
		String S1="Hello World";
		System.out.println(S1);
		
		//2
		char[] ch= {'h','e','l','l','o'};
		String S2=new String(ch);
		System.out.println(S2);
		
		String S3=new String("Hello");
		System.out.println(S3);
		
		//String methods equals, concatenation, substring, contains, replace, is empty , ends with , compare to, split
		String str1="Core Java";
		String str2="Selenium";
		
		//equals method
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//concatenation
		System.out.println(str1.concat(str2)); //MumabaiDelhi
		
		//contains
		System.out.println(str1.contains(str2));
		
		//substring
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(1,3));
		
		//replace
		System.out.println(str1.replace("i","g"));
		System.out.println(str1.replaceAll(str1, "Pune"));
		
		//is Empty
		System.out.println(str1.isEmpty());
		
		//ends with
		System.out.println(str1.endsWith("e"));
		
		//join
		String str3=String.join("_", "city","Mumbai");
		System.out.println(str3);
		
		//compare to lexo graphical comparison
		System.out.println(str2.compareTo(str3));
		
		//split
		
		String text="Java is a programming language";
		String[] result=text.split(" ");
		
		for (String str:result) {
			System.out.println(str +",");
			}
		
		
		}
				
	}
