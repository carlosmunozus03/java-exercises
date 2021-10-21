package oop.family;

public abstract class Uncle {

    //attribute
    private String name;

    //methods
    void sayHello() {
        System.out.println("Hello from uncle abstract class");
    }

    void beNice() {
        System.out.println("Its nice to see you!");
    }

    //abstract method
    public abstract void sayGoodbye();


}

//this could not implement an interface!