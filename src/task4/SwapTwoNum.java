package task4;

import java.util.Scanner;

public class SwapTwoNum {
	static int a,b;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter 1st Number : ");
		a = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		b = sc.nextInt();
		System.out.println("Numbers Before Swaping : A = "+a+" B = "+b);
		swapTowNums(a,b);
		System.out.println("Numbers After Swaping : A = "+a+" B = "+b);
	}
	public static void swapTowNums(int x, int y) {
		a = y;
		b = x;
	}
}
