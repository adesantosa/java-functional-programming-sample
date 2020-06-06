package optionals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static optionals.Main.Type.FAMILY;
import static optionals.Main.Type.NOT_FAMILY;

public class Main {

    public static void main(String[] args) {

        List<Person> familia = List.of(
                new Person("Sarah", null, FAMILY),
                new Person("Anne", "amoura.caraline@gmail.com", FAMILY),
                new Person("Murilo", "murilasouza@gmail.com", NOT_FAMILY),
                new Person("Miguel", "gsouza@gmail.com", NOT_FAMILY)
        );

        familia.stream()
                .filter(person1 -> FAMILY.equals(person1.type))
                .map(Person::getEmail)
                .map(s -> s.orElse("SarahVoceUsaEmailDoPaizao@gmail.com"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


    static class Person {
        private final String name;
        private final String email;
        private final Type type;

        Person(String name, String email, Type type) {
            this.name = name;
            this.email = email;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", type=" + type +
                    '}';
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }

    enum Type {
        FAMILY, NOT_FAMILY
    }
}

