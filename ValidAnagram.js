/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */

function compareMaps(map1, map2) {
    let testVal;
    if (map1.size !== map2.size) {
        return false;
    }
    for (let [key, val] of map1) {
        testVal = map2.get(key);
        if (testVal !== val || (testVal === undefined && !map2.has(key))) {
            return false;
        }
    }
    return true;
}

var isAnagram = function (s, t) {
    const map1 = new Map();
    const map2 = new Map();

    s.split("").forEach((char) => {
        if (map1.has(char)) map1.set(char, map1.get(char) + 1);
        else map1.set(char, 1);
    });

    t.split("").forEach((char) => {
        if (map2.has(char)) map2.set(char, map2.get(char) + 1);
        else map2.set(char, 1);
    });

    return compareMaps(map1, map2);
};

const s = "rat";

const t = "car";

console.log(isAnagram(s, t));
