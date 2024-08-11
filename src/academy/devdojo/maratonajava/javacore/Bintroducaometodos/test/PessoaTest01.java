package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

//        pessoa1.setNome("Eduardo");
//        pessoa1.setIdade(17);
//        pessoa1.imprimir();

        pessoa2.setNome("Graziele");
        pessoa2.setIdade(70);

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
    }
}
