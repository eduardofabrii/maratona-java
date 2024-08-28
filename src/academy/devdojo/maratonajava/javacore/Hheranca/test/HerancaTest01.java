package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("82.120-500");
        Pessoa pessoa = new Pessoa("Grazi");
        pessoa.setCpf("1111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Eduardo");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("---------");
        funcionario.imprimir();

    }
}
