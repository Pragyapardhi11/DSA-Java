import java.util.*;

public class ArrayEx1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        // for (int i = 0; i < size; i++) {
        // System.out.print(num[i] + " ");
        // }
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (num[i] == x) {
                System.out.println("Its index is " + i);
            }
        }
    }
}
