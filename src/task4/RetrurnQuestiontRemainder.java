package task4;

public class RetrurnQuestiontRemainder {
	public static void main(String[] args) {
		int num = 5, divisor = 2;
		int[] result = queRem(num,divisor);
		System.out.println("The Questiont is : "+result[0]+" and the Remainder is : "+result[1]);
	}
	
	public static int[] queRem(int num, int divisor) {
		int que = num/divisor;
		int rem = num%divisor;
		return new int[]{que,rem};
	}
}
