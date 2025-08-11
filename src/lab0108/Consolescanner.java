package lab0108;

import java.util.Scanner;

public class Consolescanner {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.print("Enter your name: ");
        String name = scn.nextLine();

        System.out.print("Enter your age: ");
        int age = scn.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
		
		scn.close();
    }
}

