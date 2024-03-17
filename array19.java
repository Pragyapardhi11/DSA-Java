// count inverse 
public class array19 {
    public static void main(String args[]) {
        int arr[] = { 8, 4, 2, 1 };
        int n = arr.length;
        int id = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    id++;
                }
            }
        }
        System.out.println("the number of inverse are " + id);
    }
}
// but its time complexity is O(n^2)