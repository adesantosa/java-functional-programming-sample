package functionalinterface;

import java.io.PrintStream;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // Normal java functional
        Customer sarah = new Customer("Sarah", "11952208542");
        greetCustomer(sarah);
        greetCustomerV2(sarah, false);

        // Consumer functional interface
        greetCustomerConsumer.accept(sarah);
        greetCustomerBiConsumer.accept(sarah, false);

    }

    // Declarative
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + "your number Phone are: "
                    + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer =
            ((customer, aBoolean) ->
                    System.out.println("Hello " + customer.customerName + "your number Phone are: "
                            + (aBoolean ? customer.customerPhoneNumber : "**********"))
                    );

    // Imperative
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + "your number Phone are: "
                + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean aBoolean) {
        System.out.println("Hello " + customer.customerName + "your number Phone are: "
                + (aBoolean ? customer.customerPhoneNumber : "**********"));
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
