package lab0208;

class OddEvenPrinter {
    private int number = 1;
    private final int MAX = 20;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 1) {
                System.out.println("Odd Thread: " + number);
                number++;
                notify(); // Wake up even thread
            } else {
                try {
                    wait(); // Wait until it's odd's turn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.println("Even Thread: " + number);
                number++;
                notify(); 
            } else {
                try {
                    wait(); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class EvenODD {
    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();

        Thread oddThread = new Thread(() -> {
            printer.printOdd();
        });

        Thread evenThread = new Thread(() -> {
            printer.printEven();
        });

        oddThread.start();
        evenThread.start();
    }
}
