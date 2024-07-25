package numberPrograms;

public class IsPositiveOrNegative {
	public static void main(String[] args) {
		int num = 21;
		if(num == 0) {
			System.out.println("0 Is a Neutral Number!");
		}
		else {
			if(isPositiveOrNegative(num)) {
				System.out.println(num +" Is a Positive Number!");
			}
			else {
				System.out.println(num + " Is a Negative Number!");
			}
		}
	}
	
	public static boolean isPositiveOrNegative(int num) {
		if(num >0) {
			return true;
		}
		else{
			return false;
		}
	}
}
