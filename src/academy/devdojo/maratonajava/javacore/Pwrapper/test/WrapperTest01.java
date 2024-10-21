package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;  // auto boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW;  // unboxing
        Integer intW2 = Integer.parseInt("2");
        System.out.println(intW2.getClass());
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);

        System.out.println(Character.isAlphabetic('2'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLetterOrDigit('9'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase('!'));
    }
}
