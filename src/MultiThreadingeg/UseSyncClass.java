package MultiThreadingeg;

public class UseSyncClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadSync cnt=new ThreadSync();
		
		//thread 1 to increment the counter
		
		Thread t1=new Thread(() ->{
			
			for (int i=0; i<1000;i++) {
				cnt.inc();
			}
		});
		
		Thread t2=new Thread(() ->{
			
			for (int i=0; i<1000;i++) {
				cnt.inc();
			}
		});
		
		//start both threads
		
		t1.start();
		t2.start();
		
		//wait for threads to finish
		
		t1.join();
		t2.join();
		
		//print the final counter value
		
		System.out.println("Counter" + cnt.get());
		
	}

}
