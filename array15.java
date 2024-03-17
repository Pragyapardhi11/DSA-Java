public class array15 {
    public static void main(String args[]) {
        int num[] = { 2, 3, 4, 1, 1, 5, 2 };
        int pos = 0;
        int jump = 0;
        int des = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (des < num[i] + i) {
                des = num[i] + i;
            }

            if (pos == i) {
                pos = des;
                jump++;
            }
        }
        System.out.println(jump);
    }
}
