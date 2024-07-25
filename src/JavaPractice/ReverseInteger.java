package JavaPractice;

import java.util.Scanner;

public class ReverseInteger {
//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int input = sc.nextInt();
		int reverseNumber = rev(input);
		System.out.println("The Reverse Number of " + input + " Is "+ reverseNumber);
		sc.close();
	}
	
	public static int rev(int num) {
		int digit = 0;
		int rev = 0;
		while (num > 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num =  num/10;
					
		}
		return rev;
	}
}
