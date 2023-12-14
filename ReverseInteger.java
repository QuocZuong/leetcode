public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        int tempResult = 0;
        while (x != 0) {

            int remainder = x % 10;
            tempResult = x * 10 + remainder;
            if ((tempResult - remainder) % 10 != 0) {
                return 0;
            }
            result = tempResult;
            x /= 10;
        }

        return result;
    }
}
