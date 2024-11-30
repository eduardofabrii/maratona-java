package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
//         \d - Todos os digitos
//         \D - Tudo que ñ for digito - tras até caracteres especiais
//         \s - Espaços em branco \t \n \f \r
//         \S - Todos os caracteres excluindo os brancos
//         \w - a-ZA-z, digitos, _
//         \W - Tudo que ñ for incluso no \w - Especiais e espaços
//         [] - Range, ou esse ou aquele
//         ? Zero ou uma
//         * Zero ou mais
//         + Uma ou mais
//         {n, m} de n até m
//         () Agrupamento
//         | o(v|c)o ovo | oco
//        $ fim de linha
//        . 1.3 = 123, 133, 1@3, 1A3

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
