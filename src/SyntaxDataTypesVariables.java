//Java Syntax, Data Types, and Variables
// This is an example of constant variable: "final  int  SIDES_OF_A_DICE  =  6 ;"
public class SyntaxDataTypesVariables {
    public static void main(String[] args) {
        {
            System.out.println("Code inside of curly braces should be indented");
            System.out.println("with four spaces");

            //Exercise time
            int myFavoriteNumber = 2;
            String myString = "My favorite number is: " + myFavoriteNumber;
            long myNumber = 200;
            System.out.println(myFavoriteNumber);
            System.out.println(myString);
            System.out.println(myNumber);

            //First Code Block
            int x = 5;
            System.out.println(x++);
            System.out.println(x);

            System.out.println("----------");

            //Second Code Block
            int y = 5;
            System.out.println(++y);
            System.out.println(y);

            //third Code Block (Expect an Error can't compile and can't convert to int)
//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;
//            int three = (int) "three";
            System.out.println("----------");

            // Show the max value for the specific type
            System.out.println("Integer: " + Integer.MAX_VALUE);
        }
    }
}
