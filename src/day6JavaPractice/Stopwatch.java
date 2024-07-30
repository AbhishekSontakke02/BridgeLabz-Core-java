package day6JavaPractice;

import java.util.Scanner;

public class Stopwatch {
    private long startTime;
    private long endTime;
    private boolean running;
    static Scanner scanner = new Scanner(System.in);

    public void start() {
        startTime = System.nanoTime();
        running = true;
        System.out.println("Stopwatch started...");
    }

    public void stop() {
        if (running) {
            endTime = System.nanoTime();
            running = false;
            System.out.println("Stopwatch stopped.");
        } else {
        }
    }

    public void getElapsedTime() {
        if (!running && startTime != 0) {
            long elapsedTime = endTime - startTime;
            double elapsedSeconds = elapsedTime / 1000000000.0;
            System.out.printf("Elapsed time: %.6f seconds%n", elapsedSeconds);
        } else {
            System.out.println("Stopwatch has not been started or stopped properly.");
        }
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        String input;

        while (true) {
            System.out.println("Enter 'start' to start the stopwatch, 'stop' to stop it, or 'exit' to quit:");
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "start":
                    stopwatch.start();
                    break;
                case "stop":
                    stopwatch.stop();
                    stopwatch.getElapsedTime();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please enter 'start', 'stop', or 'exit'.");
            }
          
        }
        
    }
}
