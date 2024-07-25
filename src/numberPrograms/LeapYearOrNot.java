package numberPrograms;

public class LeapYearOrNot {

	public static void main(String[] args) {
		int year = 2024;
		if(isLeapYear(year)) {
			System.out.println("Year "+year+" is a leap year!");
		}
		else {
			System.out.println("Year "+year+" is not a leap year!");
		}
	}
	public static boolean isLeapYear(int year) {
		if(year%4==0 || year%400==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
