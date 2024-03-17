// Minimum swaps required to bring all elements less than or equal to k together
public class array39 {
   public static int MinSwap(int arr[], int n, int k) {
      int good = 0;
      int bad = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i] <= k) {
            good++;
         }
      }
      for (int i = 0; i < good; i++) {
         if (arr[i] > k) {
            bad++;
         }
      }
      int i = 0;
      int j = good;
      int ans = bad;
      while (j < n) {
         if (arr[i] > k) {
            bad--;
         }
         if (arr[j] > k) {
            bad++;
         }
         ans = Math.min(ans, bad);
         i++;
         j++;
      }
      return ans;
   }

   public static void main(String args[]) {
      int arr[] = { 1, 2, 5, 3, 7 };
      int n = arr.length;
      int k = 3;
      System.out.println(MinSwap(arr, n, k));
   }
}
