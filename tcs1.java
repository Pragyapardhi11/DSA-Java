// Find first non-repeating element in a given Array of integers
import java.util.HashMap;

public class tcs1 {
    public static int findrepeated(int arr[], int n) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            } else {
                hs.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (hs.get(arr[i]) == 1) {
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { -1, 2, -1, 3, 0 };
        int n = arr.length;
        System.out.println(findrepeated(arr, n));

    }
}

