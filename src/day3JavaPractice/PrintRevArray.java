package day3JavaPractice;

public class PrintRevArray {
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		revArray(array);
	}
	
	public static void revArray(int array[]) {
		for(int i = array.length-1; i >=0; i--) {
			System.out.println(array[i]);
		}
	}
}
