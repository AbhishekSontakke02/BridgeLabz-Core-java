package numberPrograms;

public class FactorialNum {
	public static void main(String[] args) {
		int num = 5;
		int result = factorialNum(num);
		System.out.println("The Factorial of Number "+num+" is : "+result);
	}
	
	public static int factorialNum(int num) {
		int fact = 1, i =1;
		while(num!=0) {
			fact = fact * i;
			i++;
			num--;
		}
		return fact;
	}
	
}
