import java.util.*;

public class arrsyEx2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];
        // input
        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
