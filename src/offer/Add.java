package offer;

public class Add {
    public static void main(String[] args) {

    }

    private static int add(int num1, int num2) {
        return num2 == 0 ? num1 : add((num1 ^ num2), (num1 & num2 << 1));
    }
}
