package se.lexicon.practice.session2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    void main(){

        // 1. Current Date & Time
        LocalDate today = LocalDate.now();
        LocalTime now =  LocalTime.now();
        LocalDateTime currentDatetime = LocalDateTime.now();

        IO.println("Today: " + today);
        IO.println("Current time: " + now);

        // 2.Creating Specific Dates of()
        LocalDate specificDate = LocalDate.of(2024,1,16);
        LocalDateTime appointment = LocalDateTime.of(2024,1,16,13,30);

        IO.println("Specific date: " + specificDate);
        IO.println("Appointment date: " + appointment);

        // 3.Manipulation (Plus/ Minus)
        LocalDate tomorrow =today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYear = today.minusYears(1);

        IO.println("Tomorrow: " + tomorrow);
        IO.println("Next Month: " + nextMonth);
        IO.println("Last year: " + lastYear);

        // 4. Parsing from String
        LocalDate parsedDate = LocalDate.parse("2025-01-16");
        IO.println("Parse date: " + parsedDate);

        // 5. Custom Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy HH:mm");
        String formattedDate = currentDatetime.format(formatter);

        IO.println("Formatted date: " + formattedDate);


    }
}
