
// Triplet Sum in Array (3sum)---------isko phir se karna padega ab to dimak kharab ho giya ab 
import java.util.HashMap;

public class array33 {
    public static boolean find3sum(int arr[], int n, int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            int remsum = x - arr[i];
            boolean ans = find2sum(remsum, i + 1, arr.length, arr);
            if (ans)
                return (true);
        }
        return (false);

    }

    public static boolean find2sum(int remsum, int start, int end, int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = start; i <= end; i++) {
            int r = remsum - arr[i];
            if (map.containsKey(r) && map.get(r) != i)
                return (true);
        }
        return (false);
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 2, 3 };
        int n = arr.length;
        int x = 13;
        System.out.println(find3sum(arr, n, x));
    }
}
