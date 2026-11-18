package se.lexicon.exercise.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Ex7NameList {
    private final List<String> names = new ArrayList<>();

    public void addName(String name) throws DuplicateNameException {
        String normalizedName = normalize(name);
        if (names.stream().anyMatch(existing -> existing.equalsIgnoreCase(normalizedName))) {
            throw new DuplicateNameException("Name already exists: " + normalizedName);
        }
        names.add(normalizedName);
    }

    public String findName(String name) throws NameNotFoundException {
        String normalizedName = normalize(name);
        return names.stream()
                .filter(existing -> existing.equalsIgnoreCase(normalizedName))
                .findFirst()
                .orElseThrow(() -> new NameNotFoundException("Name not found: " + normalizedName));
    }

    private static String normalize(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        return name.trim();
    }

    void main() {
        Ex7NameList list = new Ex7NameList();
        try {
            list.addName("Alex");
            list.addName("Sam");
            String nameToFind = IO.readln("Enter a name to find: ");
            IO.println("Found: " + list.findName(nameToFind));
            list.addName(IO.readln("Enter a new name to add: "));
        } catch (DuplicateNameException | NameNotFoundException e) {
            IO.println(e.getMessage());
        }
    }
}
