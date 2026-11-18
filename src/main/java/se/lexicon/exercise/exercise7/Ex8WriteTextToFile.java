package se.lexicon.exercise.exercise7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex8WriteTextToFile {
    void main() {
        String inputPath = IO.readln("Enter the output file path (default output.txt): ");
        Path path = Path.of(inputPath.isBlank() ? "output.txt" : inputPath);
        String text = IO.readln("Enter text to write: ");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(text);
            IO.println("Text written to " + path);
        } catch (IOException e) {
            IO.println("Could not write to file: " + e.getMessage());
        }
    }
}
