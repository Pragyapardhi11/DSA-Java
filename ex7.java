import java.util.*;

public class ex7 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int positive = 0;
        int negative = 0;
        System.out.println("Eneter the number till the program wants: ");

        int data = sc.nextInt();

        while (data != 0) {
            System.out.println("Eneter the number till the program wants: ");

            data = sc.nextInt();
            if (data < 0) {
                negative++;
            } else if (data > 0) {
                positive++;
            }
            count++;
        }

        System.out.println(positive + " Positive number");
        System.out.println(negative + " negative numbers");
        System.out.println(count + " total numbers");

    }
}