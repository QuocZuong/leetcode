/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
    const result = new Map();

    for (let i = 0; i < strs.length; i++) {
        const sortedStr = strs[i].split("").sort().join("");

        if (result.has(sortedStr)) {
            result.set(sortedStr, [...result.get(sortedStr), strs[i]]);
        } else {
            result.set(sortedStr, [strs[i]]);
        }
    }

    return Array.from(result.values());
};

const strs = ["eat", "tea", "tan", "ate", "nat", "bat"];

console.log(groupAnagrams(strs));
