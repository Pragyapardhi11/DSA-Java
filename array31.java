// // 2 Sum in Array brute force approach:-
// public class array31 {
//     public static void Find2Sum(int arr[], int target) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length - 1; j++) {
//                 if (target == arr[i] + arr[j]) {
//                     System.out.println(arr[i] + "," + arr[j]);
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = { 3, 4, 5, 6, 8 };
//         int n = arr.length;
//         int target = 11;
//         Find2Sum(arr, target);
//     }
// }

import java.util.*;

public class array31 {
    public static void Find2Sum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int rem = target - num;
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                if (index == i)
                    continue;
                System.out.println(i + "," + index);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 6, 7 };
        int n = arr.length;
        int target = 12;
        Find2Sum(arr, target);

    }

}