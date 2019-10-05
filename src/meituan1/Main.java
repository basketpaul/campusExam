package meituan1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = null, n2 = null;
        if (sc.hasNextLine()) {
            n1 = sc.nextLine();
        }
        if (sc.hasNextLine()) {
            n2 = sc.nextLine();
        }
        System.out.println(sum(n1, n2));
    }

    public static String sum(String n1, String n2) {
        BigInteger num1 = new BigInteger(n1);
        BigInteger num2 = new BigInteger(n2);
        BigInteger ret = num1.add(num2);
        return ret.toString();
    }
}
