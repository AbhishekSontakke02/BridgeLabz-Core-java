package NumberPrograms2;

public class NumOfDaysInMonths {
	public static void main(String[] args) {
		int year = 2022, month = 10;
		System.out.println("There are " +numOfDays(month, year)+" Days in "+month+" Month.");
	}
	
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int numOfDays(int month, int year) {
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if(isLeapYear(year)) {
				return 29;
			}
			else {
				return 28;
			}
		default:
			throw new IllegalArgumentException("Invalid Month : "+ month);
		
		}
	}
}
