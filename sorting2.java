// Find a Fixed Point (Value equal to index) in a given array
public class sorting2 {
    public static int ValueEqualToIndex(int arr[], int n) {

        for (int j = 0; j < n; j++) {
            if (arr[j] == j) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 98, 5, 2, 65, 342 };
        int n = arr.length;
        System.out.println("Fixed Point is : " + ValueEqualToIndex(arr, n));

    }

}
