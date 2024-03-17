// // Longest Consecutive Subsequence using sorting  : iski tc = O(nlogn)

// import java.util.Arrays;

// public class array27 {
//     public static void main(String args[]) {
//         int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
//         int n = arr.length;
//         if (n == 0) {
//             return;
//         }
//         Arrays.sort(arr);
//         int count = 1;
//         int max_count = -1;
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i + 1] - arr[i] == 1) {
//                 count++;
//             } else if (arr[i + 1] - arr[i] == 0) {
//                 continue;
//             } else {
//                 count = 1;
//             }
//             max_count = Math.max(max_count, count);
//         }
//         System.out.println("Lngest consecutive Subsequence is " + max_count);

//     }
// }

// Longest Consecutive Subsequence iska tc=O(n)

import java.util.HashSet;

public class array27 {
    public static void LongCons(int arr[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int j = arr[i];
                while (hs.contains(j)) {
                    j++;
                }
                if (ans < j - arr[i]) {
                    ans = j - arr[i];
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        LongCons(arr);
    }
}
