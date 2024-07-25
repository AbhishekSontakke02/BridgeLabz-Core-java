package JavaPractice;

import java.util.Scanner;

public class DisplayUnit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		String input = sc.nextLine();
		displayUnit(input);
		sc.close();
	}
	
	public static void displayUnit(String num) {
		if(num.matches("^\\d+$")) {
			int num1 = Integer.parseInt(num);
			
			if (num1 == 1) {
	            System.out.println("One unit");
	        } 
			else if (num1 == 10) {
	            System.out.println("Ten units");
	        } 
	        else if (num1 == 100) {
	            System.out.println("One hundred units");
	        } 
	        else if (num1 == 1000) {
	            System.out.println("One thousand units");
	        } 
	        else {
	            System.out.println("Number not recognized");
	        }
		}
	}
}
