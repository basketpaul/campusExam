package qunar;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Character, Integer> indexForIn = new HashMap<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inOrder = sc.nextLine();
        String postOrder = sc.nextLine();
        char[] in = inOrder.trim().toCharArray();
        char[] post = postOrder.trim().toCharArray();
        TreeNode root = reConstructBinaryTree(in, post);
        preOrder(root);
        System.out.println(sb.toString());
    }

    private static TreeNode reConstructBinaryTree(char[] inOrder, char[] postOrder) {
        for (int i = 0; i < inOrder.length; i++) {
            indexForIn.put(inOrder[i], i);
        }
        return reConstructBinaryTree(postOrder, 0, inOrder.length - 1, inOrder.length - 1);
    }

    private static TreeNode reConstructBinaryTree(char[] post, int postL, int postR, int inL) {
        if (postL > postR)
            return null;
        TreeNode root = new TreeNode(post[postR]);
        int index = indexForIn.get(root.val);
        int rightSize = inL - index;
        root.right = reConstructBinaryTree(post, postR - rightSize, postR - 1, inL);
        root.left = reConstructBinaryTree(post, postL, postR - 1 - rightSize, inL - rightSize - 1);
        return root;
    }

    private static void preOrder(TreeNode root) {
        if (root == null)
            return;
        sb.append(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}

class TreeNode {
    public char val;
    TreeNode left;
    TreeNode right;

    TreeNode(char val) {
        this.val = val;
    }
}
