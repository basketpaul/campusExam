package aiqiyi;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1)
                cnt++;
        }
        BigInteger ret = new BigInteger("1");
        for (int i = n - cnt; i <= n - 1; i++) {
            String tmp = String.valueOf(i);
            BigInteger t = new BigInteger(tmp);
            ret = ret.multiply(t);
        }
        BigInteger sub = new BigInteger("1");
        for (long i = 1; i <= cnt; i++) {
            String tmp = String.valueOf(i);
            BigInteger t = new BigInteger(tmp);
            sub = sub.multiply(t);
        }
        ret = ret.divide(sub);
        BigInteger t = new BigInteger("1000000007");
        BigInteger[] bis = ret.divideAndRemainder(t);
        System.out.println(bis[1]);
    }
}
