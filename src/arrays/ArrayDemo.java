package arrays;

public class ArrayDemo {
    private static int i;

    public static void main(String[] args) {
        int[] anArray;              // 1 Declare an array
        anArray = new int[10];      // 2 Create an array

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        System.out.println("Element at index 0 is: " + anArray[0]);
        System.out.println("Element at index 1 is: " + anArray[1]);
        System.out.println("Element at index 2 is: " + anArray[2]);
        System.out.println("Element at index 3 is: " + anArray[3]);
        System.out.println("Element at index 4 is: " + anArray[4]);
        System.out.println("Element at index 5 is: " + anArray[5]);
        System.out.println("Element at index 6 is: " + anArray[6]);
        System.out.println("Element at index 7 is: " + anArray[7]);
        System.out.println("Element at index 8 is: " + anArray[8]);
        System.out.println("Element at index 9 is: " + anArray[9]);

        System.out.println("------------------------------");

        for (i = 0; i < anArray.length; i++) {
            System.out.println("Using a 'for loop'. The element at index " + i + " is: " + anArray[i]);
        }
    }
}
// Declares an array of integers
//int[] anArray;

//byte[] anArrayOfBytes;
//short[] anArrayOfShorts;
//long[] anArrayOfLongs;
//float[] anArrayOfFloats;
//double[] anArrayOfDoubles;
//boolean[] anArrayOfBooleans;
//char[] anArrayOfChars;
//String[] anArrayOfStrings;