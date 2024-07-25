package JavaPractice;

import java.util.Scanner;

public class ReadNoWriteWord {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number : ");
		String input = sc.nextLine();
		readNoWriteWord(input);
		sc.close();
	}
	public static void readNoWriteWord(String num1){
		if(num1.matches("^\\d+$")) {
			int num = Integer.parseInt(num1);
		
			if(num == 0){
				System.out.println("Zero");
			}
			if(num == 1) {
				System.out.println("One");
			}
			if(num == 2) {
				System.out.println("Two");
			}
			if(num == 3) {
				System.out.println("Three");
			}
			if(num == 4) {
				System.out.println("Four");
			}
			if(num == 5) {
				System.out.println("Five");
			}
			if(num == 6) {
				System.out.println("Six");
			}
			if(num == 7) {
				System.out.println("Seven");
			}
			if(num == 8) {
				System.out.println("Eight");
			}
			if(num == 9) {
				System.out.println("Nine");
			}
			if(num > 9) {
				System.out.println("Please Enter a Valid Single Digit Number !");
			}
		}
		else {
			System.out.println("Please Enter a Valid Single Digit Number !");
		}
	}
}
