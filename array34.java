
// Triplet Sum in Array (3sum)---------isko phir se karna padega ab to dimak kharab ho giya ab 
import java.util.*;

public class array34 {
    public static boolean find3sum(int arr[], int n, int sum) {
        int l, r;
        Arrays.sort(arr, 0, n - 1);
        for (int i = 0; i < n - 2; i++) {
            l = i + 1;
            r = n - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == sum) {
                    System.out.println(arr[i] + " " + arr[l] + " " + arr[r] + " ");
                    return true;
                } else if (arr[i] + arr[l] + arr[r] < sum) {
                    l++;
                } else {
                    r--;
                }
            }

        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 72, 2, 1 };
        int n = arr.length;
        int sum = 9;
        System.out.println(find3sum(arr, n, sum));
    }
}
