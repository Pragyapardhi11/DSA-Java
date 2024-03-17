import java.util.*;

public class arrayEx8 {
    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 2, 0, 1, 0, 2, 1, 0, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1, 2, 0, 2, 0, 2, 2, 2 };
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero++;
            if (arr[i] == 1)
                one++;
            if (arr[i] == 2)
                two++;
        }

        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < zero + one; i++) {
            arr[i] = 1;
        }
        for (int i = one + zero; i < zero + one + two; i++) {
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
