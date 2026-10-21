package se.lexicon.exercise.exercise3;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UniqueCitiesTest {

    UniqueCities cities;
    ArrayList<String> city;

    @BeforeEach
    void setup() {
        cities = new UniqueCities();
        city = cities.createList();
    }

    @Test
    @DisplayName("Print all the cities in the List")
    void printCityNames(){
        cities.printList(city);

        assertEquals(7, city.size());
    }

    @Test
    @DisplayName("Print all the cities after removing duplicates")
    void printUniqueCityNames(){
        Set<String> result = cities.getUniqueCities(city);
        cities.printList(result);

        assertEquals(5, result.size());
    }

    @Test
    @DisplayName("Verify null list throws exception")
    void testNullCities(){

        assertThrows(IllegalArgumentException.class,
                () -> cities.getUniqueCities(null));
    }
}
