import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi my name is Bob, lets talk about something");
        String userinfo = scanner.nextLine();
        if (userinfo.endsWith("?")) {
            System.out.println("'Sure'");
        } else if (userinfo.endsWith("!")) {
            System.out.println("'Whoa, chill out!");
        } else if (userinfo.equals("")) {
            System.out.println("'Fine. Be that way!'");
        } else {
            System.out.println("'Whatever'");
        }
    }
}
