package finalsection;

import java.util.Optional;
import java.util.function.Consumer;
import javax.swing.plaf.synth.SynthLookAndFeel;
import io.vavr.control.Option;

public class Main {

    public static void main(String[] args) {
        hello("Sarah", null, value -> {
            System.out.println("no lastName provided for " + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);

        Option.of(lastName)
                .peek(System.out::println)
                .onEmpty(()-> callback.accept(firstName));
    }
}
