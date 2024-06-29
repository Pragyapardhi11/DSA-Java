// // K-th Element of Two Sorted Arrays - 1st 
// public class sorting22 {
//     public static int KthElement(int arr1[], int arr2[], int n, int m, int k) {
//         int sorted[] = new int[n + m];
//         int i = 0;
//         int j = 0;
//         int d = 0;
//         while (i < n && j < m) {
//             if (arr1[i] < arr2[j]) {
//                 sorted[d] = arr1[i];
//                 d++;
//                 i++;
//             } else {
//                 sorted[d] = arr2[j];
//                 d++;
//                 j++;
//             }
//         }
//         while (i < n) {
//             sorted[d] = arr1[i];
//             d++;
//             i++;
//         }
//         while (j < m) {
//             sorted[d] = arr2[j];
//             d++;
//             j++;
//         }
//         return sorted[k - 1];
//     }

//     public static void main(String args[]) {
//         int arr1[] = { 2, 3, 6, 7, 9 };
//         int arr2[] = { 1, 4, 8, 10 };
//         int n = arr1.length;
//         int m = arr2.length;
//         int k = 5;
//         System.out.println("the kth element is :" + KthElement(arr1, arr2, n, m, k));
//     }
// }

public class sorting22 {
    public static int FindKth(int arr1[], int arr2[], int n, int m, int k_req) {
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                k++;
                if (k == k_req) {
                    return arr1[i];
                }
                i++;
            } else {
                k++;
                if (k == k_req) {
                    return arr2[j];
                }
                j++;
            }
        }
        while (i < n) {
            k++;
            if (k == k_req) {
                return arr1[i];
            }
            i++;
        }
        while (j < m) {
            k++;
            if (k == k_req) {
                return arr2[j];
            }
            j++;
        }
        return -1;

    }

    public static void main(String args[]) {
        int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        int n = arr1.length;
        int m = arr2.length;
        int k = 5;
        System.out.println(FindKth(arr1, arr2, n, m, k));
    }
}









