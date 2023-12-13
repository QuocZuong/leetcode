public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // example input nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int i = m - 1; // last element in nums1 without 0
        int j = n - 1; // last element in nums2
        int k = m + n - 1; // last element in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // check xem nums2 con khong va gop vao nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 10, 0 };
        int[] nums2 = { 1 };
        int m = 1;
        int n = 1;
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
