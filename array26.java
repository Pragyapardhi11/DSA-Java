// Maximum Product Subarray
public class array26 {
    public static int MaxProduct(int arr[], int n) {
        if (n == 0) {
            return 0;
        }
        int res = 1;
        int min = 1;
        int max = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                max *= arr[i];
                min = Math.min(min * arr[i], min);
            } else if (arr[i] == 0) {
                min = max = 1;
            } else {
                int temp = min;
                min = max;
                max = temp;
                min *= arr[i];
                max = Math.max(max * arr[i], max);
            }
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 6, -3, -10, 0, 2 };
        int n = arr.length;
        System.out.println(MaxProduct(arr, n));
    }
}
