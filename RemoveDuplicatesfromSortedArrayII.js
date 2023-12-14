/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    let length = nums.length;
    if (length <= 2) return length;

    let k = 2;

    for (let i = 2; i < length; i++) {
        if (nums[i] != nums[k - 1] || nums[i] != nums[k - 2]) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
};

const nums = [0, 0, 1, 1, 1, 1, 2, 3, 3];

console.log(removeDuplicates(nums));
