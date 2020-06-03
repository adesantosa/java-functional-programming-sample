package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        // Normal java application
        System.out.println(isPhoneNumberValid("17952208542"));
        System.out.println(isPhoneNumberValid("11952208542"));

        // Functional
        System.out.println(isPhoneNumberValidPredicate.test("11952208542"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("11952208542"));

    }

    // Imperative
    static Boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("11") && phoneNumber.length() == 11;
    }

    // Declarative
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("11") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");


}
