// Find whether an array is subset of another array
// Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
// Output: arr2[] is a subset of arr1[]
public class tcs5 {
    public static boolean subset(int arr1[], int arr2[], int n, int m) {
        int i = 0;
        int j = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (arr2[i] == arr1[j]) {
                    break;
                }

            }
            if (j == m) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 78, 1 };
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(subset(arr1, arr2, n, m));

    }
}
