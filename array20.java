//best time to buy and sell :-
public class array20 {
    public static void MaxProfit(int prices[]) {
        if (prices.length == 0) {
            System.out.println(0);
        }
        int profit = 0;
        int min = prices[0];
        int max = 0;
        for (int Stockprices : prices) {
            min = Math.min(min, Stockprices);
            profit = Stockprices - min;
            max = Math.max(max, profit);
        }
        System.out.println("so the maximum profit when u buy and sell the stock is " + max);
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            System.out.println(" day " + i + " stock prices are " + prices[i] + " ");
        }
        MaxProfit(prices);

    }
}
