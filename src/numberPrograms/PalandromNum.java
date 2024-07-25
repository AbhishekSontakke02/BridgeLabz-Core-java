package numberPrograms;

public class PalandromNum {
	public static void main(String[] args) {
		int num = 123;
		if(isPalandrom(num)) {
			System.out.println("The number "+num+" is a Palndrom Number!");
		}
		else {
			/*here after debugging the isPalandrom function got to know logic is right but i copy pasted same messege from above
			 * made changes after as required
			*/
			System.out.println("The number "+num+" is Not a Palndrom Number!");
		}
	}
	public static boolean isPalandrom(int num) {
		int revNum = revNum(num);
		System.out.println(revNum);
		System.out.println(num);
		if(num == revNum) {
			System.out.println("if working");
			return true;
		}
		return false;
	}
	public static int revNum(int num) {
		int digit = 0, sum = 0;	
		while(num>0) {	 
				digit = num % 10;
				sum = sum * 10 + digit;
				num = num/10;
			}
		
		return sum ;
	}
}
