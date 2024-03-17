
//find duplicate presenr in string
import java.util.*;

public class String3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sl = sc.next();
        int count[] = new int[256];
        for (int i = 0; i < sl.length(); i++) {
            count[sl.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) (i) + " count = " + count[i]);
            }
        }

    }
}
