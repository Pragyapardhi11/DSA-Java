// print reverse of array:-
// import java.util.*;
// public class practiceArray {
// public static void reverseArray(int[] arr) {
// int n = arr.length;
// for (int i = 0; i < n / 2; i++) {
// int temp = arr[i];
// arr[i] = arr[n - 1 - i];
// arr[n - 1 - i] = temp;
// }
// }
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int num[] = new int[n];
// for (int i = 0; i < n; i++) {
// num[i] = sc.nextInt();
// }
// reverseArray(num);
// System.out.println(Arrays.toString(num));
// }
// }

// reverse of array using recursion:-
// import java.util.*;
// public class practiceArray {
// public static void reverseArray(int num[], int start, int end) {
// if (start > end)
// return;
// int temp = num[start];
// num[start] = num[end];
// num[end] = temp;
// reverseArray(num, start + 1, end - 1);
// }
// public static void main(String args[]) {
// int num[] = { 23, 45, 65, 245, 24 };
// int n = num.length;
// reverseArray(num, 0, n - 1);
// System.out.println(Arrays.toString(num));
// }
// }

// find min max number in array :-
// import java.util.*;
// public class practiceArray {
// public static void findMinMax(int arr[]) {
// int n = arr.length;
// int min = arr[0];
// int max = arr[0];
// for (int i = 1; i < n; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// if (arr[i] < min) {
// min = arr[i];
// }
// }
// System.out.println("Largest number is " + min);
// System.out.println("Smallest number is " + max);
// }
// public static void main(String args[]) {
// int arr[] = { 3, 45, 2345, 452, 4, 2455, 245 };
// findMinMax(arr);
// }
// }

// kth largest and smallest element in array :-
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int arr[] = new int[size];
// // input
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// int k = sc.nextInt();
// Arrays.sort(arr);
// System.out.println("kth largers element in array " + arr[arr.lengt-k]);
// }
// }

// find the count of zero one and two and also sort the 0 1 and 2
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr[] = { 1, 2, 0, 0, 1, 2, 0, 2, 0, 2, 1, 2, 1, 2, 2, 0, 0, 0, 1, 1, 1,
// 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
// 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 };
// int zero = 0;
// int one = 0;
// int two = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == 0)
// zero++;
// if (arr[i] == 1)
// one++;
// if (arr[i] == 2)
// two++;
// }
// for (int i = 0; i < zero; i++) {
// arr[i] = 0;
// }
// for (int i = zero; i < zero + one; i++) {
// arr[i] = 1;
// }
// for (int i = zero + one; i < arr.length; i++) {
// arr[i] = 2;
// }
// System.out.println(Arrays.toString(arr));
// System.out.println("the count of zero is " + zero);
// System.out.println("the count of one is " + one);
// System.out.println("the count of two is " + two);
// }
// }

// move negative digit in one side:-
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr[] = { -2, -3, 43, 24, 345, -4, -5, -6, 45, 245, 65, 767, 86, -87,
// -98, -566 };
// int left = 0;
// int right = arr.length - 1;
// while (left < right) {
// while (arr[left] < 0)
// left++;
// while (arr[right] > 0)
// right--;
// if (left > right)
// break;
// int temp = arr[left];
// arr[left] = arr[right];
// arr[right] = temp;
// }
// System.out.println(Arrays.toString(arr));
// }
// }

// find union:-
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr1[] = { 3, 3, 4, 5, 6, 7 };
// int arr2[] = { 5, 5, 6, 6, 7, 7, 8, 8, 9 };
// int left = 0;
// int right = 0;
// List<Integer> res = new ArrayList<>();
// while (left < arr1.length || right < arr2.length) {
// // skip duplicate
// while (left > 0 && left < arr1.length && arr1[left] == arr1[left - 1]) {
// left++;
// }
// while (right > 0 && right < arr2.length && arr2[right] == arr2[right - 1]) {
// right++;
// }
// // if one is exhaust
// if (left >= arr1.length) {
// res.add(arr2[right]);
// right++;
// continue;
// }
// if (right >= arr2.length) {
// res.add(arr1[left]);
// left++;
// continue;
// }
// // comparison
// if (arr1[left] < arr2[right]) {
// res.add(arr1[left]);
// left++;
// } else if (arr1[left] > arr2[right]) {
// res.add(arr2[right]);
// right++;
// } else {
// res.add(arr1[left]);
// right++;
// left++;
// }
// }
// System.out.println(res);
// }
// }

// find intersection:-
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr1[] = { 3, 3, 4, 5, 6, 7 };
// int arr2[] = { 5, 5, 6, 6, 7, 7, 8, 8, 9 };
// int left = 0;
// int right = 0;
// List<Integer> res = new ArrayList<>();
// while (left < arr1.length && right < arr2.length) {
// // skip duplicate
// while (left > 0 && left < arr1.length && arr1[left] == arr1[left - 1]) {
// left++;
// }
// while (right > 0 && right < arr2.length && arr2[right] == arr2[right - 1]) {
// right++;
// }
// // if one is exhaust
// if (left >= arr1.length || right >= arr2.length) {
// // res.add(arr2[right]);
// // right++;
// // continue;
// break;
// }
// // comparison
// if (arr1[left] < arr2[right]) {
// // res.add(arr1[left]);
// left++;
// } else if (arr1[left] > arr2[right]) {
// // res.add(arr2[right]);
// right++;
// } else {
// res.add(arr1[left]);
// right++;
// left++;
// }
// }
// System.out.println(res);
// }
// }

// rorate an array by k :-
// import java.util.*;
// public class practiceArray {
// public static void reverseArray(int arr[], int start, int end) {
// for (int i = start, j = end; i < j; i++, j--) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// }
// public static void main(String args[]) {
// int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
// int n = arr.length;
// int k = 600;
// k = k % n;
// reverseArray(arr, 0, n - 1);
// reverseArray(arr, 0, k - 1);
// reverseArray(arr, k, n - 1);
// System.out.println(Arrays.toString(arr));
// }
// }

// largest sum contiguous subarray:-
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr[] = { 2, -45, -563, 2, -25, -76, -87, -98 };
// int max = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// int sum = 0;
// for (int k = i; k < j; k++) {
// sum = sum + arr[k];
// }
// if (sum > max) {
// max = sum;
// }
// }
// }
// System.out.println(max);
// }
// }

// largest sum contiguous subarray with better complexity:-TC=O(n^2)
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr[] = { 2, -45, -563, 2, -25, -76, -87, -98 };
// int max = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// int sum = 0;
// sum = sum + arr[j];
// if (sum > max) {
// max = sum;
// }
// }
// }
// System.out.println(max);
// }
// }

// largest contiguous subarray with best complexity TC=O(n^2)
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr[] = { 2, -45, -563, 2, -25, -76, -87, -98 };
// int bestsum = 0;
// int currentsum = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > currentsum) {
// currentsum = arr[i];
// }
// if (bestsum < currentsum) {
// bestsum = currentsum;
// }
// }
// System.out.println(bestsum);
// }
// }

// minimize the height :-
// import java.util.*;
// public class practiceArray {
// public static void getminmax(int arr[], int n, int k) {
// if (n == 1)
// return;
// Arrays.sort(arr);
// int diff = (arr[n - 1] - arr[0]);
// int max = 0;
// int min = 0;
// for (int i = 1; i < n; i++) {
// if (arr[i] - k < 0)
// continue;
// if ((arr[n - 1] - k) > arr[i - 1] + k) {
// max = (arr[n - 1] - k);
// }
// if (arr[0] + k < arr[i] - k) {
// min = (arr[0] + k);
// }
// if (max - min > diff) {
// diff = max - min;
// }
// }
// System.out.println(diff);
// }
// public static void main(String args[]) {
// int arr[] = { 1, 15, 10 };
// int k = 6;
// int n = arr.length;
// getminmax(arr, n, k);
// }
// }

// min num of jump to reach the end :-
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr[] = { 1, 1, 1, 1, 1, 43 };
// int jump = 0;
// int positiion = 0;
// int destination = 0;
// for (int i = 0; i < arr.length - 1; i++) {
// if (destination < arr[i] + i) {
// destination = arr[i] + i;
// }
// if (positiion == i) {
// positiion = destination;
// jump++;
// }
// }
// System.out.println(jump);
// }
// }

// find duplicate in array :-
// import java.util.*;
// public class practiceArray {
// public static void findduplicate(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// int index = Math.abs(arr[i]);
// if (arr[index] < 0) {
// System.out.println(index);
// }
// arr[index] = -arr[index];
// }
// }
// public static void main(String args[]) {
// int arr[] = { 1, 2, 3, 4, 5, 3, 2 };
// findduplicate(arr);
// }
// }

// merge two sorted array:-
// import java.util.*;
// public class practiceArray {
// public static void fixArray2(int arr2[]) {
// for (int i = 1; i < arr2.length; i++) {
// if (arr2[i] < arr2[i - 1]) {
// int temp = arr2[i];
// arr2[i] = arr2[i - 1];
// arr2[i - 1] = temp;
// }
// }
// }
// public static void main(String args[]) {
// int arr1[] = { 1, 3, 5, 7 };
// int arr2[] = { 0, 2, 6, 8, 9 };
// int n = arr1.length;
// int m = arr2.length;
// int i = 0;
// int j = 0;
// while (i < n) {
// if (arr1[i] > arr2[j]) {
// int temp = arr1[i];
// arr1[i] = arr2[j];
// arr2[j] = temp;
// fixArray2(arr2);
// }
// i++;
// }
// System.out.println(Arrays.toString(arr1));
// System.out.println(Arrays.toString(arr2));
// }
// }

// Kadane's Algorithm:-
// import java.util.*;
// public class practiceArray {
// public static void main(String args[]) {
// int arr[] = { 2, 3, -5, -8, 9 };
// int bestsum = 0;
// int currentsum = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > currentsum) {
// currentsum = arr[i];
// }
// if (bestsum < currentsum) {
// bestsum = currentsum;
// }
// }
// System.out.println(bestsum);
// }
// }
