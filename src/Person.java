public class Person {
    //Instance variables
    public String firstName;
    public String lastName;

    //Instance Method
    public String sayHello() {
        return String.format("Hello, my name is %s %s", firstName, lastName);
    }

    //Call function
    public static void main(String[] args) {
        Person person = new Person();     //instantiated
        person.firstName = "Carlos";
        person.lastName = "Munoz";
        System.out.println(person.sayHello()); // call the persona.function

        //Example 1
        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";
        //Example2
        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        System.out.println(ada.sayHello());   // "Hello from Ada Lovelace!"
        System.out.println(grace.sayHello()); // "Hello from Grace Hopper!"
    }
}