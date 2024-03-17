import java.util.Arrays;

public class array17 {
    public static void FixArray2(int arr2[]) {
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < arr2[i - 1]) {
                int temp = arr2[i - 1];
                arr2[i - 1] = arr2[i];
                arr2[i] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 3, 4 };
        int arr2[] = { 0, 2, 6, 7, 9 };
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        while (i < n) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                FixArray2(arr2);
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}

// // import java.util.*;

// // public class array17 {
// // public static void Merge(int arr1[], int arr2[], int n, int m, int arr3[])
// {
// // int i = 0;
// // int j = 0;
// // int k = 0;
// // while (i < n && j < m) {
// // if (arr1[i] < arr2[j]) {
// // arr3[k] = arr2[i];
// // k++;
// // i++;
// // } else {
// // arr3[k] = arr1[j];
// // k++;
// // j++;
// // }
// // }

// // while (i < n) {
// // arr3[k] = arr1[i];
// // k++;
// // i++;
// // }
// // while (j < m) {
// // arr3[k] = arr2[j];
// // k++;
// // j++;
// // }
// // }

// // public static void main(String args[]) {
// // int arr1[] = { 4, 6, 8, 2 };
// // int n = arr1.length;
// // int arr2[] = { 1, 0, 9, 3 };
// // int m = arr2.length;
// // int arr3[] = new int[n + m];
// // Merge(arr1, arr2, n, m, arr3);

// // System.out.println("After Mergeing :");
// // for (int i = 0; i < n + m; i++) {
// // System.out.print(arr3[i] + " ");
// // }
// // }
// // }

// // Java program to merge two sorted arrays
// import java.util.*;
// // import java.lang.*;
// // import java.io.*;

// class MergeTwoSorted {
// // Merge arr1[0..n1-1] and arr2[0..n2-1]
// // into arr3[0..n1+n2-1]
// public static void mergeArrays(int[] arr1, int[] arr2, int n1,
// int n2, int[] arr3) {
// int i = 0, j = 0, k = 0;

// // Traverse both array
// while (i < n1 && j < n2) {
// // Check if current element of first
// // array is smaller than current element
// // of second array. If yes, store first
// // array element and increment first array
// // index. Otherwise do same with second array
// if (arr1[i] < arr2[j])
// arr3[k++] = arr1[i++];
// else
// arr3[k++] = arr2[j++];
// }

// // Store remaining elements of first array
// while (i < n1)
// arr3[k++] = arr1[i++];

// // Store remaining elements of second array
// while (j < n2)
// arr3[k++] = arr2[j++];
// }

// public static void main(String[] args) {
// int[] arr1 = { 1, 3, 5, 7 };
// int n1 = arr1.length;

// int[] arr2 = { 2, 4, 6, 8 };
// int n2 = arr2.length;

// int[] arr3 = new int[n1 + n2];

// mergeArrays(arr1, arr2, n1, n2, arr3);

// System.out.println("Array after merging");
// for (int i = 0; i < n1 + n2; i++)
// System.out.print(arr3[i] + " ");
// }
// }

// /* This code is contributed by Mr. Somesh Awasthi */
