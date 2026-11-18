package se.lexicon.exercise.exercise6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Main {

    static Predicate<Person> isActive = person -> person.isActive();
    static Predicate<Person>  isAdult = person -> person.getAge() > 18;
    static Predicate<Person>  livesInStockholm =  person -> person.getCity().equals("Stockholm");
    static Consumer<Person> getName = person -> IO.println(person.getName());
    static Consumer<Person>  sendEmail = person -> IO.println("Send Email to: " + person.getName());

    static Predicate<Person>  activeAndAdult = isActive.and(isAdult);
    static Predicate<Person>  adultOrStockholm = isAdult.or(livesInStockholm);
    static Predicate<Person>  notActive = person -> !person.isActive();

    void main(){

        List<Person> people = List.of(
                new Person("Amina", 22, "Stockholm", true),
                new Person("Erik", 17, "Uppsala", true),
                new Person("Noah", 34, "Stockholm", false),
                new Person("Sara", 29, "Gothenburg", true),
                new Person("Lina", 41, "Malmö", false),
                new Person("Omar", 19, "Stockholm", true)
        );


        IO.println("\nPerson isActive?: " + PersonProcessor.findPeople(people, isActive));
        IO.println("\nPerson age > 18?: " + PersonProcessor.findPeople(people, isAdult));
        IO.println("\nPerson lives in Stockholm: " + PersonProcessor.findPeople(people, livesInStockholm));

        IO.println("\nPrinting the PersonNames: " );
        PersonProcessor.applyToMatching(people, getName);
        IO.println("\nSending emails to the Persons: " );
        PersonProcessor.applyToMatching(people, sendEmail);

        IO.println("\n Persons who are active and adult");
        PersonProcessor.findPeople(people, activeAndAdult).forEach(System.out::println);
        IO.println("\n Person who are adult or lives in Stockholm");
        PersonProcessor.findPeople(people, adultOrStockholm).forEach(System.out::println);
        IO.println("\n Persons who are not active");
        PersonProcessor.findPeople(people, notActive).forEach(System.out::println);

        IO.println("\n----- Stream API ----");
        IO.println("\n All active persons");
        List<Person> activePersons = people.stream()
                .filter(person -> person.isActive())
                .toList();
        IO.println(activePersons);

        IO.println("\n Map all names");
        List<String> mapNames = people.stream()
                .map(person -> person.getName())
                .toList();
        IO.println(mapNames);

        IO.println("\n Count Adults");
        long countAdults = people.stream()
                .filter(person -> person.getAge() > 18)
                .count();
        IO.println(countAdults);

        IO.println("\n Sort by age");
        List<String> sortByAge = people.stream()
                .sorted(Comparator.comparingInt(person -> person.getAge()))
                .map(person -> person.getName())
                .toList();
        IO.println(sortByAge);

        IO.println("\n Find first active person in stockholm");
        Optional<Person> firstActivePerson = people.stream()
                .filter(person -> person.isActive())
                .filter(person -> person.getCity().equals("Stockholm"))
                .findFirst();
        firstActivePerson.ifPresent(str -> IO.println(str));

        // Optional tasks for stream API

        IO.println("\n --- Multiple Filters ---");
        IO.println("\n Active adults");
        List<Person> activeAdults = people.stream()
                .filter(person -> person.isActive())
                .filter(person -> person.getAge() > 18)
                .toList();
        IO.println(activeAdults);

        IO.println("\n Active People in Stockholm");
        List<Person> stockholmActive = people.stream()
                .filter(person -> person.isActive())
                .filter(person -> person.getCity().equals("Stockholm"))
                .toList();

        IO.println("\n Inactive people older than 30");
        List<Person> inactive = people.stream()
                .filter(person -> !person.isActive())
                .filter(person -> person.getAge() > 30)
                .toList();

        IO.println("\n --- Distinct and Sorting ---");
        IO.println("\n Sorted list of unique cities");
        List<String> distinctCities = people.stream()
                .map(person -> person.getCity())
                .distinct()
                .sorted()
                .toList();
        IO.println(distinctCities);

        IO.println("Sorted list of unique first letters of names");
        List<String> sortedFirstLetters = people.stream()
                .map(person -> person.getName().substring(0, 1))
                .distinct()
                .sorted()
                .toList();
        IO.println(sortedFirstLetters);

        IO.println("\n Mapping and Formatting");
        IO.println("\n Person details");
        List<String> personDetails = people.stream()
                .map(person -> person.getName() + " (" + person.getAge() + ") - " + person.getCity())
                .toList();
        IO.println(personDetails);

        IO.println("\n Person email addresses");
        List<String> emails = people.stream()
                .map(person -> person.getName().toLowerCase() + "@example.com")
                .toList();
        IO.println(emails);
    }


}
