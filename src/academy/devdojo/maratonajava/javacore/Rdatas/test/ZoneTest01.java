package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tkZone = ZoneId.of("Asia/Tokyo");
        ZoneId brZone = ZoneId.of("America/Sao_Paulo");

        System.out.println(tkZone);
        System.out.println(brZone);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(tkZone);

        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant.atZone(tkZone));

        Instant brManausTime = nowInstant.atZone(brZone).plusHours(-4).toInstant();
        System.out.println(brManausTime);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime);
        OffsetDateTime.of(now, zoneOffsetManaus);

        OffsetDateTime offsetDateTime1 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        JapaneseDate from = JapaneseDate.from(LocalDate.now());
        System.out.println(from);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
