import java.util.*;

public class arrayEx5 {
    public static void ReverseArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }
    }

    public static void main(String args[]) {
        int arr[] = { 34, 56, 73, 22, 45, 123 };
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
