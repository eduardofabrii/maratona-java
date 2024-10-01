package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        Televisao tv = new Televisao("Samsung 90", 10000);

        tomate.setDataValidade("12/12/2024");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(produto);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(tv);
    }
}
