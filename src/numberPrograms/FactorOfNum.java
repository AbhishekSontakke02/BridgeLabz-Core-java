package numberPrograms;

import java.util.ArrayList;

public class FactorOfNum {
	public static void main(String[] args) {
		int num = 15;
		factorOfnumber(num);
	}
	
	public static void factorOfnumber(int num) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 1; i<num;i++) {
			if(num%i==0) {
				factors.add(i);
			}
		}
		System.out.println("Factors of Number "+num+" are : "+factors);
	}
}
