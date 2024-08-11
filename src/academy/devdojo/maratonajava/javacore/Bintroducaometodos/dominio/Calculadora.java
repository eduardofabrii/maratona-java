package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double dividirDoisNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            return 0;
        }
        return numero1 / numero2;
    }

//    Os dois metodos sao iguais, mas muda a forma de pensar

    public double dividirDoisNumeros02(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        } else {
            return n1 / n2;
        }

//        if (n2 != 0) {
//            return n1 / n2;
//        } else {
//            return 0;
//        }
    }

    public double dividirDoisTeste(int numero1, double numero2) {
        return (double) (numero1 / numero2);
    }

    public void imprimirDivisaoDeDoisNumeros01(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero ");
        } else {
            System.out.println(n1 / n2);
        }
    }

    public void imprimirDivisaoDeDoisNumeros02(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero ");
            return;
        }
        System.out.println(n1 / n2);
    }

    public void alterarDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);
    }
    
    public void somarArray(int[] numeros) {
        int soma = 0;

        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somarVarArgs(int... numeros) {
        int soma = 0;

        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
