import java.util.*;

public class whileLBEx2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int i = 2;.=
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("it is not prime for " + i);
            } else {
                System.out.println("it is prime for " + i);
            }

        }
    }
}
