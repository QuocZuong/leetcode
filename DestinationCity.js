/**
 * @param {string[][]} paths
 * @return {string}
 */
var destCity = function (paths) {
    let start = new Set();
    let end = new Set();

    for (let i = 0; i < paths.length; i++) {
        for (let j = 0; j < paths[i].length; j++) {
            if (j == 0) {
                start.add(paths[i][j]);
            } else {
                end.add(paths[i][j]);
            }
        }
    }

    let intersection = [...end].filter((item) => {
        return !start.has(item);
    });

    if (start.keys(end)) {
        start.delete(end);
    }

    return intersection[0];
};

const paths = [
    ["B", "C"],
    ["D", "B"],
    ["C", "A"],
];

console.log(destCity(paths));
