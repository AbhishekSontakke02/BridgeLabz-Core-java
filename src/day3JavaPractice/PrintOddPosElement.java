package day3JavaPractice;

public class PrintOddPosElement {
	public static void main(String[] args) {
		int array[] = {0,1,2,3,4,5,6,7,8,9,10};
		oddPosElement(array);
	}
	
	public static void oddPosElement(int array[]) {
		for(int i = 0; i < array.length; i++) {
			if(i%2!=0) {
				System.out.println(array[i]);
			}
		}
	}
}
