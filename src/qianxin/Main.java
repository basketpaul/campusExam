package qianxin;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = null, b = null;
        if (sc.hasNextLine()) {
            a = sc.nextLine();
        }
        if (sc.hasNextLine())
            b = sc.nextLine();
        int kill = sc.nextInt();
        String[] pid = a.split(" ");
        String[] ppid = b.split(" ");
        HashSet<Integer> set = new HashSet<>();
        set.add(kill);
        for (int i = 0; i < ppid.length; i++) {
            if (set.contains(Integer.valueOf(ppid[i])))
                set.add(Integer.valueOf(pid[i]));
        }
        for (int i = ppid.length - 1; i >= 0; i--) {
            if (set.contains(Integer.valueOf(ppid[i])))
                set.add(Integer.valueOf(pid[i]));
        }
        for (int i = 0; i < ppid.length; i++) {
            if (set.contains(Integer.valueOf(ppid[i])))
                set.add(Integer.valueOf(pid[i]));
        }
        for (int num : set) {
            for (int i = 0; i < ppid.length; i++) {
                if (num == Integer.valueOf(ppid[i]))
                    set.add(Integer.valueOf(pid[i]));
            }
        }
        System.out.println(set.size());
    }
}
