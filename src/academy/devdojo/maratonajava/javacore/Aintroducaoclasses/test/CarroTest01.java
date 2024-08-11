package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.nome = "Fiat";
        carro1.modelo = "Palio";
        carro1.ano = 2012;

        carro2.nome = "Fiat";
        carro2.modelo = "Parati";
        carro2.ano = 2013;

        carro3.nome = "Ford";
        carro3.modelo = "Fusion";
        carro3.ano = 2024;

        System.out.println("\nCarro 1: " + carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("\nCarro 2: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);
        System.out.println("\nCarro 3: " + carro3.nome + " " + carro3.modelo + " " + carro3.ano);

    }
}
