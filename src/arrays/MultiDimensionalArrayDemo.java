package arrays;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        //Mr. Smith
        System.out.println(names[0][0] + names[1][0]); // access the first element in the first row
        //Ms. Jones
        System.out.println(names[0][2] + names[1][1]); // access the last element in the last row
    }
}
