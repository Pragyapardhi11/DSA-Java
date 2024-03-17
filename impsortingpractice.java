import java.util.*;

public class impsortingpractice {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 23, 4, 5, 67, 82, 56 };
        // bubble sort
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // // swap
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // printArray(arr);

        // Selection Sort
        // for (int i = 0; i < arr.length - 1; i++) {
        // int smallest = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[smallest] > arr[j]) {
        // // swap
        // int temp = arr[smallest];
        // arr[smallest] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        // printArray(arr);

        // Insertion Sort
        // for (int i = 1; i < arr.length; i++) {
        // int current = arr[i];
        // int j = i - 1;
        // while (j >= 0 && current < arr[j]) {
        // arr[j + 1] = arr[j];
        // j--;
        // }
        // // placement
        // arr[j + 1] = current;
        // }
        // printArray(arr);

    }
}
