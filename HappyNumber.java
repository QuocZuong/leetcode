public class HappyNumber {
    public static boolean isHappy(int n) {
        /*
         * Example: Input: n = 19
         * Output: true
         * Explanation:
         * 12 + 92 = 82
         * 82 + 22 = 68
         * 62 + 82 = 100
         * 12 + 02 + 02 = 1
         */
        int count = 0;
        int temp = 0;

        while (true) {
            while (n != 0) {
                temp = n % 10;
                n /= 10;
                count += temp * temp;
            }
            if (count == 1) {
                return true;
            }
            if (count == 89) {
                return false;
            } else {
                n = count;
                count = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isHappy(n));
    }
}
