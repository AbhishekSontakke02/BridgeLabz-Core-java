package task3Arrays;

public class PrintArrayEleInRevOrder {
	public static void main(String[] args) {
		int [] array = {0,1,2,3,4,5,6,7,8,9};
		PrintArrayEleRev(array);
	}
	
	public static void PrintArrayEleRev(int [] array) {
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
	}
}
