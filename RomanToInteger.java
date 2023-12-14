import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] a = s.toCharArray();
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && map.get(a[i]) < map.get(a[i + 1])) {
                result -= map.get(a[i]);
            } else {
                result += map.get(a[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
