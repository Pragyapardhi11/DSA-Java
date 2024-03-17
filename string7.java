// Longest Palindromic Substring using Dynamic Programming

import java.util.*;

public class string7 {
    public static void LongestSubString(String str) {
        int start = 0;
        int end = 1;
        for (int i = 1; i < str.length(); i++) {
            // even
            int l = i - 1;
            int h = i;
            while ((l >= 0 && h < str.length()) && (str.charAt(l) == str.charAt(h))) {
                if (h - l + 1 > end) {
                    start = l;
                    end = h - l + 1;
                }
                l--;
                h++;
            }
            // odd
            l = i - 1;
            h = i + 1;
            while ((l >= 0 && h < str.length()) && (str.charAt(l) == str.charAt(h))) {
                if (h - l + 1 > end) {
                    start = l;
                    end = h - l + 1;
                }
                l--;
                h++;
            }
        }
        System.out.println(str.substring(start, start + end));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        LongestSubString(str);
    }
}
