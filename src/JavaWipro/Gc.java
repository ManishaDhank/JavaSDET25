package JavaWipro;

public class Gc {
	
	//object out of scope
	
	//
	public void finalize() {
		System.out.println("Object is garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gc obj=new Gc();

//by nulling the reference
obj=null;

//by assigning a ref to another object

Gc obj1=  new Gc();
Gc obj2=new Gc();

obj1=obj2;
//object is out of scope

Gc obj4= new Gc();

//System.gc()
Runtime.getRuntime().gc();
	}

}
