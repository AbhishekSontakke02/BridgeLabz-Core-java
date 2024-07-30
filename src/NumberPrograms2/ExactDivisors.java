package NumberPrograms2;

public class ExactDivisors {
    public static void main(String[] args) {
        int n = 100;  
        int x = 4;    
        
        int count = countIntegersWithExactDivisors(n, x);
        System.out.println("Number of integers up to " + n + " with exactly " + x + " divisors: " + count);
    }

    public static int countIntegersWithExactDivisors(int n, int x) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (countDivisors(i) == x) {
                count++;
            }
        }
        return count;
    }

    public static int countDivisors(int number) {
        int divisorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                    divisorCount++;
                } 
            }
        return divisorCount;
    }
}
