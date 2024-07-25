package JavaPractice;

import java.util.Scanner;

public class SumOfNaturalNoForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente a Number : ");
		int input = sc.nextInt();
		int result = sum(input);
		System.out.println("The Sum of Natural Numbers is : "+result);
		
		sc.close();
	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 0; i<=n ;i++)
		{
			sum += i;
		}
		return sum;
	}
}
