package kedaxunfei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char tmp = str.charAt(i);
            if ((tmp - '0' >= 0) && ('9' - tmp >= 0))
                arr.add(tmp - '0');
        }
        if (arr.size() == 0) {
            System.out.println(-1);
        } else {
            int[] nums = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                nums[i] = arr.get(i);
            }
            Arrays.sort(nums);
            for (int num : nums)
                System.out.print(num);
        }
    }
}
