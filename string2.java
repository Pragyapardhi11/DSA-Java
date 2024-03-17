// Program to Check for Palindrome String
public class string2 {
    public static void main(String args[]) {
        String Str = "abcduyyouiuidcba";
        int i = 0;
        int j = Str.length() - 1;
        while (i < j) {
            if (Str.charAt(i) != Str.charAt(j)) {
                System.out.println("Not palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Given String is Palindrome");

    }
}
