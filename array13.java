import java.util.*;

public class array13 {
    public static void main(String args[]) {
        int arr[] = { 2, 3, -5, -7, 4, -1, 7, 8, -9 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum = sum + arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
