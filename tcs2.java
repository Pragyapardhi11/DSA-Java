// Program for array left rotation by d positions.
public class tcs2 {
    public static void leftRotation(int arr[], int n, int d) {
        d = d % n;
        for (int i = d, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        for (int i = 0, j = d - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // int start = 0;
    // int end = n - 1;

    // for (start = 0; start < end; start++) {
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;
    // start++;
    // end--;
    // }
    // }

    // public static void Rotate(int arr[], int d, int start, int end) {
    // int n = arr.length;
    // d = d % n;
    // leftRotation(arr, 0, d - 1);
    // leftRotation(arr, d, n - 1);
    // leftRotation(arr, 0, n - 1);
    // }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int n = arr.length;
        leftRotation(arr, n, 5);
        // leftRotation(arr, n, n);
        // Rotate(arr, 3, 0, n);
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }
}
