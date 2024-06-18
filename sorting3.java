// Search in a rotated sorted array	
public class sorting3 {
    public static int SearchRotatedSortedArray(int arr[], int x, int n) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 34, 42, 645, 6745, 657, 878, 210 };
        int x = 234;
        int n = arr.length;
        int idx = SearchRotatedSortedArray(arr, x, n);
        if (idx != -1) {
            System.out.println("Found at index " + SearchRotatedSortedArray(arr, x, n));
        } else {
            System.out.println("NOt Found");

        }

    }
}
