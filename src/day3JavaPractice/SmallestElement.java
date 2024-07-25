package day3JavaPractice;

public class SmallestElement {
	public static void main(String[] args) {
		int array[]= {2,32,4,3,23,4,5,65,4,56,34,345};
		System.out.println("The Smalles Element in Array is : "+ smallestElement(array));

	}
	public static int smallestElement(int array[]) {
		int min =9999;
		for(int i = 0; i < array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		
		return min;
	}
}
