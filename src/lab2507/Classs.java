package lab2507;

public class Classs implements InterfaceA, InterfaceB{
public void display() {
	System.out.println("Display A");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Classs ab=new Classs();
ab.display();
/*You can also use interface reference
A aRef = obj;
aRef.show();

B bRef = obj;
bRef.show();
*/
	}

}
