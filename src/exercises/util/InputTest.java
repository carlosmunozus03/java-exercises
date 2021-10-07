package exercises.util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println(in.getString());
        System.out.println(in.yesNo());
        System.out.println(in.getInt(3, 4));
        System.out.println(in.getDouble(2, 3.42));
    }
}
