public class kadaneAlgo {
    public static void main(String args[]) {
        int nums[] = { 2, -3, -4, 5, -6, 7, 2, -8 };
        int bestsum = 0;
        int currentsum = 0;

        // worst- case- approach
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i; j < nums.length; j++) {
        // int sum = 0;
        // for (int k = i; k < j; k++) {
        // sum = sum + nums[k];
        // if (sum > max) {
        // max = sum;
        // }
        // }
        //
        // System.out.println(max);

        // }
        // }
        //

        // medium optimal approach

        // for (int i = 0; i < nums.length; i++) {
        // int sum = 0;
        // for (int j = i; j < nums.length; j++) {
        // sum = sum + nums[j];
        // if (sum > max) {
        // max = sum;
        // }
        // }

        // }
        // System.out.println(max);

        // most optimal approach

        for (int i = 0; i < nums.length; i++) {
            currentsum = currentsum + nums[i];
            if (nums[i] > currentsum) {
                currentsum = nums[i];
            }

            if (currentsum > bestsum) {
                bestsum = currentsum;
            }
        }
        System.out.println(bestsum);
    }
}
