package numberPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorOfNum {
	public static void main(String[] args) {
        int num = 15;
        List<Integer> primeFactors = getPrimeFactors(num);
        System.out.println("Prime factors of " + num + " are: " + primeFactors);
    }

    public static List<Integer> getPrimeFactors(int num) {
        List<Integer> factors = new ArrayList<>();

 
        while (num % 2 == 0) {
            factors.add(2);
            num /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }

        if (num > 2) {
            factors.add(num);
        }
        
        return factors;
    }
    }
