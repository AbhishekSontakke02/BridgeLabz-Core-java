package day3JavaPractice;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int array[] = {2,4,1,2,5,6,3,9,75,56,3};
		System.out.println("Array = "+ Arrays.toString(array));
		System.out.println("Second Largest Number is : " + secondLargest(array));
	}
	
	public static int secondLargest(int array[]) {
		int max = 0;
		int secondlargest = 0;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				secondlargest = max;
				max = array[i];
			}
			else if (array[i] > secondlargest && array[i] < max) {
				secondlargest = array[i];
            }
		}
		return secondlargest;
	}

}
