/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function (target, nums) {
    let result = Number.MAX_SAFE_INTEGER;

    let sum = 0;
    let left = 0;
    for (let right = 0; right < nums.length; right++) {
        sum += nums[right];

        while (sum >= target) {
            result = Math.min(result, right - left + 1);
            sum -= nums[left];
            left++;
        }
    }

    return result === Number.MAX_SAFE_INTEGER ? 0 : result;
};

console.log(minSubArrayLen(4, [2, 3, 3, 3, 3, 3, 3]));
