package JavaPractice;

import java.util.Scanner;

public class CheckMonth {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		String c  = sc.nextLine().toLowerCase(); 
		System.out.println("The Month for Number "+c+" is : "+checkMonth(c));
		sc.close();
	}
	public static String checkMonth(String s) {
		switch (s) {
			case "1":
				return "Jan";
			case "2":
				return "Feb";
			case "3":
				return "Mar";
			case "4":
				return "Apr";
			case "5":
				return "May";
			case "6":
				return "Jun";
			case "7":
				return "Jul";
			case "8":
				return "Aug";
			case "9":
				return "Sep";
			case "10":
				return "Oct";
			case "11":
				return "Nov";
			case "12":
				return "Dec";
			default :
				return "Enter a Valid Number Between (1-12)";	
		}
	}

}
