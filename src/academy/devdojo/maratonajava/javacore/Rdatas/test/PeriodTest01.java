package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        Period period1 = Period.ofDays(12);
        Period period2 = Period.ofWeeks(58);
        Period period3 = Period.ofMonths(2);
        Period period4 = Period.ofYears(3);
        Period period5 = Period.between(now, nowAfterTwoYears);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
        System.out.println(Period.between(now, now.plusDays(period2.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(period2.getDays()), ChronoUnit.DAYS));
    }
}
