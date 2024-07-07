// Counting frequencies of array elements

import java.util.HashMap;
import java.util.Map;

public class tcs11 {
    public static void main(String args[]) {
        int arr[] = { 3, 4, 5, 2, 3, 4, 2, 3, 4 };
        int n = arr.length;
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (HM.containsKey(arr[i])) {
                HM.put(arr[i], HM.get(arr[i]) + 1);
            } else {
                HM.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : HM.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times");
        }

    }
}
