import java.util.*;

public class arrayEx9 {
    public static void main(String args[]) {
        int arr[] = { -2, -5, 6, 7, 8 - 9, -34, -6, -2, -1, 3, -65 };
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] < 0)
                left++;
            while (arr[right] > 0)
                right--;

            if (left >= right)
                break;

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
