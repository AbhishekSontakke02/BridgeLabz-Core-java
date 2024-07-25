package numberPrograms;

public class ArmstrongNumBtwen {
	public static void main(String[] args) {
		int a = 100 , b = 500;
		armstrongNumBetwe(a, b);
	}
	
	public static void armstrongNumBetwe(int a, int b) {
		for(int i = a; i<=b; i++) {
			if(isArmstrong(i)) {
				System.out.print(i+", ");
			}
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
