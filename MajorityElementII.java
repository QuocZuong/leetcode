import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int majorityTemp = nums[0];
        int count = 1;
        int len = nums.length;
        for (int i = 1; i < len; i++) {

            if (count > len / 3) {
                list.add(majorityTemp);
                count = 0;
                continue;
            }

            if (count == 0) {
                majorityTemp = nums[i];
                count++;
            }

            else if (majorityTemp == nums[i]) {
                count++;
            }

            else {
                count--;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }
}
