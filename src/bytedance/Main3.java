package bytedance;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] play = new int[4][4];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                play[row][col] = sc.nextInt();
            }
        }
        if (n == 1)
            up(play);
        if (n == 2)
            down(play);
        if (n == 3)
            left(play);
        if (n == 4)
            right(play);
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(play[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static void right(int[][] play) {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 0; j--) {
                for (int y = j - 1; y >= 0; y--) {
                    if (play[i][y] > 0) {
                        if (play[i][j] <= 0) {
                            play[i][j] = play[i][y];
                            play[i][y] = 0;
                        }
                    } else if (play[i][j] == play[i][y]) {
                        play[i][j] = play[i][j] * 2;
                        play[i][y] = 0;
                    }
                }
            }
        }
    }

    private static void up(int[][] play) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                for (int x = i + 1; x < 4; x++) {
                    if (play[x][j] > 0) {
                        if (play[i][j] <= 0) {
                            play[i][j] = play[x][j];
                            play[x][j] = 0;
                        }
                    } else if (play[i][j] == play[x][j]) {
                        play[i][j] = play[i][j] * 2;
                        play[x][j] = 0;
                    }
                }
            }
        }
    }

    private static void down(int[][] play) {
        for (int j = 0; j < 4; j++) {
            for (int i = 3; i >= 0; i--) {
                for (int x = i - 1; x >= 0; x--) {
                    if (play[x][j] > 0) {
                        if (play[i][j] <= 0) {
                            play[i][j] = play[x][j];
                            play[x][j] = 0;
                        }
                    } else if (play[i][j] == play[x][j]) {
                        play[i][j] = play[i][j] * 2;
                        play[x][j] = 0;
                    }
                }
            }
        }
    }


    private static void left(int[][] play) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int y = j + 1; y < 4; y++) {
                    if (play[i][y] > 0) {
                        if (play[i][j] <= 0) {
                            play[i][j] = play[i][y];
                            play[i][y] = 0;
                            y = j + 1;
                        }
                    } else if (play[i][j] == play[i][y]) {
                        play[i][j] = play[i][j] * 2;
                        play[i][y] = 0;
                    }
                }
            }
        }
    }
}
