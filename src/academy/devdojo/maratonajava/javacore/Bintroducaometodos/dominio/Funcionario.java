package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade = 0;
    private double[] salarios;
    private double media;

    public void imprimirDados() {
        System.out.println("################################################");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            System.out.println("################################################");
            return;
        }
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + salarios[i]);
        }
        imprimirMediaDosSalarios();
        System.out.println("################################################");
    }

    private void imprimirMediaDosSalarios() {
        if (salarios == null) {
            return;
        } else {
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("Média salarial: " + media);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
