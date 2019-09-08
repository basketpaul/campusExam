package huiding;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        byte[] base = str.getBytes(StandardCharsets.UTF_8);
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < base.length; i += 6) {
            byte[] tmp = new byte[6];
            int pos = 0;
            if (i + 6 < base.length) {
                for (int j = i; j < i + 6; j++)
                    tmp[pos++] = base[j];
            } else {
                for (int j = i; j < base.length; j++)
                    tmp[pos++] = base[j];
            }
            ret.append(Base64.getEncoder().encodeToString(tmp));
        }
        System.out.println(ret);
        String base64 = Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
        System.out.println(base64);

    }
}
