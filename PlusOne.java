public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;

        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] worseCase = new int[len + 1];
        worseCase[0] = 1;
        return worseCase;
    }

    public static void main(String[] args) {
        int[] digits = { 9, 9, 9, 9, 9, 9 };
        for (int i : plusOne(digits)) {
            System.out.println(i);
        }
    }
}
