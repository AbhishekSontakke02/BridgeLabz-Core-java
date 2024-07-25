package day3JavaPractice;

public class PrintDupsInArray {
	public static void main(String[] args) {
		int array[]= {1,3,2,5,5,2,1,9,4,5,2,3,6,5,3,2,3,5,7,5};
		dupsInArray(array);
	}
	
	public static void dupsInArray(int array[]) {
		boolean[] visited = new boolean[array.length];
		for(int i = 0; i < array.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count = 0;
			for(int j=0; j< array.length;j++) {
				if(array[i] == array[j]) {
					visited[j]=true;
					count+=1;				
					}
			}
			if(count>=2) {
				System.out.println(array[i]);
			}
		}
	}
}
