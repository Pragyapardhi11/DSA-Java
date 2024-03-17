import java.util.*;

// Look-and-Say Sequence
public class string6 {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                res.append(count).append(s.charAt(i));
                count = 0;
            }
        }
        return res.toString();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = countAndSay(n);
        System.out.println(str);
    }
}
