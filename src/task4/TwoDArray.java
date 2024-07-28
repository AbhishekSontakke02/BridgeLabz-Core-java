package task4;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = read2DArray();
        print2DArray(array);
    }

    public static int[][] read2DArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return array;
     
    }

    public static void print2DArray(int[][] array) {
        System.out.println("2D Array:");
        for (int[] row : array) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
