package Exercises.util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("y") || scanner.next().equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        return this.scanner.nextInt();
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        return this.scanner.nextDouble();
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }

}
