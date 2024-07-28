package task4;

public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double distance = calculateDistance(x, y);
        System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) is " + distance);
    }

    public static double calculateDistance(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }
}
