// Find the missing and repeating number

import java.util.Arrays;
import java.util.HashMap;

public class sorting6 {

    public static int[] res(int arr[], int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        int rep = 0;
        int mis = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], true);
            } else {
                rep = arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if (map.get(i) == null) {
                mis = i;
            }
        }
        return new int[] { rep, mis };

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 4, 5 };
        int n = arr.length;
        System.out.println(Arrays.toString(res(arr, n)));
    }
}
