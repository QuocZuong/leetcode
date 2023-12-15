/**
 * @param {number[]} citations
 * @return {number}
 */
var hIndex = function (citations) {
    let length = citations.length;
    if (length < 1) return;
    citations.sort((a, b) => {
        return a - b;
    });

    let result;
    let i = 0;
    while (i < length) {
        let temp = citations[i];
        let count = 0;
        for (let j = 0; j < length; j++) {
            if (citations[j] >= temp) {
                count++;
            }
            if (count === temp) {
                result = temp;
            }
        }
        i++;
    }

    return result;
};

const citations = [1, 1, 1];

console.log(hIndex(citations));
