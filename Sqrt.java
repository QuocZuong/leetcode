public class Sqrt {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 0;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqrt = mid * (long) mid;

            if (sqrt > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
                result = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
