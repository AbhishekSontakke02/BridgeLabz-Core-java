package NumberPrograms2;

public class ReplaceZeros {
    public static void main(String[] args) {
        
        int number = 102030;
        int result = replaceZerosWithOnes(number);
        
        System.out.println("Original number: " + number);
        System.out.println("Number after replacement: " + result);
    }

    public static int replaceZerosWithOnes(int number) {
        int result = 0;
        int place = 1;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                digit = 1; 
            }
            result = digit * place + result; 
            place *= 10; 
            number /= 10;
        }

        return result;
    }
}

