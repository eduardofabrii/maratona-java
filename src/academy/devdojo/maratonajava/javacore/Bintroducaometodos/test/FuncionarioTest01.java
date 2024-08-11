package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

//        funcionario.salarios = new double[]{3000.2, 2123.2, 1243.63};

        funcionario.setNome("Pelé da Silva Costa Ferreira");
        funcionario.setIdade(96);
        funcionario.setSalarios(new double[]{1300, 1200, 8000});
        funcionario.imprimirDados();

        System.out.println("Média :" + funcionario.getMedia());
    }
}
