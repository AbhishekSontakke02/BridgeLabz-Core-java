package day5JavaPractice;
import java.util.Random;


public class FlipCoin {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		double random = r.nextDouble();
		
		boolean result = flipCoin(random);
		if (result) {
			System.out.println("Tails");
		}
		if(!result) {
			System.out.println("Head");
		}
	}
	
	static boolean flipCoin(double random) {
		if(random < 0.5) {
			return true;
		}
		if(random >0.5) {
			return false;
		}
		else {
			return false;
		}
	}
}
