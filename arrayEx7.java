import java.util.*;

public class arrayEx7 {
    public static void main(String args[]) {
        int arr[] = { 23, 4, 5, 67, 65, 76, 86, 999, 7869 };
        int k = 3;
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("the sorted array is " + Arrays.toString(arr));
        // System.out.println("kth Smallest element is " + arr[k - 1]);
        System.out.println("kth Largest element is " + arr[n - k]);

    }
}
