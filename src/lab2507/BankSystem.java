package lab2507;

import java.util.*;

//Interface Account
interface Account {
 void deposit(double amount);
 void withdraw(double amount);
 void calculateInterest();
 void viewBalance();
}

//SavingsAccount class implementing Account
class SavingsAccount implements Account {
 private double balance;
 private double interestRate = 0.04; // 4%

 public SavingsAccount(double initialDeposit) {
     balance = initialDeposit;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("SavingsAccount: Deposited " + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("SavingsAccount: Withdrawn " + amount);
     } else {
         System.out.println("SavingsAccount: Insufficient balance.");
     }
 }

 public void calculateInterest() {
     double interest = balance * interestRate;
     balance += interest;
     System.out.println("SavingsAccount: Interest added: " + interest);
 }

 public void viewBalance() {
     System.out.println("SavingsAccount Balance: " + balance);
 }

 public void enableSavingsFeature() {
     System.out.println("SavingsAccount: Savings feature enabled.");
 }
}

//CurrentAccount class implementing Account
class CurrentAccount implements Account {
 private double balance;
 private double overdraftLimit = 2000;

 public CurrentAccount(double initialDeposit) {
     balance = initialDeposit;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("CurrentAccount: Deposited " + amount);
 }

 public void withdraw(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("CurrentAccount: Withdrawn " + amount);
     } else {
         System.out.println("CurrentAccount: Overdraft limit exceeded.");
     }
 }

 public void calculateInterest() {
     System.out.println("CurrentAccount: No interest for current accounts.");
 }

 public void viewBalance() {
     System.out.println("CurrentAccount Balance: " + balance);
 }

 public void requestChequeBook() {
     System.out.println("CurrentAccount: Cheque book requested.");
 }
}

//Bank class to manage all accounts
class Bank {
 private List<Account> accounts = new ArrayList<>();

 public void addAccount(Account acc) {
     accounts.add(acc);
     System.out.println("Bank: Account added.");
 }

 public void showAllBalances() {
     System.out.println("\n--- All Account Balances ---");
     for (Account acc : accounts) {
         acc.viewBalance();
     }
 }
}

//Main class
public class BankSystem {
 public static void main(String[] args) {
     Bank bank = new Bank();

     SavingsAccount sa = new SavingsAccount(10000);
     sa.deposit(2000);
     sa.calculateInterest();
     sa.viewBalance();
     sa.enableSavingsFeature();

     CurrentAccount ca = new CurrentAccount(5000);
     ca.withdraw(6000);
     ca.requestChequeBook();
     ca.viewBalance();

     bank.addAccount(sa);
     bank.addAccount(ca);

     bank.showAllBalances();
 }
}