package arrays;

public class Array {
    public static void main(String[] args) {
        String[] languages = {
                "html", "css", "javascript", "java"
        };

        for (String language : languages) {
            System.out.println(language);
        }
        System.out.println("-------------");
        int[] numbers = {
                1, 2, 3, 4, 5
        };
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
//Short way 'for loop'
