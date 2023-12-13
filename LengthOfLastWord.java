public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        s = s.trim();
        int result = 0;
        int len = s.length() - 1;
        for (int i = len; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(lengthOfLastWord(s));
    }
}
