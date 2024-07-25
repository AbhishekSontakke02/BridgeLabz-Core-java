package numberPrograms;

public class PowOfNum {
	public static void main(String[] args) {
		int base = 2 , exponent = 3;
		System.out.println("The Power for the base = "+base+" and exponent = "+ exponent+" is : "+power(base,exponent));
	}
	
	public static long power(int base,int exponent) {
		long result = 1;
		for(int i = 0; i< exponent;i++) {
			result *= base;
		}
		return result;
		
	}
	
}
