package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão é o primeiro dia da semana!");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        int subtracaoDiasDoAno = 365 - c.get(Calendar.DAY_OF_YEAR);
        System.out.println("Faltam " + subtracaoDiasDoAno + " dias para o ano acabar!! :)");

        c.add(Calendar.DAY_OF_MONTH, 2); // adiciona dias
        c.add(Calendar.HOUR, 1); // adiciona horas
        Date date = c.getTime();
        System.out.println(date);
    }
}
