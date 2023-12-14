/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
    let result = 0;
    let left = 0;
    let set = new Set();
    let length = s.length;

    for (let i = 0; i < length; i++) {
        while (set.has(s[i])) {
            set.delete(s[left]);
            left++;
        }
        set.add(s[i]);

        result = result > i - left + 1 ? result : i - left + 1;
    }

    return result;
};

const s = "abcabcbb";
console.log(lengthOfLongestSubstring(s));
