import java.util.Arrays;

public class array14 {
    public static int GetMindiff(int arr[], int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int max = arr[n - 1];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) {
                continue;
            }
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, max - min);
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int n = arr.length;
        int b = GetMindiff(arr, n, k);
        System.out.println(b);

    }
}

// import java.util.*;

// public class array14 {
// public static int GetMinDiff(int arr[], int n, int k) {
// Arrays.sort(arr);
// int ans = arr[n - 1] - arr[0];
// int smallest = arr[0] + k;
// int Largest = arr[n - 1] - k;
// for (int i = 0; i < n - 1; i++) {
// int min = Math.min(smallest, arr[i + 1] - k);
// int max = Math.max(Largest, arr[i] + k);
// if (min < 0) {
// continue;
// }
// ans = Math.min(ans, max - min);
// }
// return ans;
// }

// public static void main(String args[]) {
// int arr[] = { 1, 5, 15, 20 };
// int n = arr.length;
// int k = 3;
// int b = GetMinDiff(arr, n, k);
// System.out.println(b);
// }
// }
