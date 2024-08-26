package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(100);
//        Para usar isso, o atributo velocidadeLimite deve ser public:
//        System.out.println("Velocidade antes de ser setada dentro do Main: " + Carro.velocidadeLimite);
//        Carro.velocidadeLimite = 180;
//        System.out.println("Velocidade depois de ser setada dentro do Main: " + Carro.velocidadeLimite);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
