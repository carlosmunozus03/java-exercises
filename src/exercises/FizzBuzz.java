package exercises;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("exercises.FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
