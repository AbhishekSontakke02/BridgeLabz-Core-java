package JavaPractice;

import java.util.Scanner;

public class Factorial{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		factorialController();
	}
	
	// Normal Function
	private static void factorialController() {
		int input =userInput();
		int result=factorialOfNumber(input);
		display(result);
	}
	// Function With Return Type
	private static int userInput() {
		System.out.print("Enter N :");
		int number = sc.nextInt();
		return number;
	}

	// Function with Parameter
	private static void display(int result) {
		sc.close();
		System.out.println(result);
	}

	// Function with Parameter and with return type.
	private static int factorialOfNumber(int n) {
		int temp = n;
		int fact =1;

		while(temp!=0){
			fact = fact*temp;
			temp--;
		}
		return fact;
	}

}