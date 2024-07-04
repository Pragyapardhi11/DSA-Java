// // Print array after it is right rotated K times
// public class tcs4 {
//     public static void rotation(int arr[], int k, int n) {
//         k = k % n;
//         for (int i = n - k, j = n - 1; i < j; i++, j--) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//         for (int i = 0, j = n - k - 1; i < j; i++, j--) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//         for (int i = 0, j = n - 1; i < j; i++, j--) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, 3, 5, 7, 9 };
//         int n = arr.length;
//         int k = 3;
//         // System.out.println(arr.length);
//         rotation(arr, k, n);

//     }

// }

import java.util.*;

public class tcs4 {
    public static void rotated(int arr[], int n, int k) {
        k = k % n;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                System.out.print(arr[n - k + i] + " ");
            } else {
                System.out.print(arr[i - k] + " ");
            }
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 5, 7, 9 };
        int n = arr.length;
        int k = 3;
        rotated(arr, n, k);

    }
}