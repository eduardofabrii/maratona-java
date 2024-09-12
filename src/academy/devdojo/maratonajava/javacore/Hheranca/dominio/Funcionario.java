package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do inicialização bloco static de Funcionario");
    }
    {
        System.out.println("Bloco de inicialização de Funcionario 0");
    }
    {
        System.out.println("Bloco de inicialização de Funcionario 1");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu" + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
