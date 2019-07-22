package tree;

public class MaxDepthOfBinaryTree104 {
    public static void main(String[] args) {

    }

    public static int depth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return Math.max(depth(root.left) + 1, depth(root.right) + 1);
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val) {
        this.val = val;
    }
}
