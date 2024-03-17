import java.util.*;

public class ex3 {
    public static void GreaterNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " greater than " + a);
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        GreaterNumber(a, b);

    }
}
