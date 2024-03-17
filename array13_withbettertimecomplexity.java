import java.util.*;

public class array13_withbettertimecomplexity {
    public static void main(String args[]) {
        int arr[] = { 2, 3, -5, -7, 4, -1, 7, 8, -9 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
