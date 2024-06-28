// Find the missing number in Arithmetic Progression
public class sorting20 {
    public static int FindMissingAP(int arr[], int n) {
        int a, l, s, i, missingAP, sum = 0;
        a = arr[0];
        l = arr[n - 1];
        if ((a + l) % 2 == 0) {
            s = (a + l) / 2;
            s = s * (n + 1);
        } else {
            s = (n + 1) / 2;
            s = s * (a + l);
        }

        for (i = 0; i <= n - 1; i++) {
            sum = sum + arr[i];
        }

        missingAP = s - sum;
        return missingAP;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 10, 12 };
        int n = arr.length;
        System.out.println("The Missing value is : " + FindMissingAP(arr, n));
    }
}
