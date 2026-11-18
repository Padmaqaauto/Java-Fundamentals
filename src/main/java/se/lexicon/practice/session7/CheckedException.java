package se.lexicon.practice.session7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;

public class CheckedException {
    void main(){
//        // File not found (IOException)
//        BufferedReader reader = Files.newBufferedReader(Paths.get("dir/lastnames.txt"));
//
//        // Database connection Error(SQL Exception)
//        DriverManager.getConnection("JDBC:mysql://localhost:3306/mydb","user","password");


        try (BufferedReader reader =
                     Files.newBufferedReader(Paths.get("dir/lastnames.txt"))) {

            String line = reader.readLine();
            IO.println(line);

        } catch (IOException e) {
            IO.println("Error reading file");
        }
    }
}
