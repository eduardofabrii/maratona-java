package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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

        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "pedrinho@gmail.com, j123taro@hotmail.com, @31zoro@outlook.br, teste@gmail.com.br";
        System.out.println("Email válido: ");
        System.out.println("zoro@outlook.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")).trim());
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
