// import java.util.*;

// public class array18 {
//     public static void main(String args[]) {
//         int prices[] = { 7, 1, 5, 3, 6, 4 };
//         // Scanner sc = new Scanner(System.in);
//         // int size = sc.nextInt();
//         // int prices[] = new int[size];
//         int profit = 0;
//         int min = prices[0];
//         int max = 0;
//         for (int Stockprices : prices) {
//             min = Math.min(min, Stockprices);
//             profit = Stockprices - min;
//             max = Math.max(profit, max);
//         }
//         System.out.println(max);
//     }
// }
import java.util.*;

public class array18 {
    public static void main(String args[]) {
        int prices[] = { 7, 1, 4, 5, 3 };
        int n = prices.length;

        int current = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < current) {
                current = prices[i];
            } else if (prices[i] - current > profit) {
                profit = prices[i] - current;
            }
            System.out.println("day" + i + "price of stock is " + prices[i] + " ");
        }
        System.out.println("so max profit to buy and sell stock is " + profit);
    }
}