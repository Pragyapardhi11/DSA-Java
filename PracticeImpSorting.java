// public class PracticeImpSorting {
//     public static void conquer(int arr[], int si, int ei, int mid) {
//         int merged[] = new int[ei - si + 1];
//         int idx1 = si;
//         int idx2 = mid + 1;
//         int x = 0;
//         while (idx1 <= mid && idx2 <= ei) {
//             if (arr[idx1] <= arr[idx2]) {
//                 merged[x] = arr[idx1];
//                 idx1++;
//                 x++;
//             } else {
//                 merged[x] = arr[idx2];
//                 idx2++;
//                 x++;
//             }
//         }
//         while (idx1 <= mid) {
//             merged[x] = arr[idx1];
//             idx1++;
//             x++;
//         }
//         while (idx2 <= ei) {
//             merged[x] = arr[idx2];
//             idx2++;
//             x++;
//         }
//         for (int i = 0, j = si; i < merged.length; i++, j++) {
//             arr[j] = merged[i];
//         }
//     }

//     public static void divide(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int mid = si + (ei - si) / 2;
//         divide(arr, si, mid);
//         divide(arr, mid + 1, ei);
//         conquer(arr, si, ei, mid);
//     }

//     public static void main(String args[]) {
//         int arr[] = { 423, 45, 34, 13, 24, 56 };
//         int n = arr.length;
//         divide(arr, 0, n - 1);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }

//Quick Sort
public class PracticeImpSorting {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap with pivot :-
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 43, 6, 2, 3, 4, 7, 8 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}