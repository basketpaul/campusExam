package huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        int m = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        set.add(start);
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            arr.add(sc.nextLine());
        }
        for (String str : arr) {
            System.out.println(str);
        }
        for (int i = 0; i < arr.size(); i++) {
            String tmp = arr.get(i);
            String[] strs = tmp.trim().split(",");
            for (String str : strs) {
                if (set.contains(str)) {
                    set.addAll(Arrays.asList(strs));
                }
            }
        }
        for (String str : set) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).contains(str)) {
                    set.addAll(Arrays.asList(arr.get(i).split(",")));
                }
            }
        }
        int cnt = set.size();
        System.out.println(cnt);
    }
}
