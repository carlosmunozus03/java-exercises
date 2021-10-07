package exercises;

import java.util.Scanner;

public class ConsoleInputOutput {
    public static void main(String[] args) {
        // printf, allow use a markers as %s
        String name = "Carlos";
        System.out.printf("Hello, %s!. Nice to Meet you \n", name);

        System.out.println("----------------");

        String greeting = "Hello";
        String newName = "Carlos Munoz";

        System.out.printf("%s, %s", greeting, newName + " is Good to see you again! \n");

        System.out.println("----------------");

//Now we will get information from the user in the console with Scanner class
        //1.- scanner.next(); return only the first string the user text
        //2.- Now for fix this error we will use scanner.nextLine(); for show all user text
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something");
        String userInput = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}
