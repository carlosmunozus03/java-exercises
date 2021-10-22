package oop.customer;

public class Customer {

    //attributes
    private String firstName;
    private String lastName;
    private String address;

    //methods

    void placeOrders() {
        System.out.println("Placing customer order " + firstName + " " + lastName);
    }

    void sendProduct() {
        System.out.println("Sending the customer " + firstName + " " + lastName + " to the address " + address);
    }

    void sendPayment() {
        System.out.println("Charging the customer " + firstName + " " + lastName);
    }

    //constructor

    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    //setter/getter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
