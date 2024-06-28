// Inversion count in Array using Merge Sort

import java.util.Arrays;

public class sorting18 {

    public static int mergeAndCount(int arr[], int l, int mid, int r) {

        int[] left = Arrays.copyOfRange(arr, l, mid + 1);
        int[] right = Arrays.copyOfRange(arr, mid + 1, r + 1);

        int i = 0;
        int j = 0;
        int k = l;
        int swap = 0;

        // Merge the two subarrays and count swaps
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                swap += (mid + 1) - (l + i);
            }
        }

        // Copy remaining elements of left subarray, if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right subarray, if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return swap;
    }

    public static int mergeSortAndCount(int arr[], int l, int r) {
        int count = 0;

        if (l < r) {
            int mid = l + (r - l) / 2;

            count += mergeSortAndCount(arr, l, mid);
            count += mergeSortAndCount(arr, mid + 1, r);
            count += mergeAndCount(arr, l, mid, r);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 20, 6, 4, 5 };
        int n = arr.length;
        int result = mergeSortAndCount(arr, 0, n - 1);
        System.out.println("Number of inversions are: " + result);
    }
}

// //ye simple navie approach
// public class sorting18 {
// public static int InversionCount(int arr[], int n) {
// int count = 0;
// for (int i = 0; i < n - 1; i++) {
// for (int j = i + 1; j < n; j++) {
// if (arr[i] > arr[j]) {
// count++;
// }
// }
// }
// return count;
// }

// public static void main(String args[]) {
// int arr[] = { 1, 20, 6, 4, 5 };
// int n = arr.length;
// System.out.println(InversionCount(arr, n));
// }
// }