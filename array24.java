// Subarray with 0 sum

import java.util.HashSet;

public class array24 {
    public static boolean SubarrayExist(int arr[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 2, -3, 1, 6 };
        // int n = arr.length;
        if (SubarrayExist(arr)) {
            System.out.println("found subarray with sum 0");
        } else {
            System.out.println("No Subarray is found which has sum 0");
        }
    }
}
