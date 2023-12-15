public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] > target) {
                end--;
            } else if (nums[mid] < target) {
                start++;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        System.out.println(searchInsert(nums, 5));
    }
}
