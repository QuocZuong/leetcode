/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (numbers, target) {
    let first = 0;
    let second = numbers.length - 1;

    while (first < second) {
        const sum = numbers[first] + numbers[second];
        if (sum == target) return [first + 1, second + 1];
        else if (sum < target) {
            first++;
        } else if (sum > target) {
            second--;
        }
    }
};

const numbers = [2, 3, 4, 5, 5, 6];
const target = 6;

console.log(twoSum(numbers, target));
