package task3Arrays;

public class PrintArray {
//Java Program to print the elements of an array
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		printArrayElemnets(array);
	}
	
	public static void printArrayElemnets(int [] array) {
		for(int i = 0; i< array.length; i++) {
		System.out.print(array[i]+" ");
		
		}
	}
}
