package NumberPrograms2;

public class NumDigitsInInt {
	
	public static void main(String[] args) {
		int num = 1234;
		System.out.println("The Number of digits in "+num+" are : "+countDigits(num));
	}
	
	public static int countDigits(int num) {
		int count = 0;
		while(num > 0){
			num = num / 10;
			count+=1;
		}
		return count;
	}
}	
