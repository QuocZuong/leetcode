
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // luu value va index
        int[] output = null;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) { // neu target - value1 = value2
                output = new int[] { map.get(target - nums[i]), i }; // luu index cua value1 va value2
                break;
            } else {
                map.put(nums[i], i); // luu gia tri va index cua no vao map
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 23, 344, 45, 56, 234, 121, 4, 5, 7 };
        for (int each : twoSum(nums, 9)) {
            System.out.println(each);
        }
    }
}