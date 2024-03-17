import java.util.*;

public class array12 {
    public static void rotateArray(int arr[], int start, int end) {

        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 5;
        int n = arr.length;
        // k = k % n;
        rotateArray(arr, 0, n - 1);
        rotateArray(arr, 0, k - 1);
        rotateArray(arr, k, n - 1);
        System.out.println(Arrays.toString(arr));
    }

}
