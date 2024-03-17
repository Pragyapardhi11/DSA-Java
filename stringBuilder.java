import java.util.*;

public class stringBuilder {
    public static void main(String args[]) {
        // declaration of string-builder
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // get a character st index
        System.out.println(sb.charAt(0));

        // set a char at index
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        // insert a char at index
        sb.insert(0, 'P');
        System.out.println(sb);

        // delet a char at index
        sb.delete(1, 2);
        System.out.println(sb);

        // append karna
        StringBuilder str = new StringBuilder("h");
        str.append('e');
        str.append('l');
        str.append('l');
        str.append('o');
        System.out.println(str);
        System.out.println(str.length());
    }
}
