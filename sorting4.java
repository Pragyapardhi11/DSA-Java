// // Square root of an integer
// public class sorting4 {
//     public static int SquareRoot(int x) {
//         if (x == 0 || x == 1) {
//             return x;
//         }

//         int i = 0;
//         int result = 1;

//         while (result <= x) {
//             i++;
//             result = i * i;

//         }
//         return i - 1;
//     }

//     public static void main(String args[]) {
//         int x = 9;
//         System.out.println(SquareRoot(x));

//     }
// }

// // with math function:
public class sorting4 {
    public static int Square(int x) {
        int sqr = (int) Math.sqrt(x);
        int res = (int) (sqr);
        return res;
    }

    public static void main(String args[]) {
        int x = 11;
        System.out.println(Square(x));

    }
}