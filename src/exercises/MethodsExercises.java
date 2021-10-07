package exercises;

public class MethodsExercises {
    public static void main(String[] args) {
        add(2, 4);
        subtract(4, 2);
        multiply(3, 4);
        divide(4, 2);
    }

    public static void add(long a, long b) {
        System.out.println(a + b);
    }

    public static void subtract(long a, long b) {
        System.out.println(a - b);
    }

    public static void multiply(long a, long b) {
        System.out.println(a * b);
    }

    public static void divide(long a, long b) {
        System.out.println(a / b);
    }
}
