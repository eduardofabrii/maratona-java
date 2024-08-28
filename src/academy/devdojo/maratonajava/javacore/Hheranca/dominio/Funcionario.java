package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
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
