package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime nascimento = LocalDateTime.of(2006, Month.AUGUST, 23, 9, 30, 15);
        long between = ChronoUnit.DAYS.between(nascimento, LocalDateTime.now());

        System.out.println("Dias: " + between);
        System.out.println("Meses: " + ChronoUnit.MONTHS.between(nascimento, LocalDateTime.now()));
        System.out.println("Anos: " + ChronoUnit.YEARS.between(nascimento, LocalDateTime.now()));
        System.out.println("Decadas: " + ChronoUnit.DECADES.between(nascimento, LocalDateTime.now()));
    }
}
