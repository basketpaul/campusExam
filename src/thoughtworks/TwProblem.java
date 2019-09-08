package thoughtworks;

import java.util.ArrayList;
import java.util.Scanner;

public class TwProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String[][] map = new String[n][m];
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            String tmp = sc.nextLine();
            if (tmp.equals("0"))
                break;
            list.add(tmp);
        }
        String[] strs = new String[list.size()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = list.get(i);
        }
        way(strs, map, n, m);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.println(map[i][j]);
            }
        }
    }

    private static void way(String[] strs, String[][] map, int n, int m) {
        int pointRow = n - 1, pointCol = 0;
        boolean direction = true;
        rebuild(map, pointRow, pointCol, strs[1]);
        pointRow -= 2;
        for (int i = 2; i < strs.length; i++) {
            if (direction) {
                while (pointRow <= n - 1 && pointCol <= m - 1) {
                    rebuild(map, pointRow, pointCol, strs[i]);
                    pointRow += 1;
                    pointCol += 1;
                }
                direction = false;
                if (pointRow == n - 1)
                    pointRow -= 2;
                else if (pointCol == n - 1)
                    pointCol -= 2;
            } else {
                while (pointRow >= 0 && pointCol >= 0) {
                    rebuild(map, pointRow, pointCol, strs[i]);
                    pointRow -= 1;
                    pointCol -= 1;
                }
                direction = true;
                if (pointRow == 0)
                    pointRow += 2;
                else if (pointCol == 0)
                    pointCol += 2;
            }
        }
    }

    private static void rebuild(String[][] map, int pointRow, int pointCol, String pointScan) {
        for (int i = 0; i < pointScan.length(); i++) {
            char tmp = pointScan.charAt(i);
            if (tmp == '-')
                continue;
            if (i == 0)
                map[pointRow][pointCol] = String.valueOf(tmp);
            else if (i == 1)
                map[pointRow - 1][pointCol] = String.valueOf(tmp);
            else if (i == 2)
                map[pointRow][pointCol + 1] = String.valueOf(tmp);
            else if (i == 3)
                map[pointRow + 1][pointCol] = String.valueOf(tmp);
            else if (i == 4)
                map[pointRow][pointCol - 1] = String.valueOf(tmp);
        }
    }
}
