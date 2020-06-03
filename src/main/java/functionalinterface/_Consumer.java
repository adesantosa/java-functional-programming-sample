package functionalinterface;

import java.io.PrintStream;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // Normal java functional
        Customer sarah = new Customer("Sarah", "11952208542");
        greetCustomer(sarah);

        // Consumer functional interface
        greetCustomerConsumer.accept(sarah);

    }

    // Declarative
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + "your number Phone are: "
                    + customer.customerPhoneNumber);


    // Imperative
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + "your number Phone are: "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
