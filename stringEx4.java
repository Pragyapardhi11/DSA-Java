import java.util.*;

public class stringEx4 {
    public static void main(String args[]) {
        String name = "pragya";
        String oppname = "";
        char ch;

        for (int i = 0; i < name.length(); i++) {
            // int front = i;
            // int back = name.length() - 1 - i;
            ch = name.charAt(i);
            oppname = ch + oppname;

        }
        System.out.println(oppname);
    }
}
