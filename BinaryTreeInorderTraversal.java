import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    static class TreeNode {
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

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursive(result, root);
        return result;
    }

    public static void recursive(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }
        recursive(result, node.left);
        result.add(node.val);
        recursive(result, node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> res = inorderTraversal(root);
        System.out.println(res);
    }
}
