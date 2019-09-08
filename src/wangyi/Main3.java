package wangyi;

import java.util.*;

public class Main3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            isIncrease();
        }
    }

    private static void isIncrease() {
        int n = sc.nextInt();
        ArrayList<TreeNode> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt(), left = sc.nextInt(), right = sc.nextInt();
            TreeNode tmp = new TreeNode(val);
            tmp.leftNum = left;
            tmp.rightNum = right;
            list.add(tmp);
        }
        int[] arr = new int[n];
        for (TreeNode tmp : list) {
            if (tmp.leftNum != -1)
                arr[tmp.leftNum] = 1;
            if (tmp.rightNum != -1)
                arr[tmp.rightNum] = 1;
        }
        TreeNode root = new TreeNode(-1);
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                root = list.get(i);
        }
        Queue<Queue<TreeNode>> all = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        all.add(queue);
        queue.add(root);
        int sum = root.val;
        List<Integer> ret = new ArrayList<>();
        ret.add(sum);
        while (!all.isEmpty()) {
            Queue<TreeNode> tmp = all.poll();
            int num = 0;
            Queue<TreeNode> next = new LinkedList<>();
            while (!tmp.isEmpty()) {
                TreeNode temp = tmp.poll();
                if (temp.leftNum != -1) {
                    next.add(list.get(temp.leftNum));
                }
                if (temp.rightNum != -1) {
                    next.add(list.get(temp.rightNum));
                }
                num += temp.val;
            }
            ret.add(num);
            if (!next.isEmpty())
                all.add(next);
        }
        boolean flag = true;
        for (int i = 1; i < ret.size() - 1; i++) {
            if (ret.get(i) < ret.get(i - 1))
                flag = false;
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

class TreeNode {
    int val;
    int leftNum;
    int rightNum;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
