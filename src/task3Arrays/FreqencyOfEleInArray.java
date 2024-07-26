package task3Arrays;

public class FreqencyOfEleInArray {
	public static void main(String[] args) {
        int[] array = {1, 1,2, 2, 3, 3, 3, 4, 4, 3,5,6,5,6,4,4, 4};
        findFrequancy(array);
    }
    
    public static void findFrequancy(int[] array) {
    	boolean[] visited = new boolean[array.length];
    	
    	for(int i=0; i<array.length; i++) {
    		if(visited[i]) {
    			continue;
    		}
    		int count = 1;
    		for(int j = i+1; j<array.length; j++) {
    			if(array[i]==array[j]) {
    				visited[j] = true;
    				count += 1;
    			}
    		}
    		System.out.println("Element : "+ array[i] +", Frequency : "+ count);
    	}
    }


}
