package JavaPractice;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		if(isPalindrom(num)) {
			System.out.println("Number "+ num + " is a Palindrom Number!");
		}
		else {
			System.out.println("Number "+ num +" is not a Palindrom Number!");
		}
		sc.close();
	}
	
	public static boolean isPalindrom(int num) {
		int reversed = 0;
		for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit; 
        }
		if(num == reversed) {
			return true;
		}
		else {
			return false;
		}
	}
}
