// // Find four elements that sum to a given value (4Sum) | Set 1 (n^3 solution)
// public class sorting10 {
//     public static void fourSum(int arr[], int n, int x) {
//         for (int i = 0; i < n - 3; i++) {
//             for (int j = i + 1; j < n - 2; j++) {
//                 for (int k = j + 1; k < n - 1; k++) {
//                     for (int l = k + 1; k < n; k++) {
//                         if (arr[i] + arr[j] + arr[k] + arr[l] == x) {
//                             System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "+" + arr[l] + "=" + x);
//                             return;
//                         }
//                     }
//                 }
//             }
//         }
//         System.out.println("There is no element whose sum is equal to " + x);
//     }

//     public static void main(String args[]) {
//         int arr[] = { 10, 2, 3, 4, 5, 9, 7, 8 };
//         int x = 21;
//         int n = arr.length;
//         fourSum(arr, n, x);
//     }
// }

import java.util.Arrays;

public class sorting10 {
    public static void fourSum(int arr[], int n, int x) {
        int l;
        int r;
        Arrays.sort(arr);
        for (int i = 0; i < n - 3; i++) {
            for (int j = 0; j < n - 2; j++) {
                l = j + 1;
                r = n - 1;
                while (l < r) {
                    if (arr[i] + arr[j] + arr[l] + arr[r] == x) {
                        System.out.println(arr[i] + "+" + arr[j] + "+" + arr[l] + "+" + arr[r] + "=" + x);

                        l++;
                        r--;
                        return;

                    } else if (arr[i] + arr[j] + arr[l] + arr[r] < x) {
                        l++;
                    } else {
                        r--;

                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 2, 3, 4, 5, 9, 7, 8 };
        int x = 21;
        int n = arr.length;
        fourSum(arr, n, x);
    }
}