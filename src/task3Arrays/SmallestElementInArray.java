package task3Arrays;
// Java Program to print the smallest element in an array
public class SmallestElementInArray {
	public static void main(String[] args) {
		int [] array = {2,4,1,2,6,67,87,4,2,93,4,34,33,};
		System.out.println("Largest Number Out of Given Array is : "+smallest(array));
	}
	public static int smallest(int [] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		return min;
		
	}
}
