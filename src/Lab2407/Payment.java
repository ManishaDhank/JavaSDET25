package Lab2407;

//main class
	class Paym {
	    public void pay() {
	        System.out.println("Payment ");
	    }
	}

	// Child class 1
	class CreditCard extends Paym{
	   
	    public void pay() {
	        System.out.println("Payment done using Credit Card.");
	    }
	}

	// Child class 2
	class UPI extends Paym {
	  
	    public void pay() {
	        System.out.println("Payment done using UPI.");
	    }
	}

	// Child class 3
	class NetBanking extends Paym {
	   
	    public void pay() {
	        System.out.println("Payment done using NetBanking.");
	    }
	}

	// Main class to test the methods
	public class Payment{
	    public static void main(String[] args) {
	        

	    	CreditCard p = new CreditCard();    
	        p.pay();

	        UPI  m = new UPI();            
	        m.pay();

	        NetBanking   n = new NetBanking();    
	        n.pay();
	    }
	}
	
