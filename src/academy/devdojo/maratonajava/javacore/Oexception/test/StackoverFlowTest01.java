package academy.devdojo.maratonajava.javacore.Oexception.test;

public class StackoverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
