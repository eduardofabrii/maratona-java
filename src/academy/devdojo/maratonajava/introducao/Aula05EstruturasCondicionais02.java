package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 56;
        String categoria = "";

        if (idade > 0 && idade <= 100) {
            if (idade < 15) {
                categoria = "Categoria Infantil";
            } else if (idade >= 15 && idade < 18) {
                categoria = "Categoria Juvenil";
            } else {
                categoria = "Categoria Adulto";
            }
        } else {
            System.out.println("Idade Inválida.");
        }

        System.out.println(categoria);
    }
}
