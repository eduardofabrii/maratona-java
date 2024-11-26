package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date data = new Date(1729552654342L);
        data.setTime(data.getTime() + 3_600_000); // UMA HORA A MAIS
        System.out.println(data);
    }
}
