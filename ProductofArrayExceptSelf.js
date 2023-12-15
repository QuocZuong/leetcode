/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
    const result = [];
    const length = nums.length;

    let prefix = 1;
    for (let i = 0; i < length; i++) {
        result[i] = prefix;
        prefix *= nums[i];
    }

    let suffix = 1;
    for (let i = length - 1; i >= 0; i--) {
        result[i] *= suffix;
        suffix *= nums[i];
    }

    return result;
};

const nums = [4, 3, 2, 1, 2];

console.log(productExceptSelf(nums));
