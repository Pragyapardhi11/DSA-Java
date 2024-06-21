// // Maximum sum such that no two elements are adjacent (Stickler Thief)
// public class sorting11 {
//     public static int rec(int arr[], int idx, int N) {
//         if (idx >= N) {
//             return 0;
//         }
//         return Math.max(arr[idx] + rec(arr, idx + 2, N), rec(arr, idx + 1, N));
//     }

//     public static int FindMax(int num[], int N) {
//         return rec(num, 0, N);
//     }

//     public static void main(String args[]) {
//         int num[] = { 3, 2, 5, 10, 7 };
//         int N = num.length;
//         System.out.println(FindMax(num, N));
//     }
// }

//using dp
import java.util.*;

public class sorting11 {
    public static int UsingDP(int arr[], int N) {
        int dp[][] = new int[N][2];
        if (N == 1) {
            return arr[0];
        }

        dp[0][0] = 0;
        dp[0][1] = arr[0];

        for (int i = 1; i < N; i++) {
            dp[i][1] = dp[i - 1][0] + arr[i];
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        return Math.max(dp[N - 1][0], dp[N - 1][1]);
    }

    public static void main(String args[]) {
        int arr[] = { 5, 5, 10, 100, 10, 5 };
        int N = arr.length;
        System.out.println(UsingDP(arr, N));
    }
}