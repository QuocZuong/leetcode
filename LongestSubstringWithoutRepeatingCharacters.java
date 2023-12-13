import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();

        while (i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                result = Math.max(result, set.size());
            } else {
                System.out.println("before: " + set);
                set.remove(s.charAt(j++));
                System.out.println("after: " + set);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
