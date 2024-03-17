import java.util.*;

public class stringEx8 {
    static void isSuffeledSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        if (n > m) {
            System.out.println("str1 can never be a sub string of str2!");
            System.exit(0);
        } else {
            str1 = sort(str1);

            for (int i = 0; i < m; i++) {

                if (i + n - 1 >= m) {
                    System.out.println("not possible");
                    System.exit(0);
                }

                String str = "";
                for (int j = 0; j < n; j++) {
                    str = str + str2.charAt(i + j);
                }
                str = sort(str);

                if (str.equals(str1)) {
                    System.out.println("str1 is a sub string of str2:");
                }
            }
        }

    }

    public static String sort(String inputString) {
        char[] chars = inputString.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        isSuffeledSubstring(str1, str2);

    }
}
