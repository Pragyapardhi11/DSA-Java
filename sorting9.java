// Find a pair with the given difference
public class sorting9 {
    public static void findPair(int arr[], int n, int diff) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[j] - arr[i] == diff) {
                    System.out.println(arr[i] + "," + arr[j]);
                    return;
                }

            }
        }
        System.out.println("Not Found !!");

    }

    public static void main(String args[]) {
        int arr[] = { 1, 8, 30, 40, 100 };
        int n = arr.length;
        int diff = -60;
        findPair(arr, n, diff);
    }
}
