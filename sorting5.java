
// Maximum and minimum of an array using minimum number of comparisons
// import java.util.Arrays;
import java.util.*;

public class sorting5 {

    public static class Pair {
        public int min;
        public int max;
    }

    public static Pair findMinMax(int arr[], int n) {

        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[n - 1];
        return minmax;

    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 5424, 6, 7345, 3458, 9 };
        int n = arr.length;
        Pair minmax = findMinMax(arr, n);
        System.out.println("Minimum : " + minmax.min);
        System.out.println("Maximum : " + minmax.max);

    }
}
