//str1 is the rotate of str2 or str1 is a substring of str2 
import java.util.*;
public class stringEx7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if (str1.length() != str2.length()) {
            System.out.println("they are not rotate of each other!!");
            System.exit(0);
        }
        String str3 = str1 + str1;
        if (str3.indexOf(str2) != -1) {
            System.out.println("s2 is the rotate of s1");
        } else {
            System.out.println("s2 is not the rotation of s1");
        }
    }
}
