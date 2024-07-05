// Given an array of pairs, find all symmetric pairs in it

import java.util.HashMap;

public class tcs6 {
    // public static void SymmetricPair(int arr[][], int rows) {
    // for (int i = 0; i < rows; i++) {
    // for (int j = i + 1; j < rows; j++) {
    // if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
    // System.out.print("(");
    // System.out.print(arr[i][0]);
    // System.out.print(",");
    // System.out.print(arr[i][1]);
    // System.out.println(")");

    // }
    // }
    // }
    // }

    public static void SymmetricPair(int arr[][]) {
        HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            Integer val = HM.get(second);

            if (val != null && val == first) {
                System.out.println("(" + second + "," + first + ")");
            } else {
                HM.put(first, second);

            }

        }

    }

    public static void main(String args[]) {
        int arr[][] = new int[6][2];
        arr[0][0] = 10;
        arr[0][1] = 11;
        arr[1][0] = 5;
        arr[1][1] = 15;
        arr[2][0] = 50;
        arr[2][1] = 60;
        arr[3][0] = 11;
        arr[3][1] = 10;
        arr[4][0] = 30;
        arr[4][1] = 40;
        arr[5][0] = 15;
        arr[5][1] = 5;
        System.out.println("the Following pairs are  symmetric:");
        SymmetricPair(arr);
    }
}
