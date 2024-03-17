import java.util.*;

public class stringEx2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                res = res + 'i';
            } else {
                res = res + str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
