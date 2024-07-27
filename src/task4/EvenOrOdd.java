package task4;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		sc.close();
		if(evenOrOdd(num)) {
			System.out.println("Number "+num+" is a Even Number");
		}
		else if(evenOrOdd(num)== null) {
		throw new IllegalArgumentException("Enter a Valid Positive Integer!");
		}
		else {
			System.out.println("Number "+num+" is a Odd Number!");
		}

		
	}
	
	public static Boolean evenOrOdd(int num) {
		if(num <= 0) {
			return null;
		}
		else if(num%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}	
