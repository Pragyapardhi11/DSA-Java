// A product array puzzle | Set 2 (O(1) Space) //easy one
public class sorting14 {
    public static void puzzle(int arr[], int n) {
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod = prod * arr[i];
        }

        // as we know x/y mathematically same as x*(y to the power -1)
        for (int i = 0; i < n; i++) {
            // System.out.print((int) prod * Math.pow(arr[i], -1) + " ");
            System.out.print(prod / arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        puzzle(arr, n);
    }
}
