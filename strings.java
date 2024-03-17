import java.util.*;

public class strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name1 = "tony";
        String name2 = "Stark";
        // concatenate karna
        String fullname = name1 + " " + name2;
        System.out.println(fullname);
        // user se string input lena
        String My_name = sc.nextLine();
        System.out.println("My name is : " + My_name);
        // length
        System.out.println(My_name.length());
        // sab char ko print karna
        for (int i = 0; i < My_name.length(); i++) {
            System.out.println(My_name.charAt(i));
        }

        // compare
        if (name1.compareTo(name2) == 0) {
            System.out.println("string are equal");
        } else {
            System.out.println("string are not equal");
        }

        // substring
        System.out.println(My_name.substring(5, My_name.length()));

        // parseInt
        String str = "1332";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
