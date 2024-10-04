package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }

        try {
            talvezLanceExcecoes();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println(" A ");
        }
    }

    private static void talvezLanceExcecoes() throws SQLException, FileNotFoundException {

    }
}
