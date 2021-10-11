package exercises;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println("-----------------------------------------");

        //Exercise with do while loop
        long j = 2;
        do {
            System.out.println(j);
            j *= j;
        } while (j < 1000000);

        System.out.println("-----------------------------------------");

        //Now refactor the code in a for loop
        for (int x = 100; x >= -10; x -= 5) {
            System.out.println(x);
        }
        System.out.println("-----------------------------------------");

        for (long y = 2; y < 1000000; y *= y) {
            System.out.println(y);
        }

        System.out.println("-----------------------------------------");

        // exercises.FizzBuzz
        System.out.println("Now do the Fizz Buzz problem!");
        for (int fb = 1; fb <= 100; fb++) {
            if (fb % 5 == 0 && fb % 3 == 0) {
                System.out.println("exercises.FizzBuzz");
            } else if (fb % 5 == 0) {
                System.out.println("Buzz");
            } else if (fb % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(fb);
            }
        }

        //Powerful table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number would you like to go up");
        boolean userContinue = false;
        do {
            int userInput = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInput; i++) {
                System.out.printf("%-7d| %-8d| %-5d%n", i, i * i, i * i * i);
            }
            System.out.println("Do you want enter another number? y/n");
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase("y")) {
                userContinue = true;
            } else {
                System.out.println("Thanks for play with us!");
                break;
            }
        } while (userContinue);

        // Grades and letters
        Scanner scanner2 = new Scanner(System.in);
        boolean anotherGrade = false;
        while (anotherGrade = true) {
            System.out.println("Enter you qualification as a integer number between 0 and 100");
            int quantity = scanner2.nextInt();
            if (quantity >= 0 && quantity <= 59) {
                System.out.println("Your grade is: \"F\"");
            } else if (quantity >= 60 && quantity <= 66) {
                System.out.println("Your grade is: \"D\"");
            } else if (quantity >= 67 && quantity <= 79) {
                System.out.println("Your grade is: \"C\"");
            } else if (quantity >= 80 && quantity <= 87) {
                System.out.println("Your grade is: \"B\"");
            } else if (quantity >= 88 && quantity <= 98) {
                System.out.println("Your grade is: \"A\"");
            } else if (quantity >= 99 && quantity <= 100) {
                System.out.println("Your grade is: \"A +\"");
            }
            System.out.println("Your qualification is: " + quantity);
            System.out.println("Do you want enter another grade? y/n");
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("y")) {
                anotherGrade = true;
            } else {
                System.out.println("Have a good one!");
                break;
            }
        }
    }
}
