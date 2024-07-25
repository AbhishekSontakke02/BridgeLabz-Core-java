package JavaPractice;

import java.util.Scanner;

public class ReverseIntForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int input = sc.nextInt();
		int rev = rev(input);
		System.out.println("Reverse Number Of "+ input + " is "+ rev);
		sc.close();
		
	}
	
	public static int rev(int num) {
		int reversed = 0;
		for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit; 
        }
		return reversed;
	}
}
