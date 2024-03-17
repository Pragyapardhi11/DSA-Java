
// // Longest Repeating Subsequence
// import java.util.*;

// public class string8 {
//     public static int LongestRecurSubString(String str, int m, int n) {
//         if (m == 0 || n == 0) {
//             return 0;
//         }
//         if ((str.charAt(m - 1) == str.charAt(n - 1)) && (m != n)) {
//             return LongestRecurSubString(str, m - 1, n) + 1;
//         }
//         return Integer.max(LongestRecurSubString(str, m - 1, n), LongestRecurSubString(str, m, n - 1));
//     }

//     public static void main(String args[]) {
//         String str = "aabb";
//         int n = str.length();
//         System.out.println(LongestRecurSubString(str, n, n));
//     }
// }

public class string8 {
    public static int LongestRecurSubString(String str) {
        int n = str.length();
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((str.charAt(i - 1) == str.charAt(j - 1)) && (i != j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][n];
    }

    public static void main(String args[]) {
        String str = "aabb";
        System.out.println(LongestRecurSubString(str));
    }
}