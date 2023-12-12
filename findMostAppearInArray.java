import java.util.HashMap;
import java.util.Map;

public class findMostAppearInArray {
    public static void findMaxAppear(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int countMax = 0;
        int mostAppearElement = nums[0];
        // loop through each entry set
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count > countMax) {
                countMax = count;
                mostAppearElement = entry.getKey();
            }
        }

        System.out.println("Most appear is " + mostAppearElement + " with " + countMax + " time(s)");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 11 };
        findMaxAppear(nums);
    }
}
