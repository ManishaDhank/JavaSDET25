package lab3107;

public class nonForWhileDOwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  printNumbers(1);
    }

    static void printNumbers(int num) {
        if (num <= 100) {
            System.out.println(num);
            printNumbers(num + 1); // Recursive call
        }
    }
	}


