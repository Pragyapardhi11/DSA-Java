import java.util.*;

public class calculator {
    public static void main(String[] args) {
        System.out.println("___________Welcome To My Calculator__________");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (x == 1) {
            System.out.println("____We are performing addition____");
            int sum = a + b;
            System.out.println("answer is -> " + sum);
        } else if (x == 2) {
            System.out.println("____We are performing Substraction____");
            int Sub = a - b;
            System.out.println("answer is -> " + Sub);
        } else if (x == 3) {
            System.out.println("____We are performing Multiplication____");
            int Mul = a * b;
            System.out.println("answer is -> " + Mul);
        } else if (x == 4) {
            System.out.println("____We are performing Division____");
            int div = a / b;
            System.out.println("answer is ->" + div);
        } else if (x == 5) {
            System.out.println("____We are performing module____");
            int rem = a % b;
            System.out.println("answer is ->" + rem);
        }

    }

}
