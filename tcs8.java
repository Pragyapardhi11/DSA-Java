import java.util.*;

public class tcs8 {
    public static double FindMean(int arr[]) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count += 1;
        }

        return (double) sum / (double) count;
    }

    public static double FindMedian(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 != 0) {
            return (double) arr[n / 2];
        }

        return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 2, 6, 5, 8, 7 };
        System.out.println(FindMean(arr));
        System.out.println(FindMedian(arr));

    }
}
