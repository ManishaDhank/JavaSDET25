package JavaWipro;

public class CustonException {
	//Throws Declares exceptions that a method might throw
	public void checkAge(int age) throws Exception{
		
		if(age<18) {
			System.out.println("Create a new Exception");
			
			Thread.sleep(5000);
			
			//using throw keyword-Used to manually throw an exception
			throw new Exception("Age must be above 18");
			
		}
		else {
			System.out.println("Perosn not eligible for voting");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustonException obj= new CustonException();
		
		obj.checkAge(16);
	}

}
