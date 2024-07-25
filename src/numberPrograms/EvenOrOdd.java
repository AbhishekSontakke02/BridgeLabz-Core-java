package numberPrograms;

public class EvenOrOdd {
	public static void main(String[] args) {
		int num = 13;
		if(isEvenOrOdd(num)) {
			System.out.println( num +" Number is Even Number!");
		}
		else if(!isEvenOrOdd(num)) {
			System.out.println( num +" Number is Odd Number!");
		}
	}
	
	public static boolean isEvenOrOdd(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
