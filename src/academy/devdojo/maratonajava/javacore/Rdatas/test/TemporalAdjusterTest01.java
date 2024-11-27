package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays = 1;

        switch (dayOfWeek) {
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = LocalDate.now().withDayOfMonth(8).with(new ObterProximoDiaUtil());
        System.out.println(now);

        now = LocalDate.now().withDayOfMonth(9).with(new ObterProximoDiaUtil());
        System.out.println(now);

        now = LocalDate.now().withDayOfMonth(10).with(new ObterProximoDiaUtil());
        System.out.println(now);

        now = LocalDate.now().withDayOfMonth(11).with(new ObterProximoDiaUtil());
        System.out.println(now);
    }
}
