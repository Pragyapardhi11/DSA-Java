// Three way partitioning of an array around a given range
public class array38 {
    public static void Threeway(int arr[], int a, int b) {
        int n = arr.length;
        int j = 0;
        int k = n - 1;
        for (int i = 0; i <= k; i++) {
            if (arr[i] < a) {
                // int temp = arr[i];
                // arr[i] = arr[j];
                // arr[j] = temp;
                arr[j] += arr[i] - (arr[i] = arr[j]);
                j++;
            } else if (arr[i] > b) {
                // int temp = arr[j];
                // arr[j] = arr[k];
                // arr[k] = temp;
                arr[k] += arr[i] - (arr[i] = arr[k]);
                k--;
            } else {
                i++;
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 14, 5, 4, 54, 87 };
        int a = 10;
        int b = 20;
        Threeway(arr, a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
