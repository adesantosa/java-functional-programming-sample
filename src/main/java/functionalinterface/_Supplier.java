package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        //Normal java approach
        System.out.println(getBDConnectionUrl());

        //Functional java approach
        System.out.println(getBDConnectionsSupplier.get());
    }

    //Imperative
    static String getBDConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    //Declarative
    static Supplier<List<String>> getBDConnectionsSupplier = ()
            -> List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/users");
}
