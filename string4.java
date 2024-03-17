
// Check if given strings are rotations of each other or not
import java.util.*;

public class string4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("Not a rotation");
            System.exit(0);
        }
        String s3 = s1 + s1;
        if (s3.indexOf(s2) != -1) {
            System.out.println("Rotation is possible here");
        } else {
            System.out.println("ROtation is not possible");
        }

    }
}
