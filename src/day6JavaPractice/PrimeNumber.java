package day6JavaPractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 4;
		if(isPrime(num)) {
			System.out.println(num+ " is a Prime Number!");
		}
		else {
			System.out.println(num+ " is not a Prime Number!");

		}
	}
	
	public static boolean isPrime(int num) {
		int count =0;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count >1) {
			return false;
		}
		else {
			return true;
		}
		
	
	}
	
	}
