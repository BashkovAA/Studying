import java.lang.reflect.Array;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("Enter the size if the array:");
        int size = new Scanner(System.in).nextInt();
        char[][] result = getTwoDimensionalArray(size).clone();
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j]);
//            }
//            System.out.println();
//        }

    }
    public static char[][] getTwoDimensionalArray(int size) {
        char[][] cross = new char[size][size];
        for (int i = 0; i < cross.length; i++) {
            for (int j = 0; j < cross[i].length; j++) {
                if (i == j || (i + j == size -1)) {
                    cross[i][i] = 'X';
                    System.out.print(cross[i][j]);
                    continue;
                }
                cross[i][i] = ' ';
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
        return cross;
    }
}
