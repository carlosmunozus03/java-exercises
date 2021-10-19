package oop.add;

import java.util.Scanner;

public class AddMain {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int first = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second value: ");
        int second = input2.nextInt();

        Add values = new Add(first, second);
        values.print();
    }
}
