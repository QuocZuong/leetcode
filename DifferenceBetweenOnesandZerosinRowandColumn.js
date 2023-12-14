/**
 * @param {number[][]} grid
 * @return {number[][]}
 */
var onesMinusZeros = function (grid) {
    let m = grid.length;
    let n = grid[0].length;

    const rowOnes = new Array(m).fill(0);
    const colOnes = new Array(n).fill(0);

    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            rowOnes[i] += grid[i][j];
            colOnes[j] += grid[i][j];
        }
    }
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; ++j) {
            grid[i][j] = 2 * (rowOnes[i] + colOnes[j]) - m - n;
        }
    }

    return grid;
};

const grid = [
    [0, 1, 1],
    [1, 0, 1],
    [0, 0, 1],
];

console.log(onesMinusZeros(grid));
