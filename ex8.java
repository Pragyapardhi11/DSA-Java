import java.util.*;

public class ex8 {
    public static int powerGame(int x, int n) {
        int power = 1;
        for (int i = 0; i < n; i++) {
            power = power * x;
        }
        // System.out.println(power);
        return power;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerGame(x, n));
    }
}
