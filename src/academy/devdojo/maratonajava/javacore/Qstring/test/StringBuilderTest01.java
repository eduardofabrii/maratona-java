package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat(" DevDojo");
        String subs = nome.substring(9,13);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb);
        sb.append(" AAA");
        System.out.println(sb);
        System.out.println(subs);
    }
}
