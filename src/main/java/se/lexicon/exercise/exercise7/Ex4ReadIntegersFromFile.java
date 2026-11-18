package se.lexicon.exercise.exercise7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;

public class Ex4ReadIntegersFromFile {
    void main() {
        String inputPath = IO.readln("Enter the file path (default numbers.txt): ");
        Path path = Path.of(inputPath.isBlank() ? "numbers.txt" : inputPath);

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                try {
                    IO.println(Integer.parseInt(line.trim()));
                } catch (NumberFormatException e) {
                    IO.println("Skipping invalid integer: " + line);
                }
            }
        } catch (NoSuchFileException e) {
            IO.println("File not found: " + path);
        } catch (IOException e) {
            IO.println("Could not read file: " + e.getMessage());
        }
    }
}
