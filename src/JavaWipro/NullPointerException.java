package JavaWipro;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String S1=null;
			System.out.println(S1.length());
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		finally {
			
			//closing of the browsers
			//closing of the db connection
			//scanner class closing
			//api connection closing
			
			
			System.out.println("This is a mandadted code");
		}
	}

}
