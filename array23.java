// Rearrange array in alternating positive & negative items with O(1) extra space
public class array23 {
    public static void RearrangePosNeg(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (i <= n - 1 && arr[i] > 0) {
                i++;
            }
            while (j >= 0 && arr[j] < 0) {
                j--;
            }
            if (i < j) {
                Swap(arr, i, j);
            }
        }
        if (i == 0 || i == n) {
            return;
        }
        int k = 0;
        while (k < n && i < n) {
            Swap(arr, i, k);
            i = i + 1;
            k = k + 2;
        }
    }

    public static void Swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, -4, -1, 6, -9 };
        int n = arr.length;
        RearrangePosNeg(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
