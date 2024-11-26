package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue() + " ou " + Month.JANUARY);
        LocalDate date = LocalDate.of(2024, Month.JANUARY, 22);
        LocalDate agora = LocalDate.now();
        System.out.println("Ano: " + date.getYear());
        System.out.println("Mês: " + date.getMonth());
        System.out.println("Dia: " + date.getDayOfYear());
        System.out.println("Dia da Semana: " + date.getDayOfWeek());
        System.out.println("Tamanho do Mês: " + date.lengthOfMonth());
        System.out.println("Ano bissexto: " + date.isLeapYear());
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(agora);
        System.out.println(date);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
    }
}
