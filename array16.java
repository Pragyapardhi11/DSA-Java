// import java.util.Arrays;

// public class array16 {
//     public static void main(String args[]) {
//         int arr[] = { 1, 3, 1, 3, 1, 2 };
//         for (int i = 0; i < arr.length; i++) {
//             int index = Math.abs(arr[i]);
//             if (arr[index] < 0)
//                 return;
//             arr[index] = -arr[index];

//         }
//         // return -1;
//     }
// }
// // isme garbar hai smj nhi aa rha h ki output kaishe likale

import java.util.*;

public class array16 {
    public static void PrintDuplicate(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 5, 2, 1, 2, 3 };
        // int n = arr.length;
        PrintDuplicate(arr);
    }
}