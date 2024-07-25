package JavaPractice;

import java.util.Scanner;

public class SumOfNaturalNumbers {
//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Natural Number : ");
		int input = sc.nextInt();
		int sumOfNaturalNumbers = sum(input); 
		System.out.println("Sum Of Natural Number till "+ input +" is "+sumOfNaturalNumbers);
		sc.close();
		
	}
	public static int sum(int n) {
		int temp = 0, sum = 0;
		while(temp <= n) {
			sum += temp;
			temp++;
		
		}
		return sum;
		
	}
}
