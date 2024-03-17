
// Find next greater number with same set of digits
import java.util.*;
import java.util.ArrayList;

public class string13 {
    public static void GreaterNumber(char arr[], int n) {
        // static ArrayList<String> al = new ArrayList<>();
        int i, j;
        for (i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                break;
            }
        }

        if (n == 0) {
            System.out.println("No morre greater number!!");
        } else {
            int x = arr[i - 1];
            int Smallest = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > x && arr[j] < arr[Smallest]) {
                    Smallest = j;
                }
            }
            swap(arr, i - 1, Smallest);
            Arrays.sort(arr, i, n);
            System.out.println(arr);
        }
    }

    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void main(String args[]) {
        char arr[] = { '2', '1', '8', '7', '6', '5' };
        int n = arr.length;
        GreaterNumber(arr, n);
    }
}
