package NumberPrograms2;


import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("Highest Common Factor (HCF): " + hcf);
        System.out.println("Lowest Common Multiple (LCM): " + lcm);

        scanner.close();
    }

    // Function to find HCF of two numbers
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM of two numbers
    public static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }
}
