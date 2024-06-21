// Count triplets with sum smaller than a given value
// public class sorting12 {
//     public static int findtriplet(int arr[], int sum) {
//         int ans = 0;
//         for (int i = 0; i < arr.length - 2; i++) {
//             for (int j = i + 1; j < arr.length - 1; j++) {
//                 for (int k = j + 1; k < arr.length; k++) {
//                     if (arr[i] + arr[j] + arr[k] < sum)
//                         ans++;
//                 }
//             }
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 1, 3, 4, 7 };
//         int sum = 12;
//         System.out.println(findtriplet(arr, sum));

//     }
// }

import java.util.Arrays;

public class sorting12 {
    public static int findtriplet(int arr[], int sum) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    ans = ans + (k - j);// it directly gives the answer
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 3, 4, 7 };
        int sum = 12;
        System.out.println(findtriplet(arr, sum));
    }
}