/**
 * @param {number[]} citations
 * @return {number}
 */
var hIndex = function (citations) {
    citations.sort((a, b) => {
        return b - a;
    });

    let length = citations.length;

    let result = length;
    let i = 0;

    while (i < length) {
        let count = 0;
        for (let j = 0; j < citations.length; j++) {
            if (citations[j] >= result) {
                count++;
            }
        }
        if (count < result) {
            result--;
        }
        if (count >= result && citations.includes(result)) {
            return result;
        }
        ++i;
    }

    return result;
};
// 6 5 3 1 0
const citations = [0];

console.log(hIndex(citations));
