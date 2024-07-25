package numberPrograms;

public class ReverseNum {
	public static void main(String[] args) {
		int num = 123;
		System.out.println("Revers Number of "+num+" is : "+revNum(num));
	}
	
	public static int revNum(int num) {
		int digit = 0, sum = 0;	
		while(num>0) {	 
				digit = num % 10;
				sum = sum * 10 + digit;
				num = num/10;
			}
		
		return sum ;
	}
}
