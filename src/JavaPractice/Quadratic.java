package JavaPractice;
import java.lang.Math;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A = ");
		int a = sc.nextInt();
		System.out.println("Enter Value of B = ");
		int b = sc.nextInt();
		System.out.println("Enter Value of C = ");
		int c = sc.nextInt();
		
		quadraticRoots(a,b,c);
		sc.close();

	}
	
	public static void quadraticRoots(int a,int b,int c) {
		
		double delta = (b*b) -( 4 * a * c); 
		double root_x1 = (-b + Math.sqrt(delta)) / (2*a);
		double root_x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		System.out.println("Root 1 of X = " + root_x1);
		System.out.println("Root 2 of X = " + root_x2);
	}
}
