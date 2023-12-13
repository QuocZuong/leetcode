import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static List majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length / 2];
        List<Integer> result = new ArrayList<Integer>();
        int majority1 = 0;
        int count1 = 0;
        int majority2 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (majority1 == nums[i]) {
                count1++;
            } else if (majority2 == nums[i]) {
                count2++;
            } else if (count1 == 0) {
                majority1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                majority2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == majority1) {
                count1++;
            } else if (nums[i] == majority2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            result.add(majority1);
        }
        if (count2 > nums.length / 3) {
            result.add(majority2);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 3, 1, 4, 5, 6 };
        System.out.println(majorityElement(nums));
    }
}
