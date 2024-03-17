import java.util.*;

public class ex5 {
    public static void CheckEligiblity(int age) {
        if (age > 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you are not eligible");
        }
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        CheckEligiblity(age);

    }
}
