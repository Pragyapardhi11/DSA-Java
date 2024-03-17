import java.util.*;

public class stringEx5 {
    public static boolean findpalindrome(String str) {

        int n = str.length() - 1;

        for (int i = 0; i < n; i++, n--) {
            if (str.charAt(i) != str.charAt(n)) {
                // System.out.println("it is not palindrome");
                return false;
            }
            // System.out.println("it is palindrome");
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (findpalindrome(str)) {
            System.out.println("it is palindrone");
        } else {
            System.out.println("it is not palidrone");
        }

    }
}

// ye revision tha code ka
// import java.util.*;
// public class stringEx5 {
// public static boolean findpalindrome(String str) {
// int i = 0;
// int j = str.length() - 1;
// while (i < j) {
// if (str.charAt(i) != str.charAt(j)) {
// return false;
// }
// i++;
// j--;
// }
// return true;
// }
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// String str = sc.next();
// if (findpalindrome(str)) {
// System.out.println("it is palindrome");
// } else {
// System.out.println("it is not palindrome");
// }
// }
// }