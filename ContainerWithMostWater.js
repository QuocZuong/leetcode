/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
    let left = 0;
    let right = height.length - 1;

    let result = 0;

    while (left < right) {
        let mHeight = Math.min(height[left], height[right]);
        let width = right - left;

        result = Math.max(result, mHeight * width);

        if (height[left] > height[right]) {
            right--;
        } else {
            left++;
        }
    }

    return result;
};

const height = [1, 8, 6, 2, 5, 4, 8, 3, 7];

console.log(maxArea(height));
