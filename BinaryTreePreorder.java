import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreePreorder {

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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursive(list, root);
        return list;
    }

    private void recursive(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }

        list.add(node.val);
        recursive(list, node.left);
        recursive(list, node.right);
    }

    public static void main(String[] args) {
        BinaryTreePreorder solution = new BinaryTreePreorder();
        TreeNode root = solution.new TreeNode(1);
        root.right = solution.new TreeNode(2);
        root.right.left = solution.new TreeNode(3);

        List<Integer> traversal = solution.preorderTraversal(root);
        System.out.println(traversal);
    }
}
