import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi my name is Bob, let's talk about something");
        System.out.println("To finish just say 'QUIT'");
        String answer = scanner.next();
        while (!answer.equalsIgnoreCase("quit")) {
            System.out.println("what do you want?");
            answer = scanner.next();
            if (answer.isEmpty()) {
                System.out.println("Fine. Be that way");
            } else if (answer.endsWith("?")) {
                System.out.println("Sure...");
            } else if (answer.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }
        }
        System.out.println("I'm out of here...");
    }
}
