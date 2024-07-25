package numberPrograms;

public class SumBtweRange {
//Sum of numbers in a given range:
	public static void main(String[] args) {
		System.out.println(sumBtweRange(7,9));
	}
	
	public static int sumBtweRange(int a , int b) {
		int sum=0;
		for(int i = a; i<=b;i++) {
			sum+=i;
		}
		return sum;
	}
}
