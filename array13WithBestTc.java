public class array13WithBestTc {
    public static void main(String args[]) {
        int arr[] = { 2, -3, -4, 5, -6, 7, 2, -8 };
        int bestsum = 0;
        int currentsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentsum = currentsum + arr[i];
            if (arr[i] > currentsum) {
                currentsum = arr[i];
            }

            if (bestsum < currentsum) {
                bestsum = currentsum;
            }
        }
        System.out.println(bestsum);
    }
}
