// Check if the given string is shuffled substring of another string

import java.util.*;

public class string5 {
    static boolean isSuffled(String s1, String s2, String res) {
        int n = s1.length();
        int m = s2.length();
        if (n + m != res.length())
            return false;

        s1 = sort(s1);
        s2 = sort(s2);
        res = sort(res);
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < res.length()) {
            if (i < n && s1.charAt(i) == res.charAt(k)) {
                i++;
            } else if (j < m && s2.charAt(j) == res.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return i >= n && j >= m;
    }

    static String sort(String ss) {
        char ca[] = ss.toCharArray();
        Arrays.sort(ca);
        return String.valueOf(ca);
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        String s1 = "SE";
        String s2 = "PQR";
        String res = "EPQRS";
        if (isSuffled(s1, s2, res)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
