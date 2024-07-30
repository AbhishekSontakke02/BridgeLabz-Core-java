package day6JavaPractice;

public class ReversNumber {
	public static void main(String[] args) {
		int num =123;
		System.out.println(num+" after Reversed = "+ revNum(num));
	}
	
	public static int revNum(int num) {
		int rev =0, digit =0;
		while(num>0) {
			 digit = num %10;
			 rev = rev*10 + digit;
			 num = num/10;
		}
		return rev;
	} 
}
