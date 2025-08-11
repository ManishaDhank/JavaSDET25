package JavaWipro;

public class LocalVariables {

public void add() {
	int a=8;
	int b=9;
	int c=a+b;
	
//	static String s1="fgg";
	System.out.println(c);
}

//public void add1() {
	//System.out.println(c);
//}
public static void main(String[] args) {
	LocalVariables lv= new LocalVariables();
	lv.add();
}
}
