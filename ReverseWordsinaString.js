/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function (s) {
    let result = "";

    let test = s.split(" ");

    test.reverse();

    test.forEach((item) => {
        if (item != "") {
            result += item + " ";
        }
    });

    return result.trim();
};

const s = "a good   example";

console.log(reverseWords(s));
