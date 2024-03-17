import java.util.*;

public class arrayEx6 {
    public static void findMinMax(int arr[]) {
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println("largerst number is " + max);
        System.out.println("Smallest number is " + min);

    }

    public static void main(String args[]) {
        int arr[] = { 2343, 54, 6, 3, 2, 4, 5 };
        findMinMax(arr);

    }
}
