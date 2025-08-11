package Wrapperclass;

public class Autoboxingeg {

	public static void main(String[] args) {
		
		//wrapper is the process of converting the primitive data into objects
		
		//8 wrapper classes - Byte, Boolean, Character, DOuble, Float, Integer
		
		//autoboxing convert data type to object
		
		int a=78;
		
		//auutoboxing
		
		//Integer i=Integer.valueOf(a);
		
		Integer i=a;
		
		System.out.println(i);
		
		//unboxiing
		
		Integer a=new Integer(3);
		
		int i=a.intValue();
		
		int j=a;
		
		System.out.println(i);
		
		System.out.println(j);
		
	}

}
