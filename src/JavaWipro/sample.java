package JavaWipro;

public final class sample {
    private double balance;
    private final double interestRate = 0.04;

    public sample(double initialDeposit) {
        balance = initialDeposit;
    }

    public void showRules() {
        System.out.println("ADieu.");
    }

    public final void display() {
        System.out.println("Welcome Manisha");
    }
}

class Parent {
    final void display() {
        System.out.println("final method cannot be override");
    }
}

class child extends Parent {
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
    }
}
