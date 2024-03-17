//find duplicate presenr in string using sorting 
import java.util.*;

public class stringEx6 {
    public static void findduplicate(String str) {
        int len = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedstr = new String(chars);

        for (int i = 0; i < len; i++) {
            int count = 1;
            while (i < len - 1 && sortedstr.charAt(i) == sortedstr.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(sortedstr.charAt(i) + ",count " + count);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        findduplicate(str);
    }
}


