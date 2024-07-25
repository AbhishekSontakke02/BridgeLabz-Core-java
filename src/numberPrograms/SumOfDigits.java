package numberPrograms;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 123;
		System.out.println("The sum of digits of "+num+" is = "+sumOfDigits(num));
	}
	
	public static int sumOfDigits(int num) {
		System.out.println("Function Working!");
		int digit = 0, sum = 0;	
		System.out.println(digit+" "+sum);
		while(num>0) {	 //here i had mention num<0 insted of num>0 after debugging i get the issue with while condition
			System.out.println("Loop is working");
				digit = num % 10;
				sum = sum + digit;
				num = num/10;
			}
		
		return sum ;
	}
}
