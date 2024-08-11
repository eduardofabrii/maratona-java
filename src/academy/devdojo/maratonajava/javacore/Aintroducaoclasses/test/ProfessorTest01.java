package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Paulo Moraes da Costa";
        professor.idade = 40;
        professor.sexo = 'M';
        professor.salario = 17437;

        System.out.println("Nome: " + professor.nome + ", Idade " + professor.idade + ", Sexo: " + professor.sexo + ", Salário: R$" + professor.salario);
    }
}
