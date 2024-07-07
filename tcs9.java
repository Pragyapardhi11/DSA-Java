// Find the smallest and second smallest element in an array

import java.util.*;

public class tcs9 {

    public static void main(String args[]) {
        int arr[] = { 2, 4, 5, 1, 1, 2 };
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("the smallest no is :" + smallest);

        int second_smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < second_smallest && arr[i] > smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println("The Second smallest value is : " + second_smallest);
    }
}
