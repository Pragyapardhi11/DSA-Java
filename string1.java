// Reverse String using a Loop:
// 
// public class string1 {
//     public static String reversedString(String inputStr) {
//         StringBuilder reverseStr = new StringBuilder();
//         for (int i = inputStr.length() - 1; i >= 0; i--) {
//             reverseStr.append(inputStr.charAt(i));
//         }
//         return reverseStr.toString();
//     }

//     public static void main(String args[]) {
//         String originalStr = "GeeksForGeeks";
//         System.out.println(reversedString(originalStr));
//     }
// }

//second trick with space==O(1):-
// Reverse String using inbuilt method
import java.util.*;

public class string1 {
    public static void main(String args[]) {
        String Str = "GeeksForGeeks";
        StringBuffer sb = new StringBuffer(Str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
