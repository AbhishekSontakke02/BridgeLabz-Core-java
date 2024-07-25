package JavaPractice;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		int m,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Month : ");
		m = sc.nextInt();
		System.out.println("Enter The Date : ");
		d = sc.nextInt();
		if(isSpringSeason(m,d)) {
			System.out.println("The Month = "+ m +" Date = "+d+" is Spring Season!");
		}
		else {
			System.out.println("The Month = "+ m +" Date = "+d+" is not a Spring Season!");		
			}
		sc.close();
	}
	
	public static boolean isSpringSeason(int m, int d) {
		if (m == 3 && d > 20 && d <= 31 ) {
			return true;
		}
		else if (m == 4 && d >=1 && d <=30) {
			return true;
		}
		else if (m == 5 && d>=1 && d<=31) {
			return true;
		}
		else if (m == 6 && d>=1 && d<=20) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
