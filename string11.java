// Split the binary string into substrings with equal number of 0s and 1s
public class string11 {
    public static int Spliting(String str, int n) {
        int count0 = 0;
        int count1 = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') {
                count0++;
            } else {
                count1++;

            }
            if (count0 == count1) {
                cnt++;
            }
        }
        if (count0 != count1) {
            return -1;
        }
        return cnt;

    }

    public static void main(String args[]) {
        String str = "01001101";
        int n = str.length();
        System.out.println(Spliting(str, n));
    }
}
