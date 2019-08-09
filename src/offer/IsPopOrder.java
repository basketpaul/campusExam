package offer;

import java.util.Stack;

public class IsPopOrder {
    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};
        System.out.println(isPopOrder(pushA, popA));
    }

    public static boolean isPopOrder(int[] pushA, int[] popA) {
        int pop = 0;
        Stack<Integer> stack = new Stack<>();
        for (int aPushA : pushA) {
            stack.push(aPushA);
            if (stack.peek() == popA[pop]) {
                stack.pop();
                pop++;
            }
        }
        for (int i = pop; i < popA.length; i++) {
            if (stack.peek() == popA[i])
                stack.pop();
        }
        return stack.isEmpty();
    }
}
