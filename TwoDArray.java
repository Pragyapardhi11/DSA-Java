import java.util.*;

public class TwoDArray {
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

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(meriMatrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
