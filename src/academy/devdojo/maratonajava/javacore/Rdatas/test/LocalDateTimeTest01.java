package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2025-08-23");
        LocalTime time = LocalTime.of(9,45);
        LocalTime timeStr = LocalTime.parse("09:46:00");
        System.out.println(localDateTime);
        System.out.println(date);

        LocalDateTime ldt1 = date.atTime(time);
        System.out.println("ldt1: " + ldt1);
        LocalDateTime ldt2 = date.atTime(12,15,1);
        System.out.println("ldt2: " + ldt2);

        System.out.println(time + "\n" + timeStr);
    }
}
