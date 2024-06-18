// Find first and last positions of an element in a sorted array

import java.util.Arrays;

public class sorting1 {
    public static int[] fistandlast(int arr[], int x, int n) {
        int ans[] = new int[2];
        arr[0] = arr[1] = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                ans[0] = i;
                while (i + 1 < n && arr[i + 1] == x) {
                    i++;

                }
                ans[1] = i + 1;
                break;

            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 4, 4, 4, 5, 6, 7, 8 };
        int x = 4;
        int n = arr.length;
        System.out.println(Arrays.toString(fistandlast(arr, x, n)));

    }
}
