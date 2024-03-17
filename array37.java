// Smallest subarray with sum greater than a given value
public class array37 {
    public static int SumofSubArray(int arr[], int n, int x) {
        int curr = 0;
        int min_len = n + 1;
        int start = 0;
        int end = 0;
        while (end < n) {
            while (curr <= x && end < n) {
                curr = curr + arr[end++];
            }
            while (curr > x && start < n) {
                if (end - start < min_len) {
                    min_len = end - start;
                }
                curr -= arr[start++];
            }
        }
        return min_len;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 45, 6, 10, 19 };
        int n = arr.length;
        int x = 51;
        System.out.println(SumofSubArray(arr, n, x));
    }
}
