package task3Arrays;

import java.util.Arrays;

public class SortArrayInAsc {
	public static void main(String[] args) {
		int array[]= {2,9,4,6,23,8,62,7};
		System.out.println("Before Sort : " + Arrays.toString(array));
		sortArrayAsc(array);
		System.out.println("After Sort : "+Arrays.toString(array));
	}
	public static void sortArrayAsc(int array[]) {
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array.length;j++) {
				if(array[i]<array[j]) {
					int temp = array[i];
					array[i]= array[j];
					array[j] = temp;
				} 
			}
		}
	}
}
