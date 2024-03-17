import java.util.*;

public class arrayEx5_With_Recursion {
    public static void ReverseArray(int arr[], int start, int end) {
        if (start > end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        ReverseArray(arr, start + 1, end - 1);
    }

    public static void main(String args[]) {

        int arr[] = { 23, 43, 1, 2, 45, 234, 242 };
        int n = arr.length;
        ReverseArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
