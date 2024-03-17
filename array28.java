
// Given Array of size n and a number k, find all elements that appear more than n/k times :===tc=>O(n)
// leetcode me 229 ques karna h 
import java.util.*;
// import java.util.Map;

public class array28 {
    public static void MoreThanNK(int a[], int n, int k) {
        int x = n / k;
        HashMap<Integer, Integer> y = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // is element doesn't exist in hash table
            if (!y.containsKey(a[i]))
                y.put(a[i], 1);

            // if element does exist in the hash table
            else {
                int count = y.get(a[i]);
                y.put(a[i], count + 1);
            }
        }

        for (Map.Entry m : y.entrySet()) {
            Integer temp = (Integer) m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 1, 1, 1, 1, 5, 5, 5, 5, 5, 5, 5, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 8 };
        int n = 22;
        int k = 4;
        MoreThanNK(a, n, k);
        // for (int i = 0; i < n; i++) {
        // System.out.println(a[i]);
        // }
    }
}
