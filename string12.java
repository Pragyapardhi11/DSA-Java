//word wrap problem baki hai

//Edit Distance(VVIP):-

import java.util.Arrays;

public class string12 {

    static int editdistance(String str1, String str2, int n, int m) {
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return editdistance(str1, str2, n - 1, m - 1);
        }
        // insert , del , update respectively

        return 1 + Math.min(Math.min(editdistance(str1, str2, n - 1, m),
                editdistance(str1, str2, n, m - 1)),
                editdistance(str1, str2, n - 1, m - 1));

    }

    public static void main(String args[]) {
        String str1 = "Sunday";
        String str2 = "Saturday";
        System.out.println(editdistance(str1, str2, str1.length(), str2.length()));

    }
}