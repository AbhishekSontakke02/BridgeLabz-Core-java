package NumberPrograms2;

public class NumOfTimesX {
	public static void main(String[] args) {
		int x = 1, num = 11211231;
		System.out.println("The Number Times "+x+" Apppears in "+num+" is : "+count(num,x));
	}
	
	public static int count(int num, int x) {
		int count = 0, digit = 0;
		while(num>0) {
			digit = num%10;
			if(digit == x) {
				count+=1;
			}
			num = num/10;
		}
		return count;
	}
}
