/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function (x, n) {
    let result = 1;

    if (n > 0) {
        while (n-- > 0) {
            result *= x;
        }
    } else {
        while (n++ < 0) {
            result *= 1 / x;
        }
    }

    return result.toFixed(5);
};

const x = 2.0,
    n = -2;

console.log(myPow(x, n));
