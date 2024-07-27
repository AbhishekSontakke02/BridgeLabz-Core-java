package day5JavaPractice;
import java.util.Random;

public class FlipCoin {
	
	public static void main(String[] args) {
		flipCoin(10);
	}
	
	static void flipCoin(int flips) {
		int tails =0, heads =0;
		Random r = new Random();
        for (int i = 0; i < flips; i++) {
            if (r.nextDouble() < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }
        System.out.println("Percentage of Heads: " + (heads * 100.0 / flips) + "%");
        System.out.println("Percentage of Tails: " + (tails * 100.0 / flips) + "%");
	}
}



