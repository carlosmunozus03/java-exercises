public class InterviewTest {
    public static void main(String[] args) {
        int[] firstArray = {10, 5, 7, 2, 4, 1, 24};
        int[] secondArray = {8, 23, 29, 25, 40, 0, 24};
        System.out.println("The second smallest number in the first arrays is: " + firstArray[5] + " and the second " +
                "largest number in the same array is: " + firstArray[0]);
        System.out.println("The second smallest number in the second arrays is: " + secondArray[0] + " and the second" +
                " " +
                "largest number in the same array is: " + secondArray[3]);
        System.out.println("The index of this number " + firstArray[5] + " is: " + firstArray[1]);
//        System.out.println("The index of this number " + firstArray[0] + " is: " + firstArray[0]);
        System.out.println("The index of this number " + secondArray[0] + " is: " + secondArray[1]);

        System.out.println("-------------");

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 6);

        System.out.println("-------------");

        String[] letters = {"a", "b", "b", "l", "o", "s", "e", "c", "k", "c"};
        for (String letter : letters) {
            System.out.println(letter);
            if (letter.equals("b")) {
                System.out.println("b:2");
            } else if (letter.equals("i")) {
                System.out.println("i:1");
            } else if (letter.equals("s")) {
                System.out.println("s:1");
            } else if (letter.equals("c")) {
                System.out.println("c:2");
            } else {
                System.out.println(letter);
            }
        }
    }
}

//1) Find the 2nd largest and 2nd smallest number in two arrays of numbers combined.Also the index of the first occurrence of those numbers in the array
//        I.e. - [10,5,7,2,4,1,24] & [8,23,29,25,40,0,24] -> 2nd Largest : 29 , 2nd Smallest: 1
//
//        2) Program to print elements/character of an string present on odd position, along with the count of those elements/characters in the entire string
//        i.e abbloseckc - b:2,l:1,s:1,c:2
//
//        3) Write a function to represent a Triangle, given input is the number of rows of the triangle
//        Example if the number of rows is 3
//        Result:
//        1
//        2 3
//        4 5 6

