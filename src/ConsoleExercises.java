import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately" + pi);
        System.out.format("The value of pi is approximately %s \n", pi);
        System.out.println("-----------------------------------------");

        //Exploring the Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user.. enter a integer number");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //asking for 3 different words
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the First word");
        String firstWord = scanner2.next();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the Second word");
        String secondWord = scanner3.next();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter the final word");
        String thirdWord = scanner4.next();

        System.out.println("You first word is: --> \"" + firstWord + "\" <--");
        System.out.println("You second word is: --> \"" + secondWord + "\" <--");
        System.out.println("You third word is: --> \"" + thirdWord + "\" <--");

        System.out.println("-----------------------------------------");
        System.out.printf("And in combination you enter: %s %s %s", firstWord, secondWord, thirdWord + " !\n");

        //Now enter a sentence
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Now... enter a sentence");
        String sentence = scanner5.nextLine();
        System.out.println("You third word is: --> \"" + sentence + "\" <--");

        System.out.println("-----------------------------------------");

        //Calculate the perimeter and area of classrooms
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a length value");
//....... continue tomorrow
    }
}
