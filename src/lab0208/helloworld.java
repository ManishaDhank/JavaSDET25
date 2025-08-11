package lab0208;

public class helloworld extends Thread{
	
	
	public void run() {
    System.out.println("Hello, World");
}

public static void main(String[] args) {
	helloworld thread = new helloworld();
    thread.start();  // This will call run() method in a new thread
}
}
