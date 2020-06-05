package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static streams._Streams.Gender.MALE;
import static streams._Streams.Gender.FEMALE;
import static streams._Streams.Gender.OTHERS;

public class _Streams {



    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("André", MALE),
                new Person("Anne", FEMALE),
                new Person("Sarah", FEMALE),
                new Person("Wally", OTHERS)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, OTHERS
    }

}
