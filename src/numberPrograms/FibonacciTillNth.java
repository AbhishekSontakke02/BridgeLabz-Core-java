package numberPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciTillNth {
	public static void main(String[] args) {
		int num = 10;
		int result = nthFibonacciNum(num);
		System.out.println("The Nth term of Fibonacci Series i.e "+ num+ "th term is : "+result);
	}
	
	public static int nthFibonacciNum(int n) {
		 if (n <= 0) {
	            throw new IllegalArgumentException("The term number must be positive");
	        }
		 else if (n == 1) return 0;
		 else if (n == 2) return 1;
		 
	        ArrayList<Integer> fibonacciSeries = new ArrayList<>(Arrays.asList(0, 1));
	        int i = 1;
	        while (fibonacciSeries.size() < n) {
	            int fibonacci = fibonacciSeries.get(i) + fibonacciSeries.get(i - 1);
	            fibonacciSeries.add(fibonacci);
	            i++;
	        }
	        return fibonacciSeries.get(n - 1);
	}
}
