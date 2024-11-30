package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
//         \d - Todos os digitos
//         \D - Tudo que ñ for digito - tras até caracteres especiais
//         \s - Espaços em branco \t \n \f \r
//         \S - Todos os caracteres excluindo os brancos
//         \w - a-ZA-z, digitos, _
//         \W - Tudo que ñ for incluso no \w - Especiais e espaços
//         [] - Range, ou esse ou aquele
        String regex = "0[xX][0-9a-fA-F]";
        String regex1 = "[a-zA-C]";
        String texto = "cafeBABE";
        String texto2 = "@asd h123\tdasb_312";
        String texto3 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto3);
        System.out.println("Texto:  " + texto3);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posicoes encontradas");
        System.out.println(texto2.length());
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
