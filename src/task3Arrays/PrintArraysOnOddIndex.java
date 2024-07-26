package task3Arrays;

public class PrintArraysOnOddIndex {
	public static void main(String[] args) {
		int [] array = {0,1,2,3,4,5,6,7,8,9};
		printEleOnOddIndex(array);
	}
	
	public static void printEleOnOddIndex(int [] array) {
		for(int i=0; i<array.length; i++) {
			if(i==0) {
				continue;
			}
			else if(i%2==0) {
				continue;
			}
			else {
				System.out.println(array[i]);
			}
		}
	}
}
