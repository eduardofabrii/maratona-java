package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidemensionais01 {
    public static <j> void main(String[] args) {
// 1, 2, 3, 4, 5 Meses
// 31, 28, 31, 30 Dias

        int[][] dias = new int[3][5];

        dias[0][0] = 31;
        dias[0][1] = 15;
        dias[0][2] = 25;
        dias[0][3] = 12;
        dias[0][4] = 29;

        dias[1][0] = 12;
        dias[1][1] = 15;
        dias[1][2] = 16;
        dias[1][3] = 9;
        dias[1][4] = 11;

        dias[2][0] = 2;
        dias[2][1] = 23;
        dias[2][2] = 4;
        dias[2][3] = 6;
        dias[2][4] = 8;

//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.println("Array "  + (i) + ", " +
//                        "posição " + (j+1) + ": " +
//                        dias[i][j]);
//            }
//        }

        for(int[] arrBase: dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
