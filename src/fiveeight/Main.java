package fiveeight;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node createBinaryTreeByArray(Integer[] array, int index) {
        Node tn = null;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new Node(value);
            tn.left = createBinaryTreeByArray(array, 2 * index + 1);
            tn.right = createBinaryTreeByArray(array, 2 * index + 2);
            return tn;
        }
        return tn;
    }

    public int levelOrder(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!que.isEmpty()) {
            int cnt = que.size();
            int sum = 0;
            while (cnt-- > 0) {
                Node tmp = que.poll();
                if (tmp == null)
                    continue;
                sum += tmp.val;
                que.add(tmp.left);
                que.add(tmp.right);
            }
            list.add(sum);
        }
        int max = list.get(0);
        for (int num : list) {
            max = Math.max(num, max);
        }
        int ret = 0;
        ret = list.lastIndexOf(max);
        return ret;
    }


    public Node createTree(int[] array) {
        List<Node> nodeList = new LinkedList<Node>();

        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {
            nodeList.add(new Node(array[nodeIndex]));
        }
        for (int parentIndex = 0; parentIndex <= array.length / 2 - 1; parentIndex++) {
            nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);
            //防止是非完全二叉树
            if ((parentIndex * 2 + 2) < array.length) {
                nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
            }
        }
        return nodeList.get(0);
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int [] array = new int [n];
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            String value = scanner.next();
            if (value.equals("null")) {
                array[i] = null;
            } else {
                array[i] = Integer.valueOf(value);
            }

        }
        Main solution = new Main();
        Node root = solution.createBinaryTreeByArray(array, 0);
        int level = solution.levelOrder(root);
        System.out.println(level);

    }
}