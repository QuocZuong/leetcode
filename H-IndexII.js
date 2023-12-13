/**
 * @param {number[]} citations
 * @return {number}
 */
var hIndex = function (citations) {
    let i = citations.length - 1;

    while (citations[i] < i) {
        i--;
    }

    return i;
};
// 6 5 3 1 0
const citations = [0, 1, 3, 5, 6];

console.log(hIndex(citations));
