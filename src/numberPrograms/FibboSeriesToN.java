package numberPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class FibboSeriesToN {

	public static void main(String[] args) {
		int num = 50;
		fibbonacci(num);
	}
	
	public static void fibbonacci(int num) {
		 ArrayList<Integer> fibonacciSeries = new ArrayList<>(Arrays.asList(0,1)); 
		int i = 1,fibonacci = 1;
		while(fibonacci <= num) {
			fibonacci = fibonacciSeries.get(i)+fibonacciSeries.get(i-1);
			if(fibonacci <= num) {
				fibonacciSeries.add(fibonacci);
			}
			i++;
		}
		System.out.println(fibonacciSeries);
	}
}
