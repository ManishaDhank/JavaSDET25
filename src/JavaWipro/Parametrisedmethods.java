package JavaWipro;

public class Parametrisedmethods {
	
	public void add(int a , int b){
	int c=a+b;
	System.out.println(c);
}

	
	public void sub(int a , int b){
		int c=a-b;
		System.out.println(c);
	}
	public void mul(int a , int b){
		int c=a*b;
		System.out.println(c);
	}
	public void div(int a , int b){
		float c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parametrisedmethods p1= new Parametrisedmethods();
		p1.add(5, 40);
		p1.sub(5, 40);
		p1.mul(5, 40);p1.div(5, 40);
		
	}

}
