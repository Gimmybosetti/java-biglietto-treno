package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age;
		double kmToDo, totalPrice, discount20, discount40;
		String strDouble;
		
		System.out.print("How many kilometers do you want to do?\n km:");
		kmToDo = scanner.nextDouble();
		System.out.print("\nHow old are you?\n Age:");
		age = scanner.nextInt();
		
		totalPrice = kmToDo * 0.21;
		discount20 = (totalPrice * 1) / 5; //inutile moltiplicare per 1 ma per coerenza di procedimento lo faccio lo stesso
		discount40 = (totalPrice * 2) / 5;
		
		if (age < 18) {
			totalPrice = totalPrice - discount20;
			System.out.println("\nSummary:\n Km: " + kmToDo + "\n Age: " + age);
			strDouble = String.format("%.2f", totalPrice);
			System.out.println("\nSince you are a minor you are entitled to a 20% discount, so the total is: " + strDouble);
		} else if (age >= 65) {
			totalPrice = totalPrice - discount40;
			strDouble = String.format("%.2f", totalPrice);
			System.out.println("\nSummary:\n Km: " + kmToDo + "\n Age: " + age);
			System.out.println("\nSince you are over 65 you are entitled to a 40% discount, so the total is: " + strDouble);
		}else {
			strDouble = String.format("%.2f", totalPrice);
			System.out.println("\nSummary:\n Km: " + kmToDo + "\n Age: " + age);
			System.out.println("\nThe total is: " + strDouble);
		}
		
		
	
		scanner.close();
	}

}
