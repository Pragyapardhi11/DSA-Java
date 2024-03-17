import java.util.*;

public class calculatorUsingSwitchBreak {
    public static void main(String args[]) {
        System.out.println("________Welcome TO Pragya's Calculator_______");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("Addition-> " + (a + b));
                break;
            case 2:
                System.out.println("Substraction-> " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication-> " + (a * b));
                break;
            case 4:
                System.out.println("Division-> " + (a / b));
                break;
            case 5:
                System.out.println("remainder-> " + (a % b));
                break;
            default:
                System.out.println("Invalid input!!");

        }

    }

}
