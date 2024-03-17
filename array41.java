// Median of two sorted arrays of same size
public class array41 {
    public static int GetMedian(int a[], int b[], int M, int N) {
        int temp;
        for (int i = 0; i < M; i++) {
            if (a[i] > b[0]) {
                temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                int j = 0;
                while ((j + 1 < N) && (b[j] > b[j + 1])) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                    j++;
                }
            }
        }
        return ((a[M - 1] + b[0]) / 2);
    }

    public static void main(String args[]) {
        int a[] = { 1, 12, 15, 24, 35 };
        int b[] = { 2, 13, 17, 25, 38 };
        System.out.println(GetMedian(a, b, a.length, b.length));

    }
}
