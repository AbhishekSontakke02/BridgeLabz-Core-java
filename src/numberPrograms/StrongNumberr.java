package numberPrograms;

public class StrongNumberr {

	public static void main(String[] args) {
		int num = 145;
		if(isStrongNumber(num)) {
			System.out.println("Number "+num+" is a Strong Number");
		}
		else {
			System.out.println("Number "+num+" is not a Strong Number");
		}
	}
	
	public static boolean isStrongNumber(int num) {
			int temp = num,digit = 0,fact = 0;
			
			while(temp>0) {
				digit = temp%10;
				fact += factorialNum(digit);
				temp = temp/10;
			}
			if(num == fact) {
				return true;
			}
			else {
				return false;
			}
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
