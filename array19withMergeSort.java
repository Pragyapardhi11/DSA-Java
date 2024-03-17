//count inverse of array using merge sort 

import java.util.Arrays;

public class array19withMergeSort {
    public static int MergeAndCount(int arr[], int l, int m, int r) {
        int left[] = Arrays.copyOfRange(arr, l, m + 1);
        int right[] = Arrays.copyOfRange(arr, m + 1, r);
        int i = 0;
        int j = 0;
        int k = l;
        int swaps = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
                swaps += (m + 1) - (l + i);
            }

        }
        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            k++;
            j++;

        }
        return swaps;
    }

    public static int MergeSortAndCount(int arr[], int l, int r) {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            count = count + MergeSortAndCount(arr, l, m);
            count = count + MergeSortAndCount(arr, m + 1, r);
            count = count + MergeAndCount(arr, l, m, r);
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 8, 4, 2, 1 };
        int n = arr.length;
        MergeSortAndCount(arr, 0, n - 1);

    }
}