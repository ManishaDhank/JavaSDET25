package JavaWipro;

public class Program {

    
    

    public double multiply(double a, double b) {
        return a * b;
    }


    public double divide(double a, double b) {
      
        
        return a / b;
    }

   
    public static void main(String[] args) {
    	Program calc = new Program();

       int a  = 12;
        int b = 4;

        System.out.println("Addition: " + calc.add( a,  b));
        System.out.println("Subtraction: " + calc.subtract(a,b));
        
    }


	private String add(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}


	private String subtract(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}
}