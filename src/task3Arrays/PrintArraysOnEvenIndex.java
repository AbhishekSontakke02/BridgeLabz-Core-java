package task3Arrays;

public class PrintArraysOnEvenIndex {
	public static void main(String[] args) {
		int [] array = {0,1,2,3,4,5,6,7,8,9};
		printEleOnEvenIndex(array);
	}
	public static void printEleOnEvenIndex(int [] array) {
		for(int i=0; i<array.length; i++) {
			if(i == 0) {
				continue;
			}
			else if(i%2==0) {
				System.out.println(array[i]);
			}

		}
	}	
}
