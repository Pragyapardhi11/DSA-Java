// Program to find largest element in an Array

// public class tcs10 {
//     public static void main(String args[]) {
//         int arr[] = { 23, 4, 5, 32, 4, 3 };
//         int n = arr.length;

//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         System.out.println("the Largest Element is " + largest);

//     }
// }



// Find Second largest element in an array
public class tcs10 {
    public static void main(String args[]) {
        int arr[] = { 3, 4, 24, 543, 234, 54, 24663, 464 };
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        if (n < 2) {
            System.out.println("Invalis Input");
        }
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest) {
                second_largest = Math.max(second_largest, arr[i]);
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in array");
        } else {
            System.out.println("the second largest element is " + second_largest);
        }
    }
}
