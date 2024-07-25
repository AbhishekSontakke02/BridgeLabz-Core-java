package numberPrograms;

public class SumOfFirstNnumbers {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("The Sum Of first N Natural Number Is : " + sumOfFirstNnaturlNumbers(num));
	}
	
	public static int sumOfFirstNnaturlNumbers(int n) {
		int sum = (n*(n+1))/2;
		return sum;
		
	}
}
