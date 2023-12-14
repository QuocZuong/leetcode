public class PalindromeNumber {
    public static boolean isPalindrome(int x) {

        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
