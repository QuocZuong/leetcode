/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function (nums) {
    let result = [];

    for (let i = 0; i < nums.length; i++) {
        let start = nums[i];

        while (i + 1 < nums.length && nums[i] == nums[i + 1] - 1) {
            i++;
        }

        let end = nums[i];

        if (start == end) {
            result.push("" + end);
        } else {
            result.push(start + "->" + end);
        }
    }

    return result;
};

const nums = [0, 1, 2, 4, 5, 7];

console.log(summaryRanges(nums));
