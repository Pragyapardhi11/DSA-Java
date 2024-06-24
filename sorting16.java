// Bishu and Soldiers

// Kth smallest number again
// Java implementation to solve k queries
// for given n ranges
import java.util.*;

public class sorting16 {

    // Structure to store the
    // start and end point
    static class Interval {
        int s;
        int e;

        Interval(int a, int b) {
            s = a;
            e = b;
        }
    };

    static class Sortby implements Comparator<Interval> {
        // Comparison function for sorting
        public int compare(Interval a, Interval b) {
            return a.s - b.s;
        }
    }

    // Function to find Kth smallest number in a Vector
    // of merged intervals
    static int kthSmallestNum(Vector<Interval> merged, int k) {
        int n = merged.size();

        // Traverse merged.get( )o find
        // Kth smallest element using Linear search.
        for (int j = 0; j < n; j++) {
            if (k <= Math.abs(merged.get(j).e -
                    merged.get(j).s + 1))
                return (merged.get(j).s + k - 1);

            k = k - Math.abs(merged.get(j).e -
                    merged.get(j).s + 1);
        }

        if (k != 0)
            return -1;
        return 0;
    }

    // To combined both type of ranges,
    // overlapping as well as non-overlapping.
    static Vector<Interval> mergeIntervals(Vector<Interval> merged,
            Interval arr[], int n) {
        // Sorting intervals according to start
        // time
        Arrays.sort(arr, new Sortby());

        // Merging all intervals into merged
        merged.add(arr[0]);
        for (int i = 1; i < n; i++) {
            // To check if starting point of next
            // range is lying between the previous
            // range and ending point of next range
            // is greater than the Ending point
            // of previous range then update ending
            // point of previous range by ending
            // point of next range.
            Interval prev = merged.get(merged.size() - 1);
            Interval curr = arr[i];
            if ((curr.s >= prev.s &&
                    curr.s <= prev.e) &&
                    (curr.e > prev.e))

                merged.get(merged.size() - 1).e = curr.e;

            else {
                // If starting point of next range
                // is greater than the ending point
                // of previous range then store next range
                // in merged.get(.) if (curr.s > prev.e)
                merged.add(curr);
            }
        }
        return merged;
    }

    // Driver code
    public static void main(String args[]) {
        Interval arr[] = { new Interval(2, 6), new Interval(4, 7) };
        int n = arr.length;
        int query[] = { 5, 8 };
        int q = query.length;

        // Merge all intervals into merged.get())
        Vector<Interval> merged = new Vector<Interval>();
        merged = mergeIntervals(merged, arr, n);

        // Processing all queries on merged
        // intervals
        for (int i = 0; i < q; i++)
            System.out.println(kthSmallestNum(merged, query[i]));
    }
}

// This code is contributed by Arnab Kundu
