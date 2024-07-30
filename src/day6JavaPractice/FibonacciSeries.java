package day6JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=10;
		ArrayList<Integer> result = fibonnaciSeries(n);
		System.out.println(result);

	}
	
	public static ArrayList<Integer> fibonnaciSeries(int n) {
		ArrayList<Integer> fibonacci = new ArrayList<>(Arrays.asList(0,1));
		for(int i=2;i<=n;i++) {
			fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));  
		}
		return fibonacci;
	}
}	
