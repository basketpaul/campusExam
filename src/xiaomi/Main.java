package xiaomi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static void solution(String[] input) {
        int[][] arr = new int[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            String[] tmp = input[i].split(" ");
            for (int j = 0; j < input.length; j++) {
                arr[i][j] = Integer.valueOf(tmp[j]);
            }
        }
        Left(arr, input.length);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (j != input.length - 1)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void Left(int[][] arr, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int y = j + 1; y < length; y++) {
                    if (arr[i][y] > 0) {
                        if (arr[i][j] == 0) {
                            arr[i][j] = arr[i][y];
                            arr[i][y] = 0;
                        } else if (arr[i][j] == arr[i][y]) {
                            arr[i][j] = arr[i][j] * 2;
                            arr[i][y] = 0;
                        }
                    }
                }
            }
        }
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for (int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }
        solution(_input);
    }
}
