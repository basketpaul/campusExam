package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTopToButtom {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> printTopToButtom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp.left != null)
                queue.add(tmp.left);
            if (tmp.right != null)
                queue.add(tmp.right);
            list.add(tmp.val);
        }
        return list;
    }
}
