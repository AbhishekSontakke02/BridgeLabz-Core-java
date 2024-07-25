package JavaPractice;
import java.lang.Math;
public class Distance {
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two integer arguments.");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println("The Euclidean distance from (" + x + ", " + y + ") to the origin (0, 0) is " + distance);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments must be integers.");
        }
    }
}
