package Lab2407;

//Abstract class
abstract class BankAccount {
 String accountNumber;
 double balance;

 // Constructor
 BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Abstract method
 abstract double calculateInterest();

 // Concrete method
 void printBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: " + balance);
 }
}

//SavingsAccount subclass
class SavingsAccount extends BankAccount {
 final double interestRate = 0.04; // 4%

 SavingsAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 @Override
 double calculateInterest() {
     return balance * interestRate;
 }
}

//FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {
 final double interestRate = 0.065; // 6.5%

 FixedDepositAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 @Override
 double calculateInterest() {
     return balance * interestRate;
 }
}


public class AbstractBank {
 public static void main(String[] args) {
    
     SavingsAccount sa = new SavingsAccount("SA123", 100000);
     sa.printBalance();
     System.out.println( sa.calculateInterest());

     System.out.println();

    
     FixedDepositAccount fda = new FixedDepositAccount("FD456", 200000);
     fda.printBalance();
     System.out.println( + fda.calculateInterest());
 }
}