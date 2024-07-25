package day5JavaPractice;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year :");
		String input = sc.nextLine();
		if (input.matches("\\d{4}")) {
			int year = Integer.parseInt(input);
			if(leapYear(year)) {
				System.out.println(year + " Is a Leap Year!");
			}
			if(!leapYear(year)) {
				System.out.println(year + " Is Not a Leap Year!");
			}
		}
		
		sc.close();
	}
	
	static boolean leapYear(int year) {
		if (year % 4 == 0 ) {
			return true;
		}
		if (year % 400 == 0) {
			return true;
		}
		if (year % 100 == 0) {
			return false;
		}
		else {
			return false;
		}
		
	}
}
