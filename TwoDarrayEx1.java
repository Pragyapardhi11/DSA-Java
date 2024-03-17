import java.util.*;

public class TwoDarrayEx1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] meriMatrix = new int[row][column];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                meriMatrix[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (meriMatrix[i][j] == x) {
                    System.out.println("x is found in index" + "(" + i + " " + j + ")");

                }
            }
        }
    }
}