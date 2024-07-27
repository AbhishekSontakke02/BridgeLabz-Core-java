package task4;
import java.util.Scanner;

public class HarmonicNUmber {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        System.out.println("The " + n + "th harmonic number is: " + harmonicNum(n));
        sc.close();
    }
	public static double harmonicNum(int n) {
		if (n == 0) {
            System.out.println("Input should not be zero.");
        }
        double harmonic = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }
        return harmonic;
	}
}


