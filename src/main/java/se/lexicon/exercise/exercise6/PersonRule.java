package se.lexicon.exercise.exercise6;

@FunctionalInterface
public interface PersonRule {

    boolean matches(Person person);

    default PersonRule and(PersonRule other) {
        return person ->  this.matches(person) && other.matches(person);
    }

    default PersonRule or(PersonRule other) {
        return person ->  this.matches(person) || other.matches(person);
    }

    default PersonRule negate() {
        return person -> !this.matches(person);
    }
}
