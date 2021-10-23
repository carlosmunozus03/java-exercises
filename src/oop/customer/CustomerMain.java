package oop.customer;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Carlos", "Munoz", "214 Main st");
        Customer customer2 = new Customer("Rodrigo", "Lopez", "334 Loan dr");
        Customer customer3 = new Customer("Diana", "Lean", "1023 Grav av");

        customer1.placeOrders();
        customer2.sendProduct();
        customer3.sendPayment();

        customer1.setFirstName("Andres");
    }
}
