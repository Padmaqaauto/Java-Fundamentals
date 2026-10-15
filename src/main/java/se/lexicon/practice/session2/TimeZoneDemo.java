package se.lexicon.practice.session2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneDemo {
    void main(){
        // Instant
        // current timestamp in UTC
        Instant instantNow = Instant.now();
        IO.println("Current Instant: " + instantNow);

        // TimeZones
        ZonedDateTime timeIndia = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        IO.println("India Time: " + timeIndia);

        // Get your local system's default zone
        ZoneId zone = ZoneId.systemDefault();
        IO.println("My Zone: " + zone);
    }
}
