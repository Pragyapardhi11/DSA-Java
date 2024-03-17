// Check if all elements of the array are palindrome or not
public class array40 {
    public static int findOperation(int arr[], int n) {
        int ans = 0;
        for (int i = 0, j = n - 1; i <= j;) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] > arr[j]) {
                i++;
                arr[i] = arr[i] + arr[i + 1];
                ans++;

            } else {
                j--;
                arr[j] = arr[j] + arr[j - 1];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 6, 3, 7, 1 };
        int n = arr.length;
        System.out.println("Minimum Operation " + findOperation(arr, n));
    }
}
