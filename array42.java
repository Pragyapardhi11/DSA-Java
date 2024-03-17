// Median of two Sorted Arrays of Different Sizes
public class array42 {
    public static int getmedian(int a[], int b[], int N, int M) {
        int temp;
        for (int i = 0; i < N; i++) {
            if (a[i] > b[0]) {
                temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                int j = 0;
                while ((j + 1 <= M && b[j] > b[j + 1])) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                    j++;
                }
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 7, 9, 23, 54, 67 };
        int b[] = { 3, 6, 8, 11, 57, 76 };
    }
}
// ye incomplete question hai :-