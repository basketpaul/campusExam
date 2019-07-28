package pdd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zifuhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        isCycle(arr);
    }

    private static void isCycle(String[] a) {
        Map<Character, Integer> startMap = new HashMap<>();
        Map<Character, Integer> endMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            String tmp = a[i];
            char start = tmp.charAt(0);
            char end = tmp.charAt(tmp.length() - 1);
            if (startMap.containsKey(start)) {
                int time = startMap.get(start);
                time++;
                startMap.put(start, time);
            } else
                startMap.put(start, 1);
            if (endMap.containsKey(end)) {
                int time = endMap.get(end);
                time++;
                endMap.put(end, time);
            } else
                endMap.put(end, 1);
        }
        boolean flag = true;
        for (Character c : startMap.keySet()) {
            if (!startMap.get(c).equals(endMap.get(c))) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
