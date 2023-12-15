/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function (nums) {
    let length = nums.length;
    if (length == 0) return 0;

    nums.sort((a, b) => {
        return a - b;
    });
    console.log(nums);
    let current = 1;
    let result = 0;

    for (let i = 1; i < length; i++) {
        if (nums[i] != nums[i - 1]) {
            if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                result = Math.max(current, result);
                current = 1;
            }
        }
    }
    return Math.max(current, result);
};

const nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1];
console.log(longestConsecutive(nums));
