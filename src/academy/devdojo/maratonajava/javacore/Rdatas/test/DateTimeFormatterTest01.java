package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_WEEK_DATE);
        String s3 = date.format(DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("2021-12-31+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-W12-3", DateTimeFormatter.ISO_WEEK_DATE);
        LocalDate parse3 = LocalDate.parse("20221128", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse4 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        System.out.println(parse4);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime s5 = LocalDateTime.parse("2024-12-15T16:28:25.7876288");

        System.out.println(s4);
        System.out.println(s5);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        LocalDate formatBRparse = LocalDate.parse("19/02/2017", formatterBR);

        System.out.println(formatBR);
        System.out.println(formatBRparse);

        DateTimeFormatter formatterFrance = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRENCH);
        String formatFrance = LocalDate.now().format(formatterFrance);
        System.out.println(formatFrance);
        LocalDate parseFr = LocalDate.parse("19.novembre.2021", formatterFrance);
        System.out.println(parseFr);
    }
}
