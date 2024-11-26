package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration durationBetween1 = Duration.between(now, nowAfterTwoYears);
        Duration durationBetween2 = Duration.between(timeNow, timeMinus7Hours);
        Duration durationBetween3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));

        Duration duration = Duration.ofDays(20);
        System.out.println(duration);

        System.out.println(durationBetween1.getSeconds());
        System.out.println(durationBetween2);
        System.out.println(durationBetween3);
    }
}
