function TreeNode(val, left, right) {
    this.val = val === undefined ? 0 : val;
    this.left = left === undefined ? null : left;
    this.right = right === undefined ? null : right;
}
/**
 * @param {TreeNode} root
 * @return {number}
 */
var getMinimumDifference = function (root) {
    let result = Number.MAX_SAFE_INTEGER;
    let array = [];

    function inOrder(root) {
        if (!root) return;
        if (root.left) {
            inOrder(root.left);
        }
        array.push(root?.val);
        if (root.left) {
            inOrder(root.right);
        }
    }

    inOrder(root);

    for (let i = 1; i < array.length; i++) {
        result = Math.min(result, array[i] - array[i - 1]);
    }

    return result;
};

const root = new TreeNode(4);
root.left = new TreeNode(2);
root.right = new TreeNode(6);
root.left.left = new TreeNode(1);
root.left.right = new TreeNode(3);

console.log(getMinimumDifference(root));
