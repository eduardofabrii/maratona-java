package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Eduardo"; // String constant pool
        String nome2 = "Eduardo";

        nome.concat(" Fabri");
//        nome = nome + " Fabri";

        String nome3 = new String("Eduardo"); // Cria uma variavel de refencia,
        // um objeto do tipo string e uma string no pool de strings

        // Para validar a refencia USA O == e nao o EQUALS
        System.out.println(nome == nome2);
        System.out.println(nome == nome3);
        System.out.println(nome == nome3.intern());

    }
}
