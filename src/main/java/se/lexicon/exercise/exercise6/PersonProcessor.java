package se.lexicon.exercise.exercise6;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class PersonProcessor {

    // Find people matching a condition
    public static List<Person> findPeople(
            List<Person> people,
            Predicate<Person> rule) {

        List<Person> matchedPeople = new ArrayList<>();

        for (Person person : people) {
            if (rule.test(person)) {
                matchedPeople.add(person);
            }
        }

        return matchedPeople;
    }

    // Apply an action only to matching people
    public static void applyToMatching(
            List<Person> people,
            Consumer<Person> action) {

        for (Person person : people) {
                  action.accept(person);
        }
    }

    // Apply an action to everyone
    public static void applyToAll(
            List<Person> people,
            Consumer<Person> action) {

        people.forEach(action);
    }
}
