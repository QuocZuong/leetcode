
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTreeLoop {

    public static class TreeNode {
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

    // check xem cay co doi xung khong
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> storage = new LinkedList<>();
        storage.offer(root.left);
        storage.offer(root.right);
        while (!storage.isEmpty()) {
            TreeNode left = storage.poll();
            TreeNode right = storage.poll();

            if (left == null && right == null) {
                continue;
            } else if (left == null || right == null) {
                return false;
            } else if (left.val != right.val) {
                return false;
            } else {
                storage.offer(left.left);
                storage.offer(right.right);
                storage.offer(left.right);
                storage.offer(right.left);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(4);

        System.out.println(isSymmetric(root));
    }
}
