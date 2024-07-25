package numberPrograms;

public class PerfectSquare {
	public static void main(String[] args) {
		int num =5;
		if(isPerfectSquare(num)) {
			System.out.println("Number "+num+" is a Perfect Square!");
		}
		else {
			System.out.println("Number "+num+" is not a Perfect Square!");
		}
	}
	 public static boolean isPerfectSquare(int num) {
	        if (num < 0) {
	            return false; 
	        }
	        int sqrt = (int) Math.sqrt(num); 
	        return (sqrt * sqrt == num); 
	 }
}
