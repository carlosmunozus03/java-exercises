package arrays;

import java.util.ArrayList;

public class ArrayListLecture {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element
        numbers.add(0, 21); // specifying an index
        numbers.add(22);

        System.out.println(numbers); // [21, 20, 22]

        System.out.println(numbers.size()); // 3
        System.out.println(numbers.get(2)); // 22

        System.out.println(numbers.indexOf(20));    // 1
        System.out.println(numbers.indexOf("cat")); // -1

        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts);

        System.out.println(roasts.contains("dark"));
        System.out.println(roasts.contains("espresso"));

        System.out.println(roasts.lastIndexOf("medium"));
        System.out.println(roasts.isEmpty());

        ArrayList<String> emptyString = new ArrayList<>();
        System.out.println(emptyString.isEmpty());
        System.out.println(roasts.remove("espresso"));
        System.out.println(roasts.remove("medium"));
        System.out.println(roasts);
        System.out.println(roasts.remove(2));
        System.out.println(roasts);
    }
}
//        .size	returns the number of elements in the array
//        .add	add an element to the collection (optionally) at a specified index
//        .get	return the element at the specified index
//        .indexOf	return the first found index of the given item, or -1 if not found

//        .contains	check if a collection contains a given element
//        .lastIndexOf	find the last index of the given element, -1 if not found
//        .isEmpty	check if the list is empty
//        .remove	remove the first occurrence of an item, or an item at a given index