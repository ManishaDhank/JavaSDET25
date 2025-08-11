package JavaWipro;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//code where application code is residing
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
			
		}catch(Exception e){
			// print the trace of exception
			
			System.out.println(e);
		
		}
	}

}
