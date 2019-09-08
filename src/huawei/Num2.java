package huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
//思路：先遍历输入字符串，在set内的字符串全部加进set内
//再遍历一遍set，将含有str的字符串再添加进set中

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String start = sc.nextLine();
//        int m = sc.nextInt();
//        HashSet<String> set = new HashSet<>();
//        set.add(start);
//        boolean flag = false;
//        ArrayList<String> arr = new ArrayList<>();
//        for(int i = 0;i <= m;i++){
//            String tmp = sc.nextLine();
//            arr.add(tmp);
//            String[] names = tmp.split(",");
//            for(String str : names){
//                if(set.contains(str)){
//                    flag = true;
//                }
//            }
//            if(flag){
//                set.addAll(Arrays.asList(names));
//            }
//            flag = false;
//        }
//        for(int i = arr.size() - 1;i >= 0;i --){
//            String tmp = arr.get(i);
//            String[] names = tmp.split(",");
//            for(String str : names){
//                if(set.contains(str)){
//                    flag = true;
//                }
//            }
//            if(flag){
//                set.addAll(Arrays.asList(names));
//            }
//            flag = false;
//        }
//        for(int i = arr.size() / 2;i >= 0;i --){
//            String tmp = arr.get(i);
//            String[] names = tmp.split(",");
//            for(String str : names){
//                if(set.contains(str)){
//                    flag = true;
//                }
//            }
//            if(flag){
//                set.addAll(Arrays.asList(names));
//            }
//            flag = false;
//        }
//        for(int i = arr.size() / 2;i <= m;i ++){
//            String tmp = arr.get(i);
//            String[] names = tmp.split(",");
//            for(String str : names){
//                if(set.contains(str)){
//                    flag = true;
//                }
//            }
//            if(flag){
//                set.addAll(Arrays.asList(names));
//            }
//            flag = false;
//        }
//        int cnt = set.size();
//        System.out.println(cnt);
//    }
//}
