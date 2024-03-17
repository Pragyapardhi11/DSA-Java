import java.util.*;

public class ex4 {
    public static void findRadius(int r) {
        double circumferenceOfCircle = 2 * 3.14 * r;
        System.out.println(circumferenceOfCircle);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        findRadius(r);
    }
}
