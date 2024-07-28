package NumberPrograms2;

import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binary = decimalToBinary(decimalNumber);
        String octal = decimalToOctal(decimalNumber);
        String hexadecimal = decimalToHexadecimal(decimalNumber);

        System.out.println("Binary representation: " + binary);
        System.out.println("Octal representation: " + octal);
        System.out.println("Hexadecimal representation: " + hexadecimal);

        scanner.close();
    }

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }
        String binary = "";
        while (decimalNumber > 0) {
            binary = (decimalNumber % 2) + binary;
            decimalNumber /= 2;
        }
        return binary;
    }

    public static String decimalToOctal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }
        String octal = "";
        while (decimalNumber > 0) {
            octal = (decimalNumber % 8) + octal;
            decimalNumber /= 8;
        }
        return octal;
    }

    public static String decimalToHexadecimal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }
        String hexadecimal = "";
        char[] hexDigits = "0123456789ABCDEF".toCharArray();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hexadecimal = hexDigits[remainder] + hexadecimal;
            decimalNumber /= 16;
        }
        return hexadecimal;
    }
}

