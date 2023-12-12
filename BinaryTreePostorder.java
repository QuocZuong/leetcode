import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreePostorder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursive(root, list);
        return list;
    }

    private void recursive(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        recursive(node.left, list);
        recursive(node.right, list);
        list.add(node.val);
    }

    public static void main(String[] args) {
        BinaryTreePostorder solution = new BinaryTreePostorder();
        TreeNode root = solution.new TreeNode(1);
        root.right = solution.new TreeNode(2);
        root.right.left = solution.new TreeNode(3);

        List<Integer> traversal = solution.postorderTraversal(root);
        System.out.println(traversal);
    }
}
