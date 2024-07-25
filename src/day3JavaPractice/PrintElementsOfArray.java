package day3JavaPractice;

public class PrintElementsOfArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		printArray(a);
	}
	
	public static void printArray(int a[]) {
		int length = a.length;
		for(int i = 0; i<length;i++) {
			System.out.println(a[i]);
		}
	}
	
}
