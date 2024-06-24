// Sort array according to count of set bits //skip it 

// Minimum number of swaps required to sort an array

import java.util.Arrays;
import java.util.HashMap;

public class sorting15 {
    public static int MinSwap(int arr[], int n) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Creating a map to store the index of elements in the sorted array
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(sortedArr[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        // Traverse through all array elements
        for (int i = 0; i < n; i++) {
            // If element is already visited or in the correct position, skip it
            if (visited[i] || arr[i] == sortedArr[i]) {
                continue;
            }

            // Initialize the cycle length
            int cycleLength = 0;
            int j = i;

            // Visit all nodes in this cycle
            while (!visited[j]) {
                visited[j] = true;

                // Move to the next node
                j = indexMap.get(arr[j]);
                cycleLength++;
            }

            // If cycle length is more than 1, add cycleLength-1 to swaps
            if (cycleLength > 1) {
                swaps += (cycleLength - 1);
            }
        }

        return swaps;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 4, 3, 2 };
        int n = arr.length;
        System.out.println("Minimum num of swap will be :" + MinSwap(arr, n));

    }
}
