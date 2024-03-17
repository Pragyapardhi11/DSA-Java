
// Triplet Sum in Array (3sum)  // phie se karange kl aaj ka ho giya
import java.util.*;

public class array32 {
    List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> FInd3Sum(int arr[], int target) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i + 1] != arr[i]) {
                // target a+b+c =8
                // b+c = 8-a
                twoSumSorted(i + 1, arr.length, arr, 8 - arr[i]);
            }
        }
        System.out.println(res);
    }

    public static void twoSumSorted(int i, int j, int arr[], int target) {
        int a = arr[i - 1];
        while (i < j) {
            if (arr[i] + arr[j] > target) {
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(arr[i]);
                list.add(arr[j]);

                res.add(list);

                while (i < j && arr[i] == arr[i + 1])
                    i++;
                while (i < j && arr[j] == arr[j - 1])
                    j--;

                i++;
                j--;
            }

        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 6, 7, 2, 1, -5 };
        int n = arr.length;
        int target = 8;
        FInd3Sum(arr, target);
    }
}
