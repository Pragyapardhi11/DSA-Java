// // Find the Minimum element in a Sorted and Rotated Array using Linear search 
// public class sorting21 {
//     public static int FindMin(int arr[], int n) {
//         int min_ele = arr[0];
//         for (int i = 0; i < n; i++) {
//             if (arr[i] < min_ele) {
//                 min_ele = arr[i];
//             }
//         }
//         return min_ele;
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 6, 1, 2, 3, 4 };
//         int n = arr.length;
//         System.out.println("minimum element is : " + FindMin(arr, n));
//     }
// }

// Find the Minimum element in a Sorted and Rotated Array using Binary search

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sorting21 {
    public static int FindMin(List<Integer> arr, int low, int high) {
        if (arr.get(low) < arr.get(high)) {
            return arr.get(low);
        }

        int ans = 10000000;
        while (low <= high) {
            int mid = low + high / 2;
            if (arr.get(mid) == arr.get(low) && arr.get(mid) == arr.get(high)) {
                ans = Math.min(ans, arr.get(low));
                low++;
                high--;
            } else if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr.get(mid));
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 6, 1, 2, 3, 4));

        int N = arr.size();
        System.out.println("THe minimum element is :" + FindMin(arr, 0, N - 1));
    }
}