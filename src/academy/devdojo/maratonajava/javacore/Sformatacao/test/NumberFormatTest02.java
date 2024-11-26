package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 1000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "R$ 1.000,21"; // tive que imprimir o valor
        // em R$ para que pudesse copiar o código para converter
        String valorString2 = "1.000,21 €";

        try {
            System.out.println(nfa[0].parse(valorString));
            System.out.println(nfa[3].parse(valorString2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
