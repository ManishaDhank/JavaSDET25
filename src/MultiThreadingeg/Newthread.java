package MultiThreadingeg;

public class Newthread extends Thread{
		public void run() {
			System.out.println("Thread is running");
			
		}
		

	}
	class Test {
		public static void main(String[] args) {
			Newthread t1 = new Newthread();
			t1.start();
		}
	}
	class Test1 {
		public static void main(String[] args) {
			Newthread t1 = new Newthread();
			t1.start();
		}
	
}
