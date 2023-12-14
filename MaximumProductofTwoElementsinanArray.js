/**
 * @param {number[]} nums
 * @return {number}
 */

var maxProduct = function (nums) {
    let length = nums.length;
    if (length <= 1) {
        return nums[0];
    }
    nums.sort(function (a, b) {
        return a - b;
    });

    return (nums[length - 1] - 1) * (nums[length - 2] - 1);
};

const nums = [10, 2, 5, 2];

console.log(maxProduct(nums));
