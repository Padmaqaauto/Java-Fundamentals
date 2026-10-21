package se.lexicon.practice.session3;

import java.util.ArrayList;
import java.util.Objects;

class Person1{
    int id;
    String name;
    String email;

    @Override
    public boolean equals(Object o) {
        //1.check if comparing the same instance
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
        return id == person.id &&
                Objects.equals(name, person.name) &&
                Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
public class OverrideExample {

    void main(){
        ArrayList<Person1> people = new ArrayList<>();

        Person1 p1 = new Person1();
        p1.id = 1;
        p1.name = "John";
        p1.email = "John123@gmail.com";

        people.add(p1);

        Person1 p2 = new Person1();
        p2.id = 1;
        p2.name = "John";
        p2.email = "John123@gmail.com";

        boolean exists = people.contains(p2);
        IO.println("exists: " + exists);

    }
}
