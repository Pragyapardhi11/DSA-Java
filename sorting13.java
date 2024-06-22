// Merge two sorted arrays with O(1) extra space

import java.util.Arrays;

public class sorting13 {
    public static void mergerTwoArray(int arr1[], int arr2[], int n, int m) {
        for (int i = m - 1; i >= 0; i--) {
            int j;
            int last = arr1[n - 1];

            for (j = n - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
                arr1[j + 1] = arr1[j];
            }

            if (last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 5, 9, 10, 15, 20 };
        int arr2[] = { 2, 3, 8, 13 };
        int n = arr1.length;
        int m = arr2.length;
        mergerTwoArray(arr1, arr2, n, m);
        System.out.println("After mergering first array will be : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("After merging second array will be : ");
        System.out.println(Arrays.toString(arr2));
    }
}
