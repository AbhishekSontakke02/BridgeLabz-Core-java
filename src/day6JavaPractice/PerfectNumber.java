package day6JavaPractice;

import java.util.ArrayList;

public class PerfectNumber {
	public static void main(String[] args) {
		int num = 29;
		if(isPerfectNumber(num)) {
			System.out.println(num+" is a Perfect Number!");
		}
		else {
			System.out.println(num+" is not a Perfect Number!");
		}
	}
	
	public static boolean isPerfectNumber(int num) {
		ArrayList<Integer> factors = factors(num);
		int sum = 0;
		for(int i : factors) {
			sum+=i;
		}
		if(sum == num) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static ArrayList<Integer> factors(int num){
		int i=1;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		while(i<num) {
			if(num%i==0) {
				factors.add(i);
			}
			i++;
		}
		return factors;
	}
	
}
