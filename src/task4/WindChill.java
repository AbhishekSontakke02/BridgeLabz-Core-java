package task4;

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        if (Math.abs(t) > 50.00 || v > 120.00 || v < 3.00) {
            System.out.println("Invalid input values for temperature or wind speed.");
            return;
        }
        double windChill = calculateWindChill(t, v);
        System.out.println("Wind Chill: " + windChill);
    }

    public static double calculateWindChill(double t, double v) {
        return 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
    }
}
