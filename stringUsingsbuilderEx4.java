
//reverse a string using string builder :-
import java.util.*;

public class stringUsingsbuilderEx4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Pragya");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);
    }
}
