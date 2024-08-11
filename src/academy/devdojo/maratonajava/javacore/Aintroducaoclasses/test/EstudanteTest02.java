package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        // Não faz sentido não atribuir uma variavel (Estudante estudante = new Estudante();)
//        ... pq ela nao vai fazer refencia a nada. Mas é possivel chamar criar um objeto da classe sem atribuir a uma var.
        new Estudante();
        String Estudante = "Eduardo";
        System.out.println("Nome: " + Estudante);

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Graziele";
        estudante2.idade = 18;
        estudante2.sexo = 'F';
        System.out.println("Nome: " + estudante2.nome + ", " + estudante2.idade + " anos, sexo: " + estudante2.sexo);

    }
}
