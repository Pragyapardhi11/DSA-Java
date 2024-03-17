import java.util.*;

public class arrayEx3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }

        System.out.println("Largest number is " + max);
        System.out.println("Smallest number is " + min);

    }
}
