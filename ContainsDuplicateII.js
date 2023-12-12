/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function (nums, k) {
    const temp = new Set();

    for (let i = 0; i < nums.length; i++) {
        if (temp.has(nums[i])) return true;

        temp.add(nums[i]);

        if (temp.size > k) temp.delete(nums[i - k]);
    }

    return false;
};

const nums = [1, 2, 3, 1, 2, 3];
const k = 2;

console.log(containsNearbyDuplicate(nums, k));
