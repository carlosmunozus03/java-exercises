public class ControlStatementsLoops {
    public static void main(String[] args) {

        //Try to do the FizzBuzz in Java
        for (int i = 1; i <= 15; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Example of break and continue in a loop
        for (int j = 1; j < 100; j++) {
            if (j == 2) {
                continue;
            } else if (j == 5) {
                break;
            } else {
                System.out.println(j);
            }
        }
    }
}
