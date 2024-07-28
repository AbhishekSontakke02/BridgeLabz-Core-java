package NumberPrograms2;

public class ExactDivisors {
    public static void main(String[] args) {
        int n = 100;  // Upper limit, you can change this value or take input from the user
        int x = 4;    // Number of divisors to find

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

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (i * i == number) {
                    divisorCount++; // Perfect square
                } else {
                    divisorCount += 2; // i and number/i
                }
            }
        }

        return divisorCount;
    }
}
