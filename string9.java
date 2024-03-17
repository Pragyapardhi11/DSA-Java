// Print all subsequences of a string

import java.util.ArrayList;

public class string9 {

    static ArrayList<String> al = new ArrayList<>();

    public static void main(String args[]) {
        String str = "abcd";
        PrintAllSubsequence(str, " ");
        System.out.println(al);
    }

    public static void PrintAllSubsequence(String str, String ans) {
        if (str.length() == 0) {
            al.add(ans);
            return;
        }
        PrintAllSubsequence(str.substring(1), ans + str.charAt(0));
        PrintAllSubsequence(str.substring(1), ans);
    }
}