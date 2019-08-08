package offer;

public class HasSubTree {
    public static void main(String[] args) {

    }

    static boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;
        return subTree(root1, root2) || subTree(root1.left, root2) || subTree(root1.right, root2);
    }

    static boolean subTree(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return subTree(root1.left, root2.left) && subTree(root1.right, root2.right);
    }
}


class TreeNode {
    TreeNode left = null;
    TreeNode right = null;
    int val = 0;

    public TreeNode(int val) {
        this.val = val;
    }
}
