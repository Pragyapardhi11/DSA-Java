// Majority Element

import java.util.HashMap;

public class sorting7 {
    public static void findMajority(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > n / 2) {
                System.out.println("Majority Element is " + arr[i]);
                return;
            }
        }
        System.out.println("No Majority Element !!");

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 4, 4, 4, 4, 5, 4, 4, 8 };
        int n = arr.length;
        findMajority(arr, n);

    }
}
