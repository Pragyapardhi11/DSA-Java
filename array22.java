import java.util.*;

public class array22 {
    public static void findCommon(int a[], int b[], int c[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
                k++;
            } else if (a[i] < b[j])
                i++;
            else if (b[j] < c[k])
                j++;
            else
                k++;

        }
    }

    public static void main(String args[]) {
        int a[] = { 4, 6, 8, 23, 90, 345 };
        int b[] = { 6, 23, 56, 89, 90 };
        int c[] = { 6, 23, 53, 64, 90 };
        System.out.print("Common Element are ");
        findCommon(a, b, c);

    }
}