// // Count pairs with given sum  : but its time complexity is O(n^2) to niche optimized code bhi likhte hai 
// public class array21 {
//     public static void CountPair(int arr[]) {
//         if (arr.length == 0) {
//             System.out.println(0);
//         }
//         int count = 0;
//         int k = 6;

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == k) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println("the number of required pairs are " + count);
//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, 5, 7, -1 };
//         int n = arr.length;
//         CountPair(arr);

//     }
// }

//optimal approach using hashmap
import java.util.HashMap;

class array21 {
    static int arr[] = new int[] { 1, 5, 7, -1 };

    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static int getPairsCount(int n, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {

            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;
    }

    // Driver method to test the above function
    public static void main(String[] args) {

        int sum = 6;
        System.out.println("Count of pairs is " + getPairsCount(arr.length, sum));
    }
}