import java.util.*;

public class whileLB {
    public static void findSum(int n) {
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println(sum);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        findSum(n);

    }
}
