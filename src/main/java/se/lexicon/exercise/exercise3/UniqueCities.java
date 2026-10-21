package se.lexicon.exercise.exercise3;

import java.util.*;

public class UniqueCities {

    public ArrayList<String> createList(){
        ArrayList<String> city = new ArrayList<>();
        city.add("Stockholm");
        city.add("Gothenburg");
        city.add("Malmö");
        city.add("Stockholm");
        city.add("Uppsala");
        city.add("Gothenburg");
        city.add("Lund");

        return city;
    }

    public void printList(Collection<String> cityNames){
        IO.println(cityNames.toString());
        IO.println("Total count: " + cityNames.size());
    }

    public Set<String> getUniqueCities(Collection<String> cityNames){
        if (cityNames == null) {
            throw new IllegalArgumentException("City list cannot be null");
        }

        if (cityNames.isEmpty()) {
            throw new IllegalArgumentException("No city names provided");
        }

        return new HashSet<>(cityNames);
    }

    void main() {
        UniqueCities cities = new UniqueCities();

        List<String> city = cities.createList();

        IO.println("The cities are:");
        cities.printList(city);

        Set<String> uniqueCities = cities.getUniqueCities(city);

        IO.println("\nThe unique cities are:");
        cities.printList(uniqueCities);
    }
}
