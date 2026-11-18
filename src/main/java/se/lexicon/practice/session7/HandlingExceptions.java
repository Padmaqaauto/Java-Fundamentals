package se.lexicon.practice.session7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class HandlingExceptions {


    public static double takeDecimalInput(String prompt) {

        while (true) {
            try {
                String input = IO.readln(prompt);
                double result = Double.parseDouble(input);
                IO.println("Result is: " + result);
                return result;

            } catch (NullPointerException e) {
                IO.println("Input should not be null");
            } catch (NumberFormatException e) {
                IO.println("Please enter a valid number");
            }
        }


    }

    public static void readTextFile() {
        try {
        // Files.readAllLines();
        // Read the entire file into memory at once and returns List of String
        // Easy to use and beginner-friendly
        // Best for SMALL files

        // Files.newBufferedReader();
        // It reads the file line by line
        // Suitable for LARGE files

        // Files.lines();
        // Returns a stream of data


        Path path = Path.of("dir/lastnames.txt");

           List<String> lines =  Files.readAllLines(path);
           lines.forEach(line -> IO.println(line));
            IO.println("------------------");
            Files.lines(path).forEach(IO::println);
            IO.println("----------------------");
            Files.newBufferedReader(path).lines().forEach(IO::println);
        } catch (NoSuchFileException e) {
            IO.println("File not found or invalid path:"+ e.getMessage());
        } catch (IOException e) {
            IO.println("Error reading file");
            IO.println("Reason: " + e.getMessage());
            e.printStackTrace();
        }


    }

    public static void readImageAndCopy() {
        try {
            Path sourcePath = Paths.get("source/java_logo.png");
            Path destinationPath = Paths.get("destination/java_logo.png");
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (NoSuchFileException | FileAlreadyExistsException e) {
            IO.println("File Error:" + e.getMessage());
        } catch (IOException e) {
            IO.println("Error copying file.");
            IO.println("Reason: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void writeTextToFileNew() {
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get("dir/lastnames.txt"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        ) {
            writer.append("TestName");
            writer.append(",");
            IO.println("Data written successfully.");
        } catch (IOException e) {
            System.err.println("❌ Error closing writer.");
            e.printStackTrace();
        }
    }
    void main() {

        double number = takeDecimalInput("Please enter a number");
        IO.println("Number is: " + number);

        readTextFile();

        readImageAndCopy();

        writeTextToFileNew();

    }


}
