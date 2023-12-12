/**
 * @param {number[]} arr
 * @return {number}
 */
var findSpecialInteger = function (arr) {
    if (arr.length === 1) return arr[0];

    let temp = Math.floor(arr.length / 4);
    let count = 0;
    let pre = arr[0];
    for (let i = 1; i < arr.length; i++) {
        count++;
        if (pre != arr[i]) {
            count = 0;
        }
        if (count >= temp) {
            return arr[i];
        }
        pre = arr[i];
    }
};

const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 12, 12];

console.log(findSpecialInteger(arr));
