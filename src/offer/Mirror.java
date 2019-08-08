package offer;

public class Mirror {
    public static void main(String[] args) {

    }

    public static void mirror(TreeNode root) {
        if (root == null)
            return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null)
            mirror(root.left);
        if (root.right != null)
            mirror(root.right);
    }
}
