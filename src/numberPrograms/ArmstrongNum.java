package numberPrograms;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num = 153;
		if(isArmstrong(num)) {
			System.out.println("Number "+num+" is a Armstrong Number!");			
		}
		else {
			System.out.println("Number "+num+" is not a Armstrong Number!");
		}
	}
	
	public static boolean isArmstrong(int num) {
		int temp = num, digit = 0, arm=0;
		while(num>0) {
			digit = num % 10;
			arm = (int) (arm + Math.pow(digit, 3));
			num = num/10;
		}
		if(arm == temp) {
			return true;
		}
		else {
			return false;
		}
	}

}
