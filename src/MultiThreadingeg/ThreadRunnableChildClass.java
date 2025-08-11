package MultiThreadingeg;

public class ThreadRunnableChildClass {

	public static void main(String[] args) {
		
		int n=10;
		
		for (int i=1; i<n;i++) {
			Thread obj=new Thread(new ThreadRunnableinterface());
			
			obj.start();
		}

	}

}
