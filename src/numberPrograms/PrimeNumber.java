package numberPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 13;
		if(isprime(num)) {
			System.out.println("Number "+ num +" is Prime Number");
		}
		else {
			System.out.println("Number "+ num +" is not a Prime Number");
		}
	}
	
	public static boolean isprime(int num) {
		if(num <= 1){
			return false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
