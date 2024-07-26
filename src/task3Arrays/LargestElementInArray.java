package task3Arrays;

public class LargestElementInArray {
	public static void main(String[] args) {
		int [] array = {2,4,1,2,6,67,87,4,2,93,4,34,33,};
		System.out.println("Largest Number Out of Given Array is : "+largest(array));
	}
	
	public static int largest(int [] array) {
		int max = 0;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
