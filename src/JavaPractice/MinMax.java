package JavaPractice;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value of A :");
		a = sc.nextInt();
		System.out.println("Enter a Value of B :");
		b = sc.nextInt();
		System.out.println("Enter a Value of C :");
		c = sc.nextInt();
		
		oprator(a,b,c);
		
		sc.close();
		
		
	}
	
	public static void oprator(int a , int b, int c) {
		//	i) a+b*c ii) c+a/b
		//	iii) a%b+c iV) a*b+c
		
		int first = a + (b * c);
		int second = c + (a/b);
		int third = (a % b)+c;
		int fourth = (a*b)+c;
		int min,max;
		if(a < b && a < c){
			 min = a;
		}
		else if (b < a && b < c ) {
			 min = b;
		}
		else {
			 min = c;
		}
		
		if(a > b && a > c){
			 max = a;
		}
		else if (b > a && b > c ) {
			max = b;
		}
		else {
			 max = c;
		}
		System.out.println("A = " + a + " B = " + b + " C = " +c);
		
		System.out.println("Minimum Number = "+ min+ " Maximum Number = "+max);
		
		System.out.println("i) a+b*c = "+ first);
		System.out.println("ii) c+a/b = "+ second);
		System.out.println("iii) a%b+c = "+ third);
		System.out.println("iV) a*b+c = "+ fourth);
		
		
	}
}
