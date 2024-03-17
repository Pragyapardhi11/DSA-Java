import java.util.*;

public class ex9 {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    public static void PrintFibonacci(int n) {

        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.println(" " + n3);
            PrintFibonacci(n - 1);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintFibonacci(n);

    }
}
