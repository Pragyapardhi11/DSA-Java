import java.util.*;

public class ifelseLB {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch > 96 && ch < 123) {
            System.out.println(" ch is in lowwer case");
        } else if (ch > 64 && ch < 91) {
            System.out.println("ch is in upper case");
        } else if (ch > 47 && ch < 58) {
            System.out.println("it is num");
        }

        else {
            System.out.println("it is zero");
        }

    }
}
