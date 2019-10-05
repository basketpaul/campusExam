package vivo;

import java.io.*;
import java.util.HashMap;
import java.util.Stack;

/**
 * Welcome to vivo !
 */

public class Main3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        int output = solution(input);
        System.out.println(output);
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    private static int solution(int[] input) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : input) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        int cnt = 0;
        for (int num : map.keySet()) {
            cnt = map.get(num) * map.get(num);
        }
        return cnt;
    }
}