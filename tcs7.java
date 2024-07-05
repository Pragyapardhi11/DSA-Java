// Counting Rock Samples | TCS Codevita 2020
public class tcs7 {
    public static void CountingRock(int arr[], int range1[], int range2[]) {
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > range1[0] && arr[i] < range1[1]) {
                count1++;

            } else if (arr[i] > range2[0] && arr[i] < range2[1]) {
                count2++;

            }
            i++;

        }
        System.out.println(count1 + " " + count2);
    }

    public static void main(String args[]) {
        int arr[] = { 345, 604, 321, 433, 704, 470, 808, 718, 517, 811 };
        int range1[] = { 300, 380 };
        int range2[] = {400,700};
        CountingRock(arr, range1, range2);

    }
}
