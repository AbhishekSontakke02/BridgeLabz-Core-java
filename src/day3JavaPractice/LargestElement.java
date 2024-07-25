package day3JavaPractice;

public class LargestElement {
	public static void main(String[] args) {
		int a[] = {10,7,21,75,65,85,91,20,33,44};
		System.out.println("Largest Element in Array is : " + largestElement(a));
	}
	public static int largestElement(int array[]) {
		int max = 0;
		for(int i= 0; i<array.length;i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
		
	}
}
