package offer;

public class TreeDepth {
    public static void main(String[] args) {

    }

    private static int treeDepth(TreeNode root) {
        return root == null ? 0 : Math.max(treeDepth(root.left) + 1, treeDepth(root.right) + 1);
    }
}
