// Searching in an array where adjacent differ by at most k
public class sorting8 {
    public static int Searching(int arr[], int n, int x, int k) {
        int i = 0;
        while (i < n) {
            if (arr[i] == x) {
                return i;
            } else {
                i = i + Math.max(1, Math.abs(arr[i] - x) / k);
            }
        }
        System.out.println("Not Found !!");
        return -1;

    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 6 };
        int n = arr.length;
        int k = 1;
        int x = 6;
        System.out.println("Element " + x + " is found in " + Searching(arr, n, x, k));

    }
}
