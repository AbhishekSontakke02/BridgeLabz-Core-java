package numberPrograms;

import java.util.ArrayList;

public class PerfectNumber {
	public static void main(String[] args) {
		int num = 28;
		if(isPerfectNum(num)) {
			System.out.println("The Number "+num+" is a Perfect Number!");
		}
		else {
			System.out.println("The Number "+num+" is not a Perfect Number!");
		}
	}
	
	public static boolean isPerfectNum(int num) {
		ArrayList<Integer> factors = factorsOfnumber(num);
		int sum = 0;
		for(int i = 0; i<factors.size();i++) {
			sum = sum+ factors.get(i);
		}
		if(num == sum) {
			return true;
		}
		
		return false;
	}
	
	public static ArrayList<Integer> factorsOfnumber(int num) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 1; i<num;i++) {
			if(num%i==0) {
				factors.add(i);
			}
		}
		System.out.println(factors);
		return factors;
	}
}
