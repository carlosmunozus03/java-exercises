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

        // FizzBuzz
        System.out.println("Now do the Fizz Buzz problem!");
        for (int fb = 1; fb <= 100; fb++) {
            if (fb % 5 == 0 && fb % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (fb % 5 == 0) {
                System.out.println("Buzz");
            } else if (fb % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(fb);
            }
        }
    }
}
