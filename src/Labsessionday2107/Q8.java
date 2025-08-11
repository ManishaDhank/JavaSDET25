package Labsessionday2107;

public class Q8 {
	public static void main(String[] args) {
        

        int a = 8;
        int b = 9;
        int c = 10;

        int max;

      
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println(max);
    }
}


